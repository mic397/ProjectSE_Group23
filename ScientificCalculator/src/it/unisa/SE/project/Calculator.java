/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;

import ProjectException.*;

/**
 *
 * @author Michela
 */
public class Calculator {

    private Model model;
    private static Calculator instance = null;
    private final ParserString parser = new ParserString();

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
}
