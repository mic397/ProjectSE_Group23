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
public class DivCommandTest {
   private Calculator calc;
   private CommandInvoker inv;
    
    public DivCommandTest() {
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
    public void DivCommandTest() throws Exception{
        ComplexNumber num = new ComplexNumber(2,0);
        ComplexNumber num1 = new ComplexNumber(3,5);
        calc.getModel().getStack().push(num);
        calc.getModel().getStack().push(num1);
        inv.div.execute();
        ComplexNumber result= calc.getModel().getStack().pop();
        ComplexNumber expected = new ComplexNumber(0.17647058823529413,-0.29411764705882354);
        assertEquals(result,expected);
    }
}
