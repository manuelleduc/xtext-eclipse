/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.embedded;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.texteditor.AbstractTextEditor;

/**
 * Maps an action definition id to an {@link StyledText} action.
 * 
 * Initially copied from IdMapEntry in {@link AbstractTextEditor}
 * 
 * @see org.eclipse.ui.texteditor.AbstractTextEditor
 * @since 2.3
 */
public class ActionDefinitionToStyledTextAction {

	/** The action id. */
	private String fActionId;
	/** The StyledText action. */
	private int fAction;

	/**
	 * Creates a new mapping.
	 * 
	 * @param actionId
	 *            the action id
	 * @param action
	 *            the StyledText action
	 */
	public ActionDefinitionToStyledTextAction(String actionId, int action) {
		fActionId = actionId;
		fAction = action;
	}

	/**
	 * Returns the action id.
	 * 
	 * @return the action id
	 */
	public String getActionId() {
		return fActionId;
	}

	/**
	 * Returns the action.
	 * 
	 * @return the action
	 */
	public int getAction() {
		return fAction;
	}
}