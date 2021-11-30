/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.SE.project.test;

import ProjectException.ArgumentNotDefinedException;
import ProjectException.notAcceptableValueException;
import it.unisa.SE.project.ComplexNumber;
import it.unisa.SE.project.ComplexOperations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 

/**
 *
 * @author Michela
 */
public class ComplexOperationsTest {
    
    public ComplexOperationsTest() {
    }
    
    private ComplexNumber number1;
    private ComplexNumber number2;
    private ComplexNumber number3;
    private ComplexNumber number4;
    private ComplexNumber number5;
    private ComplexNumber number6;
    private ComplexNumber number7;
    private ComplexNumber number8;
    private ComplexNumber number9;
    private ComplexNumber number10;

    @Before
    public void setUp() {
        number1 = new ComplexNumber(7.0, 15.0);
        number2 = new ComplexNumber(-3.0, 9.0);
        number3 = new ComplexNumber(11.0, -6.0);
        number4 = new ComplexNumber(20.5, 0.0);
        number5 = new ComplexNumber(0.0, -7.5);
        number6 = new ComplexNumber(-6.5, -15.5);
        number7 = new ComplexNumber(0.0, 0.0);
        number8 = new ComplexNumber(1, 1);
        number9 = new ComplexNumber(2, 1);
        number10 = new ComplexNumber(1, 0);
    }

    @Test
    public void testSum() {
        ComplexNumber expected12 = new ComplexNumber(4.0, 24.0);
        ComplexNumber expected13 = new ComplexNumber(7.0, 7.5);
        ComplexNumber expected14 = new ComplexNumber(7, 15.0);
        ComplexNumber expected15 = new ComplexNumber(31.5, -6.0);
        ComplexNumber expected16 = new ComplexNumber(-6.5, -23.0);

        assertEquals(expected12, ComplexOperations.sum(number1, number2));
        assertEquals(expected13, ComplexOperations.sum(number1, number5));
        assertEquals(expected14, ComplexOperations.sum(number1, number7));
        assertEquals(expected15, ComplexOperations.sum(number3, number4));
        assertEquals(expected16, ComplexOperations.sum(number5, number6));

    }

    @Test
    public void testSub() {
        ComplexNumber expected12 = new ComplexNumber(10.0, 6.0);
        ComplexNumber expected13 = new ComplexNumber(7.0, 22.5);
        ComplexNumber expected14 = new ComplexNumber(7.0, 15.0);
        ComplexNumber expected15 = new ComplexNumber(-9.5, -6);
        ComplexNumber expected16 = new ComplexNumber(6.5, 8.0);

        assertEquals(expected12, ComplexOperations.sub(number1, number2));
        assertEquals(expected13, ComplexOperations.sub(number1, number5));
        assertEquals(expected14, ComplexOperations.sub(number1, number7));
        assertEquals(expected15, ComplexOperations.sub(number3, number4));
        assertEquals(expected16, ComplexOperations.sub(number5, number6));
    }

@Test
    public void testArg() throws ArgumentNotDefinedException {
        double arg1 = ComplexOperations.arg(number1);
        double arg2 = ComplexOperations.arg(number2);
        double arg3 = ComplexOperations.arg(number3);
        double arg4 = ComplexOperations.arg(number4);
        double arg5 = ComplexOperations.arg(number5);
        double arg6 = ComplexOperations.arg(number6);

        double expected1 = 1.134;
        double expected2 = 1.892;
        double expected3 = -0.499;
        double expected4 = 0;
        double expected5 = -1.570;
        double expected6 = -1.968;

        double delta = 0.5;

        assertEquals(expected1, Math.round(arg1 * 1000d) / 1000d, delta);
        assertEquals(expected2, Math.round(arg2 * 1000d) / 1000d, delta);
        assertEquals(expected3, Math.round(arg3 * 1000d) / 1000d, delta);
        assertEquals(expected4, Math.round(arg4 * 1000d) / 1000d, delta);
        assertEquals(expected5, Math.round(arg5 * 1000d) / 1000d, delta);
        assertEquals(expected6, Math.round(arg6 * 1000d) / 1000d, delta);

        assertTrue(arg1 <= Math.PI);
        assertTrue(arg1 > -Math.PI);
        assertTrue(arg2 <= Math.PI);
        assertTrue(arg2 > -Math.PI);
        assertTrue(arg3 <= Math.PI);
        assertTrue(arg3 > -Math.PI);
        assertTrue(arg4 <= Math.PI);
        assertTrue(arg4 > -Math.PI);
        assertTrue(arg5 <= Math.PI);
        assertTrue(arg5 > -Math.PI);
        assertTrue(arg6 <= Math.PI);
        assertTrue(arg6 > -Math.PI);
    }

