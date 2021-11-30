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

        double expected1 = 1.134169167;
        double expected2 = 1.892546881;
        double expected3 = -0.4993467217;
        double expected4 = 0;
        double expected5 = -1.570796327;
        double expected6 = -1.967875772;

        double delta = 0.3;

        assertEquals(expected1,arg1,delta);
        assertEquals(expected2, arg2, delta);
        assertEquals(expected3, arg3, delta);
        assertEquals(expected4, arg4, delta);
        assertEquals(expected5, arg5 , delta);
        assertEquals(expected6, arg6, delta);

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

        double expected1 = 16.55294536;
        double expected2 = 9.486832981;
        double expected3 = 12.52996409;
        double expected4 = 20.5;
        double expected5 = 7.5;
        double expected6 = 16.80773631;
        double expected7 = 0;

        double delta = 0.3;

        assertEquals(expected1, mod1, delta);
        assertEquals(expected2, mod2 , delta);
        assertEquals(expected3, mod3, delta);
        assertEquals(expected4, mod4, delta);
        assertEquals(expected5, mod5, delta);
        assertEquals(expected6, mod6 , delta);
        assertEquals(expected7, mod7, delta);
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
        ComplexNumber expected1 = new ComplexNumber(1.2666666666666666, -1.2);
        ComplexNumber actual1 = ComplexOperations.div(number1, number2);
        actual1.setReal(actual1.getReal());
        actual1.setImaginary(actual1.getImaginary());
        assertEquals(expected1, actual1);

        ComplexNumber expected2 = new ComplexNumber(-3.0, 9.0);
        ComplexNumber actual2 = ComplexOperations.div(number2, number10);
        actual2.setReal(actual2.getReal());
        actual2.setImaginary(actual2.getImaginary());
        assertEquals(expected2, actual2);

        ComplexNumber expected3 = new ComplexNumber(0.0, 2.73333333333333334);
        ComplexNumber actual3 = ComplexOperations.div(number4, number5);
        actual3.setReal(actual3.getReal());
        actual3.setImaginary(actual3.getImaginary());
        assertEquals(expected3, actual3);

        ComplexNumber expected4 = new ComplexNumber(0.41150442477876104, 0.17256637168141592);
        ComplexNumber actual4 = ComplexOperations.div(number5, number6);
        actual4.setReal(actual4.getReal());
        actual4.setImaginary(actual4.getImaginary());
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
