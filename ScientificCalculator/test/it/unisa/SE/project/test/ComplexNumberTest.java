/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.SE.project.test;

import ProjectException.ArgumentNotDefinedException;
import it.unisa.SE.project.ComplexNumber;

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.ArithmeticException;

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
    private ComplexNumber number8;
    private ComplexNumber number9;
    private ComplexNumber number10;
    private ComplexNumber number11;

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
        number10= new ComplexNumber(1,0);
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
        ComplexNumber expected14 = new ComplexNumber(7.0, 15.0);
        ComplexNumber expected15 = new ComplexNumber(-9.5, -6);
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
    
    @Test
    public void testArg() throws ArgumentNotDefinedException{
        double arg1=ComplexNumber.arg(number1);
        double arg2=ComplexNumber.arg(number2);
        double arg3=ComplexNumber.arg(number3);
        double arg4=ComplexNumber.arg(number4);
        double arg5=ComplexNumber.arg(number5);
        double arg6=ComplexNumber.arg(number6);
        

        double expected1=1.134;
        double expected2=1.892;
        double expected3=-0.499;
        double expected4=0;
        double expected5=-1.570;
        double expected6=-1.968;
              
                
        double delta=0.5;
        
        assertEquals(expected1,Math.round(arg1*1000d)/1000d,delta);
        assertEquals(expected2,Math.round(arg2*1000d)/1000d,delta);
        assertEquals(expected3,Math.round(arg3*1000d)/1000d,delta);
        assertEquals(expected4,Math.round(arg4*1000d)/1000d,delta);
        assertEquals(expected5,Math.round(arg5*1000d)/1000d,delta);
        assertEquals(expected6,Math.round(arg6*1000d)/1000d,delta);
        
        assertTrue(arg1<=Math.PI);
        assertTrue(arg1>-Math.PI);
        assertTrue(arg2<=Math.PI);
        assertTrue(arg2>-Math.PI);
        assertTrue(arg3<=Math.PI);
        assertTrue(arg3>-Math.PI);
        assertTrue(arg4<=Math.PI);
        assertTrue(arg4>-Math.PI);
        assertTrue(arg5<=Math.PI);
        assertTrue(arg5>-Math.PI);
        assertTrue(arg6<=Math.PI);
        assertTrue(arg6>-Math.PI);
    }

    @Test
    public void testMod(){
        double mod1=ComplexNumber.mod(number1);
        double mod2=ComplexNumber.mod(number2);
        double mod3=ComplexNumber.mod(number3);
        double mod4=ComplexNumber.mod(number4);
        double mod5=ComplexNumber.mod(number5);
        double mod6=ComplexNumber.mod(number6);
        double mod7=ComplexNumber.mod(number7);

        double expected1=16.552;
        double expected2=9.486;
        double expected3=12.529;
        double expected4=20.5;
        double expected5=7.5;
        double expected6=16.807;
        double expected7=0;
        
        double delta=0.5;
        

        assertEquals(expected1,Math.round(mod1*1000d)/1000d,delta);
        assertEquals(expected2,Math.round(mod2*1000d)/1000d,delta);
        assertEquals(expected3,Math.round(mod3*1000d)/1000d,delta);
        assertEquals(expected4,Math.round(mod4*1000d)/1000d,delta);
        assertEquals(expected5,Math.round(mod5*1000d)/1000d,delta);
        assertEquals(expected6,Math.round(mod6*1000d)/1000d,delta);
        assertEquals(expected7,Math.round(mod7*1000d)/1000d,delta);
    }

    @Test 
    public void testSqrt() throws ArgumentNotDefinedException{ 
        ComplexNumber complex1=ComplexNumber.sqrt(number1); 
        ComplexNumber complex2=ComplexNumber.sqrt(number2); 
        ComplexNumber complex3=ComplexNumber.sqrt(number3); 
        ComplexNumber complex4=ComplexNumber.sqrt(number4); 
        ComplexNumber complex5=ComplexNumber.sqrt(number5); 
 
        ComplexNumber expected1=new ComplexNumber(3.432, 2.186); 
        ComplexNumber expected2=new ComplexNumber(1.801, 2.499); 
        ComplexNumber expected3=new ComplexNumber(3.43, -0.875); 
        ComplexNumber expected4=new ComplexNumber(4.528, 0.0); 
        ComplexNumber expected5=new ComplexNumber(1.936, -1.936); 
 
        assertEquals(expected1,complex1); 
        assertEquals(expected2,complex2); 
        assertEquals(expected3,complex3); 
        assertEquals(expected4,complex4); 
        assertEquals(expected5,complex5); 
    }
   
@Test 
    public void testMul(){ 
       
        ComplexNumber expected1=new ComplexNumber(-156.0, 18.0); 
        ComplexNumber expected2=new ComplexNumber(0.0, 0.0); 
        ComplexNumber expected3=new ComplexNumber(-133.25,-317.75 ); 
        ComplexNumber expected4=new ComplexNumber( -116.25, 48.75); 
        ComplexNumber expected5=new ComplexNumber(7.0,15.0 ); 
         
         
        assertEquals(expected1, ComplexNumber.mul(number1, number2)); 
        assertEquals(expected2, ComplexNumber.mul(number1, number7)); 
        assertEquals(expected3, ComplexNumber.mul(number4, number6)); 
        assertEquals(expected4, ComplexNumber.mul(number5, number6)); 
        assertEquals(expected5, ComplexNumber.mul(number1, number10)); 
    }
    
    @Test
    public void testDiv(){
        ComplexNumber expected1=new ComplexNumber(1.267,-1.2);
        ComplexNumber actual1=ComplexNumber.div(number1, number2);
        actual1.setReal(Math.round(actual1.getReal()*1000d)/1000d);
        actual1.setImaginary(Math.round(actual1.getImaginary()*1000d)/1000d);
        assertEquals(expected1,actual1);
        
       
        ComplexNumber expected2=new ComplexNumber(-3.0,9.0);
        ComplexNumber actual2=ComplexNumber.div(number2, number10);
        actual2.setReal(Math.round(actual2.getReal()*1000d)/1000d);
        actual2.setImaginary(Math.round(actual2.getImaginary()*1000d)/1000d);
        assertEquals(expected2,actual2);
        
        
        ComplexNumber expected3=new ComplexNumber(0.0,2.733);
        ComplexNumber actual3=ComplexNumber.div(number4, number5);
        actual3.setReal(Math.round(actual3.getReal()*1000d)/1000d);
        actual3.setImaginary(Math.round(actual3.getImaginary()*1000d)/1000d);
        assertEquals(expected3,actual3);
        
        ComplexNumber expected4=new ComplexNumber(0.412,0.173);
        ComplexNumber actual4=ComplexNumber.div(number5, number6);
        actual4.setReal(Math.round(actual4.getReal()*1000d)/1000d);
        actual4.setImaginary(Math.round(actual4.getImaginary()*1000d)/1000d);
        assertEquals(expected4,actual4);
        
        
        assertThrows(ArithmeticException.class, () -> ComplexNumber.div(number1, number7));
    }


}
