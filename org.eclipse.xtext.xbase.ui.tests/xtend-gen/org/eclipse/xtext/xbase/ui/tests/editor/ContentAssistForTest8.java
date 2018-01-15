/**
 * Copyright (c) 2014, 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.ui.tests.editor;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.ui.tests.editor.ContentAssistInBlockTest;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class ContentAssistForTest8 extends ContentAssistInBlockTest {
  @Override
  protected String getPrefix() {
    return "for( var y = 1; x < 10; x++) {";
  }
  
  @Override
  protected String getSuffix() {
    return "}";
  }
  
  @Override
  protected String[] getKeywordsAndStatics() {
    final ArrayList<String> result = CollectionLiterals.<String>newArrayList(super.getKeywordsAndStatics());
    result.add("y");
    return ((String[])Conversions.unwrapArray(result, String.class));
  }
}
