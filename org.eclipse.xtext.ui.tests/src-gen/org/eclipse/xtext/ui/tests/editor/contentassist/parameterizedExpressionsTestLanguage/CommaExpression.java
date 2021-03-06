/**
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comma Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.CommaExpression#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedExpressionsTestLanguagePackage#getCommaExpression()
 * @model
 * @generated
 */
public interface CommaExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedExpressionsTestLanguagePackage#getCommaExpression_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExprs();

} // CommaExpression
