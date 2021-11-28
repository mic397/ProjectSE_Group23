
package it.unisa.SE.project;


import java.util.*;


/**
 *
 * @author User
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;
import ProjectException.*;
import java.util.Arrays;
import java.util.Iterator;
import it.unisa.SE.project.*;

public class Calculator {
   
     
    private static Calculator instance = null;
    private final ParserString parser = new ParserString();
   
    public static Calculator getCalculator() {
        if (instance == null)
            instance = new Calculator();
        return instance;
    }

    private Model model;
    

    private Calculator() {
        model = new Model();
    }
   
   
     public Iterator<ComplexNumber> getIterator() {
        return model.getIterator();
   
   
}
     
     /** 
     * Transform the string which the user inserts into a Complex Number and then insert the number in the stack
     * @param input the String that the user writes
     * @throws NumberFormatException 
     * @throws ArgumentNotDefinedException
     * @throws ArithmeticException
     * @throws UnderTwoElementsException
     * @throws stackIsEmptyException
     * @thows  notAcceptableValueException
     * @throws ArithmeticException when a arithmetically illegal operation occurs.
     */
    public void insertValue(String input) throws ArgumentNotDefinedException, NumberFormatException,ArithmeticException,UnderTwoElementsException,stackIsEmptyException, notAcceptableValueException{
       
            String number = parser.parserString(input);
            
            ComplexNumber newNumber = parser.recognizeComplexNumber(input);
            model.push(newNumber);
       // }
    }
    
    /**  
     * Calculate the sum of the last two elements in the stack 
     * @return result 
     * throws stackIsEmptyException,UnderTwoElementsException
     */
     
    public ComplexNumber sum() throws stackIsEmptyException,UnderTwoElementsException{
        if(model.size()<2){
            throw new UnderTwoElementsException("error");
        }
        ComplexNumber c1 = model.pop();
        ComplexNumber c2 = model.pop();
        ComplexNumber result = ComplexOperations.sum(c1, c2);
        model.push(result);
        return result;
    }
    
    /**  
     * Calculate the substraction of the last two elements in the stack 
     * @return result 
     * throws stackIsEmptyException
     */
     
    public ComplexNumber sub() throws stackIsEmptyException {
        ComplexNumber c1 = model.pop();
        ComplexNumber c2 = model.pop();
        ComplexNumber result = ComplexOperations.sub(c1, c2);
        model.push(result);
        return result;
    }
    
    /**  
     * Calculate the multiplication of the last two elements in the stack 
     * @return result 
     * throws stackIsEmptyException
     */
    
    public ComplexNumber div() throws stackIsEmptyException {
        ComplexNumber c1 = model.pop();
        ComplexNumber c2 = model.pop();
        ComplexNumber result = ComplexOperations.div(c1, c2);
        model.push(result);
        return result;
    }
   
     /**  
     * Calculate the division of the last two elements in the stack 
     * @return result 
     * throws stackIsEmptyException
     */
    
    public ComplexNumber mul() throws stackIsEmptyException {
        ComplexNumber c1 = model.pop();
        ComplexNumber c2 = model.pop();
        ComplexNumber result = ComplexOperations.mul(c1, c2);
        model.push(result);
        return result;
    }
    
    
     /**  
     * Take in input the operation which the calculator done
     *  return the results of the correct operations
     * 
     */
    
    public ComplexNumber chooseOperation(String operation) throws stackIsEmptyException {
        switch (op) {
            case "+":
                return this.sum();

           case "-":
                return this.sub();

            case ":":
                return this.div();

            case "x":
                return this.mul();

           /*ase "sqrt":
                return this.squareRoot();

            case "+-":
                return this.invertSign();*/

             default:
                return null;

        }

    }
     
}

