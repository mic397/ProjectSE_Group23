/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project.test;

import ProjectException.ArgumentNotDefinedException;
import ProjectException.UnderTwoElementsException;
import ProjectException.notAcceptableValueException;
import ProjectException.stackIsEmptyException;
import it.unisa.SE.project.Calculator;
import it.unisa.SE.project.ComplexNumber;
import it.unisa.SE.project.ComplexOperations;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 *
 * @author aniel
 */
public class CalculatorTest{

    private Calculator calculator;
    private ComplexNumber number1 = new ComplexNumber(7.0, 15.0);
    private ComplexNumber number2 = new ComplexNumber(-3.0, 9.0);

    public CalculatorTest() {
    }

    @Before
    public void setUp() {
        calculator = Calculator.getCalculator();
    }
    /**
     *
     * @throws ProjectException.ArgumentNotDefinedException
     * @throws ProjectException.stackIsEmptyException
     * @throws ProjectException.notAcceptableValueException
     */
    @Test
    public void testProcessInput() throws ArgumentNotDefinedException, NumberFormatException, ArithmeticException, UnderTwoElementsException, stackIsEmptyException, notAcceptableValueException {
        String num = "1+3j"; 
        calculator.processInput(num);
        ComplexNumber res = calculator.getModel().getStack().pop();
        assertEquals(res, new ComplexNumber(1, 3));
        String real = "0";
        calculator.processInput(real);
        res = calculator.getModel().getStack().pop();
        assertEquals(res, new ComplexNumber(0, 0));
        String imaginary = "j"; 
        calculator.processInput(imaginary);
        res = calculator.getModel().getStack().pop();
        assertEquals(res, new ComplexNumber(0, 1));
    }

    /**
     *
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testSumNull() throws stackIsEmptyException {
        calculator.getModel().getStack().clear();
        calculator.sum();
    }

    /**
     * @throws ProjectException.stackIsEmptyException
     */
    @Test
    public void testSum() throws stackIsEmptyException {
        calculator.getModel().getStack().push(number1);
        calculator.getModel().getStack().push(number2);
        ComplexNumber num = calculator.sum();
        assertEquals(num, ComplexOperations.sum(number1, number2));
    }

    /**
     *
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testSubNull() throws stackIsEmptyException {
        calculator.getModel().getStack().clear();
        calculator.sub();
    }

    /**
     * @throws ProjectException.stackIsEmptyException
     */
    @Test
    public void testSub() throws stackIsEmptyException {
        calculator.getModel().getStack().push(number1);
        calculator.getModel().getStack().push(number2);
        ComplexNumber num = calculator.sub();
        assertEquals(num, ComplexOperations.sub(number1, number2));
    }

    /**
     *
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testMulNull() throws stackIsEmptyException {
        calculator.getModel().getStack().clear();
        calculator.mul();
    }

    /**
     * @throws ProjectException.stackIsEmptyException
     */
    @Test
    public void testMul() throws stackIsEmptyException {
        calculator.getModel().getStack().push(number1);
        calculator.getModel().getStack().push(number2);
        ComplexNumber num = calculator.mul();
        assertEquals(num, ComplexOperations.mul(number1, number2));
    }

    /**
     *
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testDivNull() throws stackIsEmptyException {
        calculator.getModel().getStack().clear();
        calculator.div();
    }

    /**
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = ArithmeticException.class)
    public void testDivToZero() throws stackIsEmptyException {
        number1.setReal(0.);
        number1.setImaginary(0.);
        calculator.getModel().getStack().push(number2);
        calculator.getModel().getStack().push(number1);
        ComplexNumber num = calculator.div();
    }

    /**
     *
     * @throws ProjectException.stackIsEmptyException
     */
    @Test
    public void testDiv() throws stackIsEmptyException {
        number1.setImaginary(1.2);
        number1.setReal(1.1);
        calculator.getModel().getStack().push(number1);
        calculator.getModel().getStack().push(number2);
        ComplexNumber num = calculator.div();
        assertEquals(num, ComplexOperations.div(number1, number2));
    }
    
    /**
     * 
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testCheckDoubleOperationsNull(){
        calculator.getModel().getStack().clear();
        calculator.checkDoubleOperations();
    }
    
    /**
     * 
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testCheckDoubleOperationsOneElement(){
        calculator.getModel().getStack().push(number1);
        calculator.checkDoubleOperations();
    }
}
