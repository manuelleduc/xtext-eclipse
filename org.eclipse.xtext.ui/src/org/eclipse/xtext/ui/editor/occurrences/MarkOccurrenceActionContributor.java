/*******************************************************************************
 * Copyright (c) 2011, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.occurrences;

import static com.google.common.collect.Maps.*;

import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.actions.AbstractToggleActionContributor;
import org.eclipse.xtext.ui.editor.actions.IActionContributor;
import org.eclipse.xtext.ui.internal.XtextPluginImages;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
@Singleton
public class MarkOccurrenceActionContributor extends AbstractToggleActionContributor implements IActionContributor {

	public static final String EDITOR_MARK_OCCURRENCES = "ui.editor.markOccurrences"; //$NON-NLS-1$

	@Inject
	private Provider<OccurrenceMarker> occurrenceMarkerProvider;

	private Map<XtextEditor, OccurrenceMarker> editor2marker = newHashMap();
	
	@Override
	protected Action getAction() {
		Action action = super.getAction();
		return action;
	}
	
	@Override
	public void contributeActions(XtextEditor editor) {
		OccurrenceMarker occurrenceMarker = editor2marker.get(editor);
		if(occurrenceMarker == null) {
			editor.setAction(getAction().getId(), getAction());
			IToolBarManager toolBarManager = editor.getEditorSite().getActionBars().getToolBarManager();
			if(toolBarManager.find(getAction().getId())==null) {
				ActionContributionItem item = new ActionContributionItem(getAction());
				item.setVisible(false);
				toolBarManager.add(item);				
			}
			occurrenceMarker = occurrenceMarkerProvider.get();
			occurrenceMarker.connect(editor, isPropertySet());
			editor2marker.put(editor, occurrenceMarker);
		}
	}

	@Override
	public void editorDisposed(XtextEditor editor) {
		OccurrenceMarker occurrenceMarker = editor2marker.get(editor);
		if(occurrenceMarker != null) {
			occurrenceMarker.disconnect(editor);
			editor2marker.remove(editor);
		}
	}

	@Override
	public String getPreferenceKey() {
		return EDITOR_MARK_OCCURRENCES;
	}

	@Override
	protected void stateChanged(boolean newState) {
		for(OccurrenceMarker occurrenceMarker: editor2marker.values()) {
			occurrenceMarker.setMarkOccurrences(newState);
		}
	}

	@Override
	protected void configureAction(Action action) {
		action.setText(Messages.MarkOccurrenceActionContributor_text);
		action.setDescription(Messages.MarkOccurrenceActionContributor_description);
		action.setToolTipText(Messages.MarkOccurrenceActionContributor_toolTipText);
		action.setImageDescriptor(XtextPluginImages.DESC_MARK_OCCURRENCES);
		action.setDisabledImageDescriptor(XtextPluginImages.DESC_MARK_OCCURRENCES_DISABLED);
		addPropertyChangeListener();
	}

}