    @Test
    public void testMod() {
        double mod1 = ComplexOperations.mod(number1);
        double mod2 = ComplexOperations.mod(number2);
        double mod3 = ComplexOperations.mod(number3);
        double mod4 = ComplexOperations.mod(number4);
        double mod5 = ComplexOperations.mod(number5);
        double mod6 = ComplexOperations.mod(number6);
        double mod7 = ComplexOperations.mod(number7);

        double expected1 = 16.552;
        double expected2 = 9.486;
        double expected3 = 12.529;
        double expected4 = 20.5;
        double expected5 = 7.5;
        double expected6 = 16.807;
        double expected7 = 0;

        double delta = 0.5;

        assertEquals(expected1, Math.round(mod1 * 1000d) / 1000d, delta);
        assertEquals(expected2, Math.round(mod2 * 1000d) / 1000d, delta);
        assertEquals(expected3, Math.round(mod3 * 1000d) / 1000d, delta);
        assertEquals(expected4, Math.round(mod4 * 1000d) / 1000d, delta);
        assertEquals(expected5, Math.round(mod5 * 1000d) / 1000d, delta);
        assertEquals(expected6, Math.round(mod6 * 1000d) / 1000d, delta);
        assertEquals(expected7, Math.round(mod7 * 1000d) / 1000d, delta);
    }

    @Test
    public void testSqrt() throws ArgumentNotDefinedException {
        ComplexNumber complex1 = ComplexOperations.sqrt(number1);
        ComplexNumber complex2 = ComplexOperations.sqrt(number2);
        ComplexNumber complex3 = ComplexOperations.sqrt(number3);
        ComplexNumber complex4 = ComplexOperations.sqrt(number4);
        ComplexNumber complex5 = ComplexOperations.sqrt(number5);

        ComplexNumber expected1 = new ComplexNumber(3.432, 2.186);
        ComplexNumber expected2 = new ComplexNumber(1.801, 2.499);
        ComplexNumber expected3 = new ComplexNumber(3.43, -0.875);
        ComplexNumber expected4 = new ComplexNumber(4.528, 0.0);
        ComplexNumber expected5 = new ComplexNumber(1.936, -1.936);

        assertEquals(expected1, complex1);
        assertEquals(expected2, complex2);
        assertEquals(expected3, complex3);
        assertEquals(expected4, complex4);
        assertEquals(expected5, complex5);
    }

    /**
     * /**
     * Verify that the multiplication between a complex number with real and
     * imaginary parts equal to zero and a complex number is null.
     *
     * Verify that the multiplication between a complex number and the neutral
     * value (with real part equals to one and imaginary part equal to zero) is
     * equal to the number itself
     */
    @Test
    public void testMul() {
        ComplexNumber expected1 = new ComplexNumber(-156.0, 18.0);
        ComplexNumber expected2 = new ComplexNumber(0.0, 0.0);
        ComplexNumber expected3 = new ComplexNumber(-133.25, -317.75);
        ComplexNumber expected4 = new ComplexNumber(-116.25, 48.75);
        ComplexNumber expected5 = new ComplexNumber(7.0, 15.0);

        assertEquals(expected1, ComplexOperations.mul(number1, number2));
        assertEquals(expected2, ComplexOperations.mul(number1, number7));
        assertEquals(expected3, ComplexOperations.mul(number4, number6));
        assertEquals(expected4, ComplexOperations.mul(number5, number6));
        assertEquals(expected5, ComplexOperations.mul(number1, number10));
    }

