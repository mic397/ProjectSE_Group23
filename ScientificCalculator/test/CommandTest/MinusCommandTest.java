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
public class MinusCommandTest {
   private Calculator calc;
   CommandInvoker inv;
    
    public MinusCommandTest() {
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
    public void MinusCommandTest() throws Exception{
        ComplexNumber num = new ComplexNumber(2,0);
        ComplexNumber num1 = new ComplexNumber(3,5);
        calc.getModel().getStack().push(num);
        calc.getModel().getStack().push(num1);
        inv.sub.execute();
        ComplexNumber result= calc.getModel().getStack().pop();
        ComplexNumber expected = new ComplexNumber(-1,-5);
        assertEquals(result,expected);
    }
}
