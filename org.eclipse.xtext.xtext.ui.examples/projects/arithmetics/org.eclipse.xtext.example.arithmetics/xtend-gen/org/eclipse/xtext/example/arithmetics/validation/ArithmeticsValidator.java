/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.example.arithmetics.validation;

import com.google.inject.Inject;
import java.math.BigDecimal;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.example.arithmetics.arithmetics.ArithmeticsPackage;
import org.eclipse.xtext.example.arithmetics.arithmetics.Div;
import org.eclipse.xtext.example.arithmetics.arithmetics.Evaluation;
import org.eclipse.xtext.example.arithmetics.arithmetics.Expression;
import org.eclipse.xtext.example.arithmetics.arithmetics.FunctionCall;
import org.eclipse.xtext.example.arithmetics.arithmetics.NumberLiteral;
import org.eclipse.xtext.example.arithmetics.interpreter.Calculator;
import org.eclipse.xtext.example.arithmetics.validation.AbstractArithmeticsValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * Custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ArithmeticsValidator extends AbstractArithmeticsValidator {
  @Inject
  private Calculator calculator;
  
  @Check
  public void checkDivByZero(final Div div) {
    final BigDecimal bigDecimal = this.calculator.evaluate(div.getRight());
    double _doubleValue = bigDecimal.doubleValue();
    boolean _equals = (_doubleValue == 0.0);
    if (_equals) {
      this.error("Division by zero detected.", ArithmeticsPackage.Literals.DIV__RIGHT);
    }
  }
  
  public final static String NORMALIZABLE = "normalizable-expression";
  
  @Check
  public void checkNormalizable(final Expression expr) {
    if (((expr instanceof NumberLiteral) || (expr instanceof FunctionCall))) {
      return;
    }
    Evaluation _containerOfType = EcoreUtil2.<Evaluation>getContainerOfType(expr, Evaluation.class);
    boolean _tripleNotEquals = (_containerOfType != null);
    if (_tripleNotEquals) {
      return;
    }
    final TreeIterator<EObject> contents = expr.eAllContents();
    while (contents.hasNext()) {
      {
        final EObject next = contents.next();
        if ((next instanceof FunctionCall)) {
          return;
        }
      }
    }
    final BigDecimal decimal = this.calculator.evaluate(expr);
    int _length = decimal.toString().length();
    boolean _lessEqualsThan = (_length <= 8);
    if (_lessEqualsThan) {
      this.warning(
        (("Expression could be normalized to constant \'" + decimal) + "\'"), 
        null, 
        ValidationMessageAcceptor.INSIGNIFICANT_INDEX, 
        ArithmeticsValidator.NORMALIZABLE, 
        decimal.toString());
    }
  }
}
