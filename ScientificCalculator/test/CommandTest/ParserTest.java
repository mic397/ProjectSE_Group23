/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CommandTest;

import Command.*;
import Command.CommandInvoker;
import Command.InsertCommand;
import Command.Parser;
import ProjectException.notAcceptableValueException;
import it.unisa.SE.project.*;
import it.unisa.SE.project.ComplexNumber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enza
 */
public class ParserTest {
    Parser pars;
    Calculator cal;
    CommandInvoker comm;
    
    public ParserTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of parser method, of class Parser.
     */
   /* @Test
    public void testParser() throws Exception {
        System.out.println("parser");
        String operation = "oper 1";
        Command com= new PlusCommand(cal);
        
        List<Command> list = (new Parser()).parser(operation,inv); 
        
        Parser instance = new Parser();
        List<Command> expResult = null;
        List<Command> result = instance.parser(operation, inv);
        assertEquals(expResult, result);
        
    }*/
    
    
 

}
