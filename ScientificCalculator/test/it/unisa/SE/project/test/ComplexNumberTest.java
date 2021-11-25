/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.SE.project.test;

import it.unisa.SE.project.ComplexNumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Michela
 */
public class ComplexNumberTest {
public ComplexNumberTest() {
    }
     private ComplexNumber number1;
    private ComplexNumber number2;
    private ComplexNumber number3;
    private ComplexNumber number4;
    private ComplexNumber number5;
    private ComplexNumber number6;
    private ComplexNumber number7;
    
    
    @Before
    public void setUp() {
        number1 = new ComplexNumber(7.0, 15.0);
        number2 = new ComplexNumber(-3.0, 9.0);
        number3 = new ComplexNumber(11.0, -6.0);
        number4 = new ComplexNumber(20.5, 0.0);
        number5 = new ComplexNumber(0.0, -7.5);
        number6 = new ComplexNumber(-6.5, -15.5);
        number7 = new ComplexNumber(0.0, 0.0);
        
    }
    @Test 
    public void testSum() { 
        ComplexNumber expected12 = new ComplexNumber(4.0, 24.0); 
        ComplexNumber expected13 = new ComplexNumber(7.0, 7.5); 
        ComplexNumber expected14 = new ComplexNumber(7, 15.0); 
        ComplexNumber expected15 = new ComplexNumber(31.5, -6.0); 
        ComplexNumber expected16 = new ComplexNumber(-6.5, -23.0); 
         
         
        assertEquals(expected12, ComplexNumber.sum(number1, number2)); 
        assertEquals(expected13, ComplexNumber.sum(number1, number5)); 
        assertEquals(expected14, ComplexNumber.sum(number1, number7)); 
        assertEquals(expected15, ComplexNumber.sum(number3, number4)); 
        assertEquals(expected16, ComplexNumber.sum(number5, number6)); 
         
    }

  
     @Test
    public void testSub() {
        ComplexNumber expected12 = new ComplexNumber(10.0, 6.0);
        ComplexNumber expected13 = new ComplexNumber(7.0, 22.5);
        ComplexNumber expected14 = new ComplexNumber(7.0,15.0 );
        ComplexNumber expected15 = new ComplexNumber(-9.5,-6 );
        ComplexNumber expected16 = new ComplexNumber(6.5, 8.0);
        
        assertEquals(expected12, ComplexNumber.sub(number1, number2));
        assertEquals(expected13, ComplexNumber.sub(number1, number5));
        assertEquals(expected14, ComplexNumber.sub(number1, number7));
        assertEquals(expected15, ComplexNumber.sub(number3, number4));
        assertEquals(expected16, ComplexNumber.sub(number5, number6));
    }

   
   
    @Test
    public void testToString() {
        String expected = "5.0 + j9.0";
        ComplexNumber n = new ComplexNumber(5.0, 9.0);
        assertEquals(expected, n.toString());

        expected = "0.0 + j9.0";
        n = new ComplexNumber(0.0, 9.0);
        assertEquals(expected, n.toString());

        expected = "5.0";
        n = new ComplexNumber(5.0, 0.0);
        assertEquals(expected, n.toString());

        expected = "3.5 - j7.9";
        n.setReal(3.5);
        n.setImaginary(-7.9);
        assertEquals(expected, n.toString());

        expected = "-11.5 - j10.9";
        n.setReal(-11.5);
        n.setImaginary(-10.9);
        assertEquals(expected, n.toString());

        expected = "-3.0 + j5.7";
        n.setReal(-3.0);
        n.setImaginary(5.7);
        assertEquals(expected, n.toString());

    }
    
    

}
