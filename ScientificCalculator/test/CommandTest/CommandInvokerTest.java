/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CommandTest;

import Command.CommandInvoker;
import it.unisa.SE.project.Calculator;
import it.unisa.SE.project.ComplexNumber;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michela
 */
public class CommandInvokerTest {
    private Calculator calc;
    private CommandInvoker inv;
    private Map<String,String> mapFile;
    private Map<String,String> mapComm;
    public CommandInvokerTest() {
    }
   
    @Before
    public void setUp() {
        calc = Calculator.getCalculator();
        inv = new CommandInvoker(calc);
        mapFile = new HashMap<>();
        mapComm = new HashMap<>();
    }
    
    @After
    public void tearDown() {
    }
    
     /**
     * Test of addCommand method
     * @throws Exception
     * 
     */
    @Test
    public void addCommandTest() throws Exception{
        String nameOp = "operation1";
        String command = "+ -";
        
        assertEquals(true,inv.addCommand(nameOp,command));
        
        
    }
    
   
     /**
     * Test of modifyCommand method
     * @throws Exception
     * 
     */
     @Test 
     public void modifyCommandTest() throws Exception{
        String nameOp = "operation1";
        String command = "+ -";
        String command2 = "-";
        inv.addCommand(nameOp, command);
        inv.modifyCommand(nameOp, command);
        mapComm.put(nameOp,command2);
        assertEquals(command2,mapComm.get(nameOp));
    }
    
     
     /**
     * Test of deleteCommand method
     * @throws Exception
     * 
     */
    @Test
    public void deleteCommandTest() throws Exception{
       String nameOp = "operation1";
       String nameOp1 = "operation2";
       String command = "+ -";
       inv.addCommand(nameOp, command);;
       assertEquals(true,inv.deleteCommand(nameOp));
       assertEquals(false, inv.deleteCommand(nameOp1)); //if the command is not saved 
       
   }
    
    
    
    
    
     /**
     * Test of executeCommand 
     * @throws Exception
     * 
     */
    @Test    
   public void executeCommandTest() throws Exception{ 
       ComplexNumber num = new ComplexNumber(2,0);
       ComplexNumber num1 = new ComplexNumber(3,5);
       ComplexNumber num2 = new ComplexNumber(3,5);
       calc.getModel().getStack().push(num);
       calc.getModel().getStack().push(num1);
       calc.getModel().getStack().push(num2);
       String nameOp = "operation1";
       String command = "+ -";
       inv.addCommand(nameOp, command);
       inv.executeCommand(nameOp);
       ComplexNumber expected = new ComplexNumber(-4,-10);
       ComplexNumber result= calc.getModel().getStack().pop();
       assertEquals(expected,result);
   }
    

}