    @Test
    public void testDiv() {
        ComplexNumber expected1 = new ComplexNumber(1.267, -1.2);
        ComplexNumber actual1 = ComplexOperations.div(number1, number2);
        actual1.setReal(Math.round(actual1.getReal() * 1000d) / 1000d);
        actual1.setImaginary(Math.round(actual1.getImaginary() * 1000d) / 1000d);
        assertEquals(expected1, actual1);

        ComplexNumber expected2 = new ComplexNumber(-3.0, 9.0);
        ComplexNumber actual2 = ComplexOperations.div(number2, number10);
        actual2.setReal(Math.round(actual2.getReal() * 1000d) / 1000d);
        actual2.setImaginary(Math.round(actual2.getImaginary() * 1000d) / 1000d);
        assertEquals(expected2, actual2);

        ComplexNumber expected3 = new ComplexNumber(0.0, 2.733);
        ComplexNumber actual3 = ComplexOperations.div(number4, number5);
        actual3.setReal(Math.round(actual3.getReal() * 1000d) / 1000d);
        actual3.setImaginary(Math.round(actual3.getImaginary() * 1000d) / 1000d);
        assertEquals(expected3, actual3);

        ComplexNumber expected4 = new ComplexNumber(0.412, 0.173);
        ComplexNumber actual4 = ComplexOperations.div(number5, number6);
        actual4.setReal(Math.round(actual4.getReal() * 1000d) / 1000d);
        actual4.setImaginary(Math.round(actual4.getImaginary() * 1000d) / 1000d);
        assertEquals(expected4, actual4);
    }

    /**
     * Verify that the real and imaginary parts of the denominator are not equal
     * to zero -> Limit Case
     */
    @Test(expected = ArithmeticException.class)
    public void testDivToZero() {
        ComplexOperations.div(number1, number7);
    }

    /**
     * Verify that the multiplication, between a complex number with real and
     * imaginary parts equal to zero and a real number, is equal to complex
     * number with real and imaginary parts equal to zero.
     *
     * Verify that the multiplication, between a complex number with real and
     * imaginary parts not equal to zero and a real number equal to 1, is equal
     * to originary complex number
     */
    /*
    @Test
    public void testScale() {
        double val = 0;
        assertEquals(new ComplexNumber(0, 0), number1.scale(val));
        val = 1;
        assertEquals(number1, number1.scale(val));
        val = 2;
        number2.setReal(number1.getReal() * val);
        number2.setImaginary(number1.getImaginary() * val);
        assertEquals(number2, number1.scale(val));
    }
*/
    /**
     * Verify the corretness to calculate a complex number's conjugate
     */
    @Test //Conjugate
    public void testConjugate() {
        //re != 0 and im != 0 
        number1.setReal(2.0);
        number1.setImaginary(1.0);
        assertEquals(new ComplexNumber(number1.getReal(), number1.getImaginary() * (-1)), ComplexOperations.conjugate(number1));
        //re = 0 and im != 0
        number1.setReal(0.0);
        number1.setImaginary(1.0);
        assertEquals(new ComplexNumber(number1.getReal(), number1.getImaginary() * (-1)), ComplexOperations.conjugate(number1));
        //re != 0; im = 0
        number1.setReal(1.0);
        number1.setImaginary(0.0);
        assertEquals(number1, ComplexOperations.conjugate(number1));
    }

    /**
     * Verify that multplying by -1, it returns the original number
     */
    /*
    @Test
    public void testInvertSign() {
        number1.setReal(1.0);
        number1.setImaginary(2.0);
        assertEquals(number1.scale(-1), number1.invertSign());
        assertEquals(number1, number1.invertSign().invertSign());
    }
*/
    /**
     * Verify the corretness to calculate a complex number's reciprocal
     *
     * @throws notAcceptableValueException
     */
    @Test(expected = notAcceptableValueException.class)
    public void testReciprocalNull() throws notAcceptableValueException {
        //Limit case
        number1.setReal(0.0);
        number1.setImaginary(0.0);
        ComplexOperations.reciprocal(number1);
    }

    /**
     * Verify if z = 0 + 0i; the reciprocal of z -> (1/z) is not defined
     *
     * @throws notAcceptableValueException
     */
    @Test
    public void testReciprocal() throws notAcceptableValueException {
        //re != 0 and im = 0 
        number1.setReal(1.0);
        number1.setImaginary(1.0);
        number2.setReal(0.5);
        number2.setImaginary(-0.5);
        assertEquals(number2, ComplexOperations.reciprocal(number1));

        number1.setReal(2.0);
        number1.setImaginary(1.0);
        number2.setReal(1.0);
        number2.setImaginary(0.0);
        ComplexNumber res = ComplexOperations.div(number2, number1);
        assertEquals(res, ComplexOperations.reciprocal(number1));
    }

   
    
}
