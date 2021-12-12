/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CommandTest;

import Command.Command;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import it.unisa.SE.project.*;
import Command.CommandInvoker;
import Command.PlusCommand;
import Command.UserDefinedCommand;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Michela
 */
public class UserDefinedCommandTest {
   private Calculator calc;
   private CommandInvoker inv;
   private UserDefinedCommand comm;
   private List<Command> comm1;
    public UserDefinedCommandTest() {
    }
    
    
    
    @Before
    public void setUp() {
        calc = Calculator.getCalculator();
        inv = new CommandInvoker(calc);
        comm1= new LinkedList<>();
        comm1.add(new PlusCommand(calc));
        comm = new UserDefinedCommand(comm1);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void UserDefinedCommandTest() throws Exception{
        ComplexNumber num = new ComplexNumber(2,0);
        ComplexNumber num1 = new ComplexNumber(3,5);
        calc.getModel().getStack().push(num);
        calc.getModel().getStack().push(num1);
        comm.execute();
        ComplexNumber expected = new ComplexNumber(5,5);
        ComplexNumber result= calc.getModel().getStack().pop();
        assertEquals(expected,result);
    }
}
