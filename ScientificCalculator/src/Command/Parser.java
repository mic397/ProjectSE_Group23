/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;
import it.unisa.SE.project.*;

import ProjectException.notAcceptableValueException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ProjectException.OperationNotAllowedException;
/**
 *
 * @author Michela
 */
public class Parser {
    ParserString parse;
    Calculator cal;
    
    public Parser(){
       parse = new ParserString(); 
       cal = Calculator.getCalculator();
    }
 
    
     public List<Command> parser(String operation,CommandInvoker inv) throws notAcceptableValueException, Exception{
       List<Command> listCommand = new ArrayList<>();
       
       List<String> operationList = Arrays.asList(operation.split(" ")); 
       // if(listCommand.contains("swap") || listCommand.contains("over") || listCommand.contains("dup")){
           // throw new OperationNotAllowedException("Insert not allowed");
       // }
       for(int i=0; i<operationList.size(); i++){
           Command comm = inv.map.get(operationList.get(i)) ;
           if(comm==null){
               ComplexNumber newNumber = parse.recognizeComplexNumber(operationList.get(i));
               comm = new InsertCommand(cal,newNumber);
               
               
           }
           listCommand.add(comm);
          
       }
       
       return listCommand;

    }

}