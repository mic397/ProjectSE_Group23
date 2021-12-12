/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

import ProjectException.ElementNotAvailableException;
import it.unisa.SE.project.*;

import ProjectException.notAcceptableValueException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Michela
 */
public class Parser {

    ParserString parse;
    Calculator cal;

    public Parser() {
        parse = new ParserString();
        cal = Calculator.getCalculator();
    }

    public List<Command> parser(String operation, CommandInvoker inv) throws notAcceptableValueException, ElementNotAvailableException {
        List<Command> listCommand = new ArrayList<>();
        List<String> operationList = Arrays.asList(operation.split("\\s+"));
        for (String tmp : operationList){
            String ret = this.parse.checkComplexNumber(tmp);
                if(tmp.equals(ParserString.getInvalid_insert()))
                if (!inv.map.containsKey(tmp)){
                    throw new ElementNotAvailableException("In this operation is present a signature not found before");
                } 
            }
        
        for (int i = 0; i < operationList.size(); i++) {
            Command comm = inv.map.get(operationList.get(i));
            if (comm == null) {
                ComplexNumber newNumber = parse.recognizeComplexNumber(operationList.get(i));
                comm = new InsertCommand(cal, newNumber);
            }
            listCommand.add(comm);

        }

        return listCommand;

    }

}
