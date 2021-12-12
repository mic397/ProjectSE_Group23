/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project;

import ProjectException.notAcceptableValueException;

/**
 *
 * @author aniel
 */
public class ParserString {

    private static final String complex_number = "__COMPLEX__NUMBER__";
    private static final String single_number = "__SINGLENUMBER__";
    private static final String invalid_insert = "__INVALID__";
    private static final String continue_checking = "__CHECKING__";

    public static String getComplex_number() {
        return complex_number;
    }

    public static String getSingle_number() {
        return single_number;
    }

    public static String getInvalid_insert() {
        return invalid_insert;
    }

    public static String getContinue_checking() {
        return continue_checking;
    }
    
    /**
     * The method returns the string representing the operation
     *
     * @param text , stringa da dover modificare.
     * @return modified string
     */
     public String checkOperation(String text){
        text = text.replaceAll("\\n", "");
        if (text.startsWith("+") || text.startsWith("-")) {
            StringBuilder sb = new StringBuilder(text);
            // Removing the first character
            // of a string
            sb.deleteCharAt(0);
            // Converting StringBuilder into a string
            // and return the modified string
            return sb.toString();
        }
        return text;
    }
     
    
    /**
     * The method returns the string in which spaces were stripped whites and
     * also eliminates any + or - present at the beginning of it.
     *
     * @param text , stringa da dover modificare.
     * @return modified string
     */
    public String clearString(String text) {
        text = text.replaceAll("\\n", "");
        if (text.startsWith("+") || text.startsWith("-")) {
            StringBuilder sb = new StringBuilder(text);
            // Removing the first character
            // of a string
            sb.deleteCharAt(0);
            // Converting StringBuilder into a string
            // and return the modified string
            return sb.toString();
        }
        return text;
    }

    /**
     * The method checks whether the input string is a real number.
     *
     * @param text , stringa da dover controllare.
     * @return true if the string is a real number, false otherwise.
     */
    public boolean checkPossiblePartReal(String text) {
        try {
            double real = Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    /**
     * The method checks whether the input string is a imaginary number.
     *
     * @param text , stringa da dover controllare.
     * @return true if the string is a complex number, false otherwise.
     */
    public boolean checkPossiblePartImaginary(String text) {
        int count = 0;
        for (char j : text.toCharArray()) {
            if (j == 'j') {
                count++;
            }
        }
        if (count == 1) {
                try {
                    if (text.length() == 1) {
                        text = "1j";
                    }
                    String image = text.replace("j", "");
                    double image_finale = Double.parseDouble(image);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
        }
        return false;
    }

    /**
     * The method checks whether the input string is a single real or imaginary
     * number.
     *
     * @param text
     * @return the matching string
     *
     */
    public String checkPossibleOneNumber(String text) {
        if (this.checkPossiblePartReal(text)) {
            return single_number;
        }
        return this.checkPossiblePartImaginary(text) ? single_number : invalid_insert;
    }

    /**
     * The method checks whether the input string is a complex number.
     *
     * @param text
     * @return the matching string
     * @throws ProjectException.notAcceptableValueException
     */
    public String checkComplexNumber(String text) throws notAcceptableValueException {
        if (text.endsWith("+") || text.endsWith("-") || text.contains("++") || text.contains("+-") || text.contains("--") || text.contains("-+")) {
            return invalid_insert;
        }
        if (text.contains("+") || text.contains("-")) {
            String replaceAll = text.replaceAll(" ", "");
            String[] scanner = replaceAll.split("\\+|\\-");
            if (scanner.length > 2) {
                return invalid_insert;
            }
            if (this.checkPossiblePartReal(scanner[0])) {
                return this.checkPossiblePartImaginary(scanner[1]) ? complex_number : invalid_insert;
            }
            if (this.checkPossiblePartImaginary(scanner[0])) {
                return this.checkPossiblePartReal(scanner[1]) ? complex_number : invalid_insert;
            }
            return invalid_insert;
        }
        return continue_checking;
    }

    /**
     * The method checks whether the input string is a complex number, a real
     * number, a purely imaginary number, an operation
     *
     * @param text , stringa da dover controllare.
     * @return returns complex_number if the string is a complex number, a real
     * number or a purely imaginary number; returns operation if the string text
     * contains an operation, invalid_insert otherwise.
     * @throws ProjectException.notAcceptableValueException
     */
    public String parserString(String text) throws notAcceptableValueException {
        if (text.length() == 0) {
            return invalid_insert;
        }
        text = clearString(text);
        String return_value = checkComplexNumber(text);
        if (!(return_value.equals(continue_checking))) {
            return return_value;
        }
        return checkPossibleOneNumber(text);
    }

    /**
     * The method checks whether the input string has a + or an operator -
     *
     * @param text , stringa da dover controllare.
     * @return returns the operator if present, otherwise a space character.
     */
    public char checkFirstCharacter(String text) {
        text = text.replaceAll("\\n", "");
        if (text.startsWith("+") || text.startsWith("-")) {
            String sb = text;
            return sb.charAt(0);
        }
        return ' ';
    }

    /**
     * The method converts an input given string into a complex number.
     *
     * @param text
     * @return a complex number.
     * @throws ProjectException.notAcceptableValueException
     */
    public ComplexNumber recognizeComplexNumber(String text) throws notAcceptableValueException {
        String op = this.parserString(text);
        if (op.equals(ParserString.invalid_insert)) {
            throw new notAcceptableValueException("Insert not allowed");
        }
        if (text.contains("-0.0")) {
            text = text.replace("-0.0", "0.0");
        }
        if (text.contains("-0")) {
            text = text.replace("-0", "0.0");
        }
        if (op.equals(ParserString.single_number)) {
            if (!text.contains("j")) {
                return new ComplexNumber(Double.parseDouble(text), 0.);
            } else {
                if(text.equals("+j") || text.equals("j")){
                    text = "1j";
                }else if(text.equals("-j")){
                  text = "-1j";  
                }   
                return new ComplexNumber(0., Double.parseDouble(text.replace("j", "")));
            }
        }
        if (op.equals(ParserString.complex_number)) {
            String replaceAll = text.replaceAll(" ", "");
            char operator1 = this.checkFirstCharacter(text);
            text = this.clearString(replaceAll);
            char operator2 = ' ';
            if (text.contains("+")) {
                operator2 = '+';
            }
            if (text.contains("-")) {
                operator2 = '-';
            }
            String[] scanner = text.split("\\+|\\-");
            if (scanner[0].contains("j")) {
                if (scanner[0].length() == 1) {
                    scanner[0] = "1j";
                }
                String image = scanner[0].replace("j", "");
                return new ComplexNumber(Double.parseDouble(operator2 + scanner[1]), Double.parseDouble(operator1 + image));
            } else {
                double real = Double.parseDouble(operator1 + scanner[0]);
                if (scanner[1].length() == 1) {
                    scanner[1] = "1j";
                }
                String image = scanner[1].replace("j", "");
                return new ComplexNumber(real, Double.parseDouble(operator2 + image));
            }
        }
        throw new notAcceptableValueException("Error");
    }
}
