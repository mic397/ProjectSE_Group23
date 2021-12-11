/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;

import Command.Command;
import Command.CommandInvoker;
import ProjectException.*;
import java.io.IOException;
import java.io.*;
import java.util.*;

/**
 *
 * @author Michela
 */
public class Calculator {

    private Model model;
    private static Calculator instance = null;
    private final ParserString parser = new ParserString();
    private Variables var;
    
    
    public void setVar(Variables var) {
        this.var = var;
    }

    public Variables getVar() {
        return var;
    }

    public static Calculator getCalculator() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    private Calculator() {
        model = new Model();
        var = new Variables();
    }

    /**
     * Transform the string which the user inserts into a Complex Number and
     * then insert the number in the stack
     *
     * @param input the String that the user writes
     * @throws NumberFormatException
     * @throws ArgumentNotDefinedException
     * @throws ArithmeticException
     * @throws UnderTwoElementsException
     * @throws stackIsEmptyException
     * @throws notAcceptableValueException
     * @throws ArithmeticException when a arithmetically illegal operation
     * occurs.
     */
    public void processInput(String input) throws ArgumentNotDefinedException, NumberFormatException, ArithmeticException, UnderTwoElementsException, stackIsEmptyException, notAcceptableValueException {
        ComplexNumber newNumber = parser.recognizeComplexNumber(input);
        Model.insertComplexNumber(newNumber);
    }

    public void checkDoubleOperations() {
        if (Model.size() < 2) {
            throw new UnderTwoElementsException("There aren't two elements to calculate them!");
        }
    }

    /**
     * this method controls that the binary operations are feasible
     *
     * @throws ProjectException.UnderOneElementException
     */
    public void checkOneOperation() throws UnderOneElementException {
        if (Model.size() < 1) {
            throw new UnderOneElementException("There isn't one element to calculate it!");
        }
    }
    
    
    /**
     * @return the sum of elements inserted by user
     * @throws UnderOneElementException
     * @throws ProjectException.stackIsEmptyException
     */
    public ComplexNumber invertSign() throws UnderOneElementException, stackIsEmptyException {
        checkOneOperation();
        ComplexNumber res;
        ComplexNumber number = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();
        res = ComplexOperations.invertSign(number);
        Model.insertComplexNumber(res);
        return res;
    }
    
    /**
     * @return the sum of elements inserted by user
     * @throws stackIsEmptyException
     * @throws UnderTwoElementsException
     */
    public ComplexNumber sum() throws stackIsEmptyException, UnderTwoElementsException {
        checkDoubleOperations();
        ComplexNumber res;
        ComplexNumber number1 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();
        ComplexNumber number2 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();
        res = ComplexOperations.sum(number2, number1);
        Model.insertComplexNumber(res);
        return res;
    }

    /**
     * @return the sub of elements inserted by user
     * @throws stackIsEmptyException
     * @throws UnderTwoElementsException
     */
    public ComplexNumber sub() throws stackIsEmptyException, UnderTwoElementsException {
        checkDoubleOperations();
        ComplexNumber res;
        ComplexNumber number1 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        ComplexNumber number2 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        res = ComplexOperations.sub(number2, number1);
        Model.insertComplexNumber(res);
        return res;
    }

    /**
     * @return the multiply of elements inserted by user
     * @throws stackIsEmptyException
     * @throws UnderTwoElementsException
     */
    public ComplexNumber mul() throws stackIsEmptyException, UnderTwoElementsException {
        checkDoubleOperations();
        ComplexNumber res;

        ComplexNumber number1 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        ComplexNumber number2 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        res = ComplexOperations.mul(number2, number1);
        Model.insertComplexNumber(res);
        return res;
    }

    /**
     * @return the division of elements inserted by user
     * @throws stackIsEmptyException
     * @throws UnderTwoElementsException
     */
    public ComplexNumber div() throws ArithmeticException, stackIsEmptyException, UnderTwoElementsException {
        checkDoubleOperations();
        ComplexNumber res;

        ComplexNumber number1 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        ComplexNumber number2 = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        res = ComplexOperations.div(number2, number1);
        Model.insertComplexNumber(res);
        return res;
    }

    /**
     * @return the sqare root of element on the top of the stack
     * @throws stackIsEmptyException
     * @throws ArgumentNotDefinedException
     * @return ComplexNumber
     */
    public ComplexNumber sqrt() throws ArgumentNotDefinedException, stackIsEmptyException {
        ComplexNumber res;
        ComplexNumber number = Model.getFirstComplexNumber();
        Model.removeFirstComplexNumber();

        res = ComplexOperations.sqrt(number);
        Model.insertComplexNumber(res);
        return res;
    }

    /**
     * This method takes the top element from the stack and saves it into the
     * variable "x"
     *
     * @throws stackIsEmptyException
     * @param variables
     */
    public void saveIntoVariable(char variables) throws stackIsEmptyException {
        ComplexNumber number = Model.getFirstComplexNumber();
       
        if (number == null) {
            throw new stackIsEmptyException();
        } else {
             Model.removeFirstComplexNumber();
            var.setVariableValue(variables, number);
               
        }
       
        
    }

    /**
     * This method pushes the value of the variable "x" onto the stack
     *
     * @param variables
     * @throws ProjectException.VariableValueException
     *
     */
    public void saveIntoStack(char variables) throws VariableValueException {

        ComplexNumber number = var.getVariableValue(variables);
        if(number == null){
            throw new VariableValueException();
        }
        Model.insertComplexNumber(number);

    }

    /**
     * This method takes the top element from the stack and adds it to the value
     * of the variable "x"
     *
     * @param variables
     * @throws stackIsEmptyException
     * @throws ProjectException.VariableValueException
     */
    public void addToVariable(char variables) throws stackIsEmptyException, VariableValueException {
        ComplexNumber number1 = var.getVariableValue(variables);
            ComplexNumber number2 = Model.getFirstComplexNumber();
            Model.removeFirstComplexNumber();
            var.setVariableValue(variables, ComplexOperations.sum(number1, number2));
        
    }
    
    public void minToVariable(char variable) throws stackIsEmptyException, VariableValueException {
            ComplexNumber number1 = this.var.getVariableValue(variable);
            ComplexNumber number2 = Model.getFirstComplexNumber();
            Model.removeFirstComplexNumber();
            var.setVariableValue(variable, ComplexOperations.sub(number1, number2));
    } 
    
     public void insertInStack(ComplexNumber num){
        Model.insertComplexNumber(num);
    }
    
    public void swap() throws UnderTwoElementsException,stackIsEmptyException {
        Model.swap();
    }
    
    public void dup() throws stackIsEmptyException {
        Model.duplicateFirst();
    }
     
    public void clear() throws stackIsEmptyException {
        Model.clearModel();
    }
    
    public void drop() throws stackIsEmptyException{
        Model.removeFirstComplexNumber();
    }
    
    
    public void over() throws UnderTwoElementsException, stackIsEmptyException{
        Model.over();
    }
    
   
}
