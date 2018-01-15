/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.example.arithmetics.tests.interpreter;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.math.BigDecimal;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.arithmetics.arithmetics.Expression;
import org.eclipse.xtext.example.arithmetics.arithmetics.Statement;
import org.eclipse.xtext.example.arithmetics.interpreter.Calculator;
import org.eclipse.xtext.example.arithmetics.tests.ArithmeticsInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ArithmeticsInjectorProvider.class)
@SuppressWarnings("all")
public class CalculatorTest {
  @Inject
  private ParseHelper<org.eclipse.xtext.example.arithmetics.arithmetics.Module> parseHelper;
  
  @Inject
  private Calculator calculator;
  
  @Test
  public void testSimple() throws Exception {
    this.check(6, "1 + 2 + 3");
    this.check(0, "1 + 2 - 3");
    this.check(5, "1 * 2 + 3");
    this.check((-4), "1 - 2 - 3");
    this.check(1.5, "1 / 2 * 3");
  }
  
  @Test
  public void testFunction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("multiply(2,multiply(2, 3));");
      _builder.newLine();
      _builder.append("def multiply(a, b) : a * b;");
      _builder.newLine();
      this.check(12.0, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected void check(final double expected, final String expression) throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module test ");
    _builder.append(expression);
    final org.eclipse.xtext.example.arithmetics.arithmetics.Module module = this.parseHelper.parse(_builder);
    BigDecimal result = this.calculator.evaluate(IterableExtensions.<Expression>head(Iterables.<Expression>filter(IterableExtensions.<Statement>head(module.getStatements()).eContents(), Expression.class)));
    Assert.assertEquals(expected, result.doubleValue(), 0.0001);
  }
}
