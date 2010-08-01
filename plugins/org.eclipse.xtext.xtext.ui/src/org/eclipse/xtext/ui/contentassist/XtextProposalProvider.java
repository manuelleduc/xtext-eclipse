/*
* generated by Xtext
*/
package org.eclipse.xtext.ui.contentassist;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ReferencedMetamodel;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.naming.IQualifiedNameSupport;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.label.StylerFactory;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xtext.ui.editor.syntaxcoloring.SemanticHighlightingConfiguration;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class XtextProposalProvider extends AbstractXtextProposalProvider {
	
	@Inject
	private DefaultHighlightingConfiguration defaultLexicalHighlightingConfiguration;
	
	@Inject 
	private SemanticHighlightingConfiguration semanticHighlightingConfiguration;

	@Inject 
	private StylerFactory stylerFactory;
	
	public static class ClassifierPrefixMatcher extends PrefixMatcher {
		private PrefixMatcher delegate;

		private String delimiter;

		public ClassifierPrefixMatcher(PrefixMatcher delegate, IQualifiedNameSupport qualifiedNameSupport) {
			this.delegate = delegate;
			this.delimiter = qualifiedNameSupport.getDelimiter();
		}

		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			if (delegate.isCandidateMatchingPrefix(name, prefix))
				return true;
			if (name.indexOf(delimiter) >= 0) {
				String[] splitName = name.split(delimiter);
				if (splitName.length == 1)
					return false;
				String[] splitPrefix = prefix.split(delimiter);
				if (splitName.length < splitPrefix.length) {
					return false;
				}
				if (splitPrefix.length == 1) {
					return delegate.isCandidateMatchingPrefix(splitName[1], prefix);
				}
				if (!delegate.isCandidateMatchingPrefix(splitName[0], splitPrefix[0]))
					return false;
				return delegate.isCandidateMatchingPrefix(splitName[1], splitPrefix[1]);
			}
			return false;
		}

	}
	
	@Override
	public void completeGrammar_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		Resource resource = model.eResource();
		URI uri = resource.getURI();
		IPath path = new Path(uri.toPlatformString(true));
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		IProject project = file.getProject();
		IJavaProject javaProject = JavaCore.create(project);
		if (javaProject != null) {
			try {
				for (IPackageFragmentRoot packageFragmentRoot : javaProject.getPackageFragmentRoots()) {
					IPath packageFragmentRootPath = packageFragmentRoot.getPath();
					if (packageFragmentRootPath.isPrefixOf(path)) {
						IPath relativePath = path.makeRelativeTo(packageFragmentRootPath);
						relativePath = relativePath.removeFileExtension();
						String result = relativePath.toString();
						result = result.replace('/', '.');
						acceptor.accept(createCompletionProposal(result, context));
						return;
					}
				}
			} catch (JavaModelException ex) {
				// nothing to do
			}
		}
	}

	@Override
	public void completeGeneratedMetamodel_Alias(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof GeneratedMetamodel) {
			EPackage ePackage = ((GeneratedMetamodel) model).getEPackage();
			String name = ((GeneratedMetamodel) model).getName();
			createAliasProposal(context, acceptor, ePackage, name);
		}
		super.completeGeneratedMetamodel_Alias(model, assignment, context, acceptor);
	}

	private void createAliasProposal(ContentAssistContext context, ICompletionProposalAcceptor acceptor,
			EPackage ePackage, String proposal) {
		if (!Strings.isEmpty(proposal)) {
			ConfigurableCompletionProposal completionProposal = (ConfigurableCompletionProposal) createCompletionProposal(
					proposal, proposal + " - alias", ePackage != null ? getImage(ePackage) : null, context);
			if (completionProposal != null) {
				completionProposal.setPriority(completionProposal.getPriority() * 2);
				acceptor.accept(completionProposal);
			}
		}
	}

	@Override
	public void completeReferencedMetamodel_Alias(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof AbstractMetamodelDeclaration) {
			EPackage ePackage = ((AbstractMetamodelDeclaration) model).getEPackage();
			if (ePackage != null) {
				createAliasProposal(context, acceptor, ePackage, ePackage.getName());
				createAliasProposal(context, acceptor, ePackage, ePackage.getNsPrefix());
			}
		}
		super.completeReferencedMetamodel_Alias(model, assignment, context, acceptor);
	}

	@Override
	protected StyledString getKeywordDisplayString(Keyword keyword) {
		return stylerFactory.createFromXtextStyle(keyword.getValue(), defaultLexicalHighlightingConfiguration.keywordTextStyle());
	}

	@Override
	protected StyledString getStyledDisplayString(EObject element, String qualifiedName, String shortName) {
		StyledString styledDisplayString = super.getStyledDisplayString(element, qualifiedName, shortName);
		if (element instanceof ParserRule && GrammarUtil.isDatatypeRule((ParserRule) element)) {
			styledDisplayString = stylerFactory.createFromXtextStyle(styledDisplayString.getString(),
					semanticHighlightingConfiguration.dataTypeRule());
		}
		return styledDisplayString;
	}

	@Override
	protected String getDisplayString(EObject element, String proposal, String shortName) {
		if (element instanceof AbstractMetamodelDeclaration) {
			AbstractMetamodelDeclaration decl = (AbstractMetamodelDeclaration) element;
			if (!Strings.isEmpty(decl.getAlias()))
				return decl.getAlias();
		} else if (element instanceof EPackage) {
			EPackage pack = (EPackage) element;
			return pack.getName() + " - " + pack.getNsURI();
		}
		return super.getDisplayString(element, proposal, shortName);
	}

	/**
	 * Not a full featured solution for the computation of available structural features, but it is sufficient for some
	 * interesting 80%.
	 */
	@Override
	public void completeAssignment_Feature(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		AbstractRule rule = EcoreUtil2.getContainerOfType(model, AbstractRule.class);
		EClassifier type = rule.getType().getClassifier();
		if (type instanceof EClass) {
			List<EStructuralFeature> features = ((EClass) type).getEAllStructuralFeatures();
			completeStructuralFeatures(context, acceptor, features);
		}
		super.completeAssignment_Feature(model, assignment, context, acceptor);
	}

	private void completeStructuralFeatures(ContentAssistContext context, ICompletionProposalAcceptor acceptor,
			Iterable<? extends EStructuralFeature> features) {
		if (features != null) {
			Function<IEObjectDescription, ICompletionProposal> factory = getProposalFactory("ID", context);
			for (EStructuralFeature feature : features) {
				IEObjectDescription description = EObjectDescription.create(feature.getName(), feature);
				ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) factory.apply(description);
				if (proposal != null)
					proposal.setPriority(proposal.getPriority() * 2);
				acceptor.accept(proposal);
			}
		}
	}

	@Override
	public void completeAction_Feature(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		Action action = EcoreUtil2.getContainerOfType(model, Action.class);
		if (action != null && action.getType() != null) {
			EClassifier classifier = action.getType().getClassifier();
			if (classifier instanceof EClass) {
				List<EReference> containments = ((EClass) classifier).getEAllContainments();
				completeStructuralFeatures(context, acceptor, containments);
			}
		}
		super.completeAction_Feature(model, assignment, context, acceptor);
	}

	@Override
	public void completeTypeRef_Classifier(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		Grammar grammar = GrammarUtil.getGrammar(model);
		ContentAssistContext myContext = context.copy();
		myContext.setMatcher(new ClassifierPrefixMatcher(context.getMatcher(), getQualifiedNameSupport()));
		if (model instanceof TypeRef) {
			CompositeNode node = NodeUtil.getNodeAdapter(model).getParserNode();
			int offset = node.getOffset();
			Region replaceRegion = new Region(offset, myContext.getReplaceRegion().getLength()
					+ myContext.getReplaceRegion().getOffset() - offset);
			myContext.setReplaceRegion(replaceRegion);
			myContext.setLastCompleteNode(node);
			StringBuilder availablePrefix = new StringBuilder(4);
			for (LeafNode leaf : node.getLeafNodes()) {
				if (leaf.getGrammarElement() != null && !leaf.isHidden()) {
					if ((leaf.getTotalLength() + leaf.getTotalOffset()) < context.getOffset())
						availablePrefix.append(leaf.getText());
					else
						availablePrefix
								.append(leaf.getText().substring(0, context.getOffset() - leaf.getTotalOffset()));
				}
				if (leaf.getTotalOffset() >= context.getOffset())
					break;
			}
			myContext.setPrefix(availablePrefix.toString());
		}
		for (AbstractMetamodelDeclaration declaration : grammar.getMetamodelDeclarations()) {
			if (declaration.getEPackage() != null) {
				createClassifierProposals(declaration, model, myContext, acceptor);
			}
		}
	}

	private void createClassifierProposals(AbstractMetamodelDeclaration declaration, EObject model,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String alias = declaration.getAlias();
		String prefix = "";
		if (!Strings.isEmpty(alias)) {
			prefix = getValueConverter().toString(alias, "ID") + getQualifiedNameSupport().getDelimiter();
		}
		boolean createDatatypeProposals = !(model instanceof AbstractElement) && modelOrContainerIs(model, AbstractRule.class); 
		boolean createEnumProposals = !(model instanceof AbstractElement) && modelOrContainerIs(model, EnumRule.class);
		boolean createClassProposals = modelOrContainerIs(model, ParserRule.class, CrossReference.class, Action.class); 
		Function<IEObjectDescription, ICompletionProposal> factory = getProposalFactory(null, context);
		for (EClassifier classifier : declaration.getEPackage().getEClassifiers()) {
			if (classifier instanceof EDataType && createDatatypeProposals
					|| classifier instanceof EEnum && createEnumProposals
					|| classifier instanceof EClass && createClassProposals) {
				String proposalString = prefix + getValueConverter().toString(classifier.getName(), "ID");
				IEObjectDescription description = EObjectDescription.create(proposalString, classifier);
				ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) factory.apply(description);
				if (proposal != null) {
					if (!Strings.isEmpty(prefix))
						proposal.setDisplayString(classifier.getName() + " - " + alias);
					proposal.setPriority(proposal.getPriority() * 2);
					proposal.setDisplayString(stylerFactory.createFromXtextStyle(proposal.getDisplayString(),
							semanticHighlightingConfiguration.typeReference()));
				}
				acceptor.accept(proposal);
			}
		}
	}
	
	private boolean modelOrContainerIs(EObject model, Class<?>... types) {
		for(Class<?> type: types) {
			if (type.isInstance(model) || type.isInstance(model.eContainer()))
				return true;
		}
		return false;
	}

	@Override
	public void complete_ParserRule(EObject model, org.eclipse.xtext.RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeParserRule(model, context, acceptor);
		super.complete_ParserRule(model, ruleCall, context, acceptor);
	}

	@Override
	public void completeParserRule_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		completeParserRule(model, context, acceptor);
		super.completeParserRule_Name(model, assignment, context, acceptor);
	}

	private void completeParserRule(EObject model, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		final Grammar grammar = GrammarUtil.getGrammar(model);
		for (AbstractMetamodelDeclaration metamodelDeclaration : grammar.getMetamodelDeclarations()) {
			if (metamodelDeclaration instanceof ReferencedMetamodel) {
				ReferencedMetamodel referencedMetamodel = (ReferencedMetamodel) metamodelDeclaration;
				EPackage ePackage = referencedMetamodel.getEPackage();
				if (ePackage != null) {
					for (EClassifier eClassifier : ePackage.getEClassifiers()) {
						if (isProposeParserRule(eClassifier, grammar)) {
							String proposal = eClassifier.getName();
							String metamodelAlias = referencedMetamodel.getAlias();
							if (metamodelAlias != null) {
								proposal = proposal + " returns "
									+ metamodelAlias + "::" + eClassifier.getName();
							}
							proposal = proposal + ": \n;\n";
							ConfigurableCompletionProposal completionProposal = (ConfigurableCompletionProposal) createCompletionProposal(
									proposal, eClassifier.getName() + " - parser rule", getImage(XtextFactory.eINSTANCE
											.createParserRule()), context);
							if (completionProposal != null) {
								completionProposal.setCursorPosition(proposal.length() - 3);
								acceptor.accept(completionProposal);
							}
						}
					}
				}
			}
		}
	}

	private boolean isProposeParserRule(EClassifier eClassifier, Grammar grammar) {
		if (eClassifier instanceof EDataType && !((EDataType) eClassifier).isSerializable()) {
			return false;
		}
		Iterable<EClassifier> allRuleNames = Iterables.transform(GrammarUtil.allParserRules(grammar),
				new Function<ParserRule, EClassifier>() {
					public EClassifier apply(ParserRule from) {
						return from.getType().getClassifier();
					}
				});
		return !Iterables.contains(allRuleNames, eClassifier);

	}
}
