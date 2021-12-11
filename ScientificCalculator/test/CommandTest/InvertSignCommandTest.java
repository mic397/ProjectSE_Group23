/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CommandTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import it.unisa.SE.project.*;
import Command.CommandInvoker;
/**
 *
 * @author Michela
 */
public class InvertSignCommandTest {
   private Calculator calc;
   CommandInvoker inv;
    
    public InvertSignCommandTest() {
    }
    
    
    
    @Before
    public void setUp() {
        calc = Calculator.getCalculator();
        inv = new CommandInvoker(calc);
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void InvertSignCommandTest() throws Exception{
        ComplexNumber num = new ComplexNumber(2,0);
        
        calc.getModel().getStack().push(num);
        
        inv.invert.execute();
        ComplexNumber result= calc.getModel().getStack().pop();
        ComplexNumber expected = new ComplexNumber(-2,0);
        assertEquals(result,expected);
    }
}
