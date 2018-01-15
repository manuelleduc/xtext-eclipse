/**
 * Copyright (c) 2014, 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.tasks.preferences;

import java.util.function.Consumer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.tasks.PreferenceTaskTagProvider;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;

/**
 * @author Stefan Oehme - Initial contribution and API
 */
@SuppressWarnings("all")
public class TaskTagPreferenceInitializer implements IPreferenceStoreInitializer {
  @Override
  public void initialize(final IPreferenceStoreAccess access) {
    final IPreferenceStore store = access.getWritablePreferenceStore();
    final Consumer<PreferenceKey> _function = (PreferenceKey it) -> {
      store.setDefault(it.getId(), it.getDefaultValue());
    };
    PreferenceTaskTagProvider.KEYS.forEach(_function);
  }
}
