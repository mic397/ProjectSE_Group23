/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project.test;

import ProjectException.ArgumentNotDefinedException;
import ProjectException.UnderOneElementException;
import ProjectException.UnderTwoElementsException;
import ProjectException.VariableValueException;
import ProjectException.notAcceptableValueException;
import ProjectException.stackIsEmptyException;
import it.unisa.SE.project.Calculator;
import it.unisa.SE.project.ComplexNumber;
import it.unisa.SE.project.ComplexOperations;
import it.unisa.SE.project.Variables;
import it.unisa.SE.project.Model;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aniel
 */
public class CalculatorTest {

    private Calculator calculator;
    private Variables var;
    private ArrayList<Character> letters;
    private ComplexNumber number1 = new ComplexNumber(7.0, 15.0);
    private ComplexNumber number2 = new ComplexNumber(-3.0, 9.0);
    private ComplexNumber number3 = new ComplexNumber(10, -9.0);
    private ComplexNumber number4 = new ComplexNumber(0 , 9.0);
    private ComplexNumber number5 = new ComplexNumber(20.0 , 0);
    public CalculatorTest() {
    }

    @Before
    public void setUp() {
        calculator = Calculator.getCalculator();
        var = new Variables();
        
        letters = new ArrayList<>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('f');
        letters.add('g');
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
    public void testCheckDoubleOperationsNull() {
        calculator.getModel().getStack().clear();
        calculator.checkDoubleOperations();
    }

    /**
     *
     */
    @Test(expected = UnderTwoElementsException.class)
    public void testCheckDoubleOperationsOneElement() {
        calculator.getModel().getStack().push(number1);
        calculator.checkDoubleOperations();
    }

    /**
     * @throws ProjectException.UnderOneElementException
     */
    @Test(expected = UnderOneElementException.class)
    public void testCheckOneOperation() throws UnderOneElementException {
        calculator.getModel().getStack().clear();
        calculator.checkOneOperation();
    }

    /**
     *
     * @throws ProjectException.UnderOneElementException
     * @throws ProjectException.stackIsEmptyException
     */
    @Test
    public void testInvertSign() throws UnderOneElementException, stackIsEmptyException {
        number1.setImaginary(1.2);
        number1.setReal(1.1);
        calculator.getModel().getStack().push(number1);
        ComplexNumber res = calculator.invertSign();
        assertEquals(ComplexOperations.invertSign(number1), res);
    }

    /**
     *
     * @throws ArgumentNotDefinedException
     * @throws stackIsEmptyException
     */
      @Test
    public void testSqrt() throws stackIsEmptyException, ArgumentNotDefinedException{
        calculator.getModel().getStack().push(number1);
        calculator.getModel().getStack().push(number3);
         ComplexNumber expected1 = new ComplexNumber(3.424,-1.314);
        assertEquals(expected1, ComplexOperations.sqrt(number3));
        
        calculator.getModel().getStack().push(number2);
        calculator.getModel().getStack().push(number4);
        ComplexNumber expected2 = new ComplexNumber(2.121,2.121);
        assertEquals(expected2, ComplexOperations.sqrt(number4));
        
        calculator.getModel().getStack().push(number3);
        calculator.getModel().getStack().push(number5);
        ComplexNumber expected3 = new ComplexNumber(4.472,0);
        assertEquals(expected3, ComplexOperations.sqrt(number5));
      
    }
    
    
    /**
     * Test of saveIntoVariable
     * @throws stackIsEmptyException
     * @throws VariableValueException
     */
    @Test
    public void testSaveIntoVariable() throws stackIsEmptyException,VariableValueException {
        
         calculator.getModel().getStack().push(number2);
         calculator.saveIntoVariable(letters.get(3));
         ComplexNumber number = calculator.getModel().getFirstComplexNumber();
         ComplexNumber var1 = calculator.getVar().getVariableValue(letters.get(3));
         assertEquals(number2,var1);
        
    }
    
    /**
     *
     * @throws stackIsEmptyException
     * 
     */
    @Test(expected = stackIsEmptyException.class)
    public void testSaveIntoVariablestackIsEmpty() throws stackIsEmptyException {
        calculator.getModel().getStack().clear();
        char variable = 'f';
        calculator.saveIntoVariable(variable);
    
    }
    
    /**
     * Test of saveIntoStack
     *@throws stackIsEmptyException
     * @throws VariableValueException
     */
    @Test
    public void testSaveIntoStack() throws VariableValueException, stackIsEmptyException {
        
         calculator.getVar().setVariableValue(letters.get(4), number1);
         calculator.saveIntoStack(letters.get(4));
         ComplexNumber number = calculator.getModel().getFirstComplexNumber();
         ComplexNumber var1 = calculator.getVar().getVariableValue(letters.get(4));
         assertEquals(number1,var1);
        
    }
    
    /**
     * Test of addToVariable
     * @throws stackIsEmptyException
     * @throws VariableValueException
     */
    @Test
    public void testAddToVariable() throws stackIsEmptyException, VariableValueException {
        calculator.getModel().getStack().push(number1);
        calculator.getVar().setVariableValue(letters.get(5), number1);
        calculator.addToVariable(letters.get(5));
        ComplexNumber num2 = calculator.getVar().getVariableValue(letters.get(5));
        calculator.saveIntoStack(letters.get(5));
        ComplexNumber num = calculator.getModel().getFirstComplexNumber();
        assertEquals(num, num2);
      
    }
    
    
    
    /**
     *
     * @throws stackIsEmptyException
     * @throws VariableValueException
     */
    @Test(expected = VariableValueException.class)
    public void testMinToVariableNull() throws stackIsEmptyException, VariableValueException {
        calculator.getModel().getStack().clear();
        char letter = 'a';
        calculator.minToVariable(letter);
    }

    
    
    /**
     *
     * @throws stackIsEmptyException
     * @throws VariableValueException
     */
    @Test(expected = VariableValueException.class)
    public void testMinToVariable() throws stackIsEmptyException, VariableValueException {
        calculator.getModel().getStack().push(number1);
        var.setVariableValue(letters.get(0), number1);
        calculator.minToVariable(letters.get(0));
        ComplexNumber num = calculator.getModel().getStack().getFirst();
        assertEquals(num, var.getVariableValue(letters.get(0)));
        var.setVariableValue(letters.get(1), number2);
        calculator.minToVariable(letters.get(1));
        num = calculator.getModel().getStack().getFirst();
        assertEquals(number2, var.getVariableValue(letters.get(1)));
        var.setVariableValue(letters.get(2), new ComplexNumber(0,0));
        assertEquals(var.getVariableValue(letters.get(0)),var.getVariableValue(letters.get(2)));
    }
    
   
}
