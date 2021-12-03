/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.SE.project.test;

import ProjectException.NotVariableKeyException;
import ProjectException.UnderTwoElementsException;
import ProjectException.VariableValueException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import it.unisa.SE.project.Variables;
import it.unisa.SE.project.ComplexNumber;
/**
 *
 * @author Michela
 */
public class VariablesTest {
    private Variables var;
    private ComplexNumber num1, num2;
    public VariablesTest() {
       
    }
    
  
    @Before
    public void setUp() {
        var = new Variables();
        num1 = new ComplexNumber(7.5, 3.5);
        num2 = new ComplexNumber(2.7, 0);
    }
    
  
     /**
     * Test of setVariableValue method 
     * @throws NotVariableKeyException
     * @throws VariableValueException
     */
    @Test
    public void testSetVariableValue() throws NotVariableKeyException,VariableValueException {
        
        var.setVariableValue('a', num1);
        assertEquals(num1, var.getVariableValue('a'));
        
        var.setVariableValue('f', num2);
        assertEquals(num2, var.getVariableValue('f'));
    }
    
    /**
     * Test if the key is not a letter of the English alphabet
     * @throws NotVariableKeyException
     */
    @Test(expected = NotVariableKeyException.class)
    public void testSetVariableValueNotAlphabetic() throws NotVariableKeyException   {
        var.setVariableValue('1', num1);
    }
    
    
    /**
     * Test of getVariableValue method
     * @throws VariableValueException
     */
    @Test
    public void testGetVariableValue() throws VariableValueException {
        
        var.setVariableValue('h', num1);
        var.setVariableValue('i', num2);
        assertEquals(num1, var.getVariableValue('h'));
        assertEquals(num2, var.getVariableValue('i'));
        
        var.setVariableValue('c', num2);
        assertEquals(num2, var.getVariableValue('c'));
 
    }
    
    
    /**
     * Test if the value is null of the variables
     * @throws VariableValueException
     */
    @Test(expected = VariableValueException.class)
    public void testGetVariableValueValueNull() throws VariableValueException  {
        assertEquals(null, var.getVariableValue('c'));
        
    }
    
    
    
    
    
}
