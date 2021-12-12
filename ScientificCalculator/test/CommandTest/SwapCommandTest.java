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
import Command.CommandInvoker;
import Command.CommandInvoker;
import Command.CommandInvoker;
import it.unisa.SE.project.*;
/**
 *
 * @author User
 */
public class SwapCommandTest {
    
    private ComplexNumber number1;
    private ComplexNumber number2;
    
    private Calculator calc;
    private CommandInvoker inv; 
    
    public SwapCommandTest() {
    }
    
   
    @Before
    public void setUp() {
        calc = Calculator.getCalculator();
        inv = new CommandInvoker(calc);
        number1 = new ComplexNumber(7.0, 15.0);
        number2 = new ComplexNumber(-3.0, 9.0);
    }
    
    
    @After
    public void tearDown() {
    }
    
     public void insertValues() {
        Model.insertComplexNumber(number1);
        Model.insertComplexNumber(number2);
    }

    /**
     * Test of execute method, of class SwapCommand.
     */
    @Test
    public void testExecute() throws Exception {
        this.insertValues();
        inv.swap.execute();
        assertEquals(number1, calc.getModel().getStack().pop());
            
    }
    
}
