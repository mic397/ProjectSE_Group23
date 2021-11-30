/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project;

import ProjectException.stackIsEmptyException;
import ProjectException.UnderTwoElementsException;
import java.util.LinkedList;
import java.util.Iterator;


/**
 * @class Model represents the data structure internal to define a mapping of
 * data in LIFO MODE -> Possible Singleton
 * @author aniel
 */
public class Model {
    private static LinkedList<ComplexNumber> stack;

    /**
     * Costructor
     */
    public Model() {
        stack = new LinkedList();
    }
 
    /**
     * @return the reference of the private attribute "stack"
     */
    public LinkedList<ComplexNumber> getStack() {
        return stack;
    }

    /**
     * set the private attribute "stack"
     * @param stack
     */
    public void setStack(LinkedList<ComplexNumber> stack) {
        Model.stack = stack;
    }

    /**
     * add a ComplexNumber on the Stack's top
     * @param a
     */
    public static void insertComplexNumber(ComplexNumber a) {
        stack.addFirst(a);
    }
 
    /** "Drop"
     * removes the Complex Number from the Stack's top
     * @throws ProjectException.stackIsEmptyException if stack is empty
     */
    public static void removeFirstComplexNumber() throws stackIsEmptyException {
        if (stack.isEmpty()) {
            throw new stackIsEmptyException("Stack is empty: can't remove any complex number");
        }
        stack.removeFirst();
    }

    /**
     * @return the Complex Number on the Stack's top
     * @throws ProjectException.stackIsEmptyException if stack is empty
     */
    public static ComplexNumber getFirstComplexNumber() throws stackIsEmptyException {
        if (stack.isEmpty()) {
            throw new stackIsEmptyException("Stack is empty: can't get any complex number");
        }
        return stack.getFirst();
    }

    /**
     * removes all Complex Numbers from the Stack
     * @throws stackIsEmptyException 
     * da testare
     */
    public static void clearModel() throws stackIsEmptyException {
        if (stack.isEmpty()) {
            throw new stackIsEmptyException("Stack is already empty");
        }
        stack.clear();
    }
     
    /**
     * "dup" that pushes a copy of the Stack's top element on the stack;
     * @throws stackIsEmptyException
     * da testare
     */
    public static void duplicateFirst() throws stackIsEmptyException {
        if (stack.isEmpty()) {
            throw new stackIsEmptyException("Stack is empty: can't duplicate any complex number");
        }
       stack.addFirst(stack.getFirst());
    }    
    
    /**
     * @return the number of elements of the model's stack
     */
    public static int size() {
        return stack.size();
    }

    /**
     * @return a view of the stack; element for element
     */
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        stack.forEach(tmp -> {
            ret.append(tmp).append("\n");
        });
        return ret.toString();
    }
    
   /**
     * "swap" that " that exchanges the last two elements on the stack;
     * @throws UnderTwoElementsException
     */ 
    public static void swap() throws UnderTwoElementsException,stackIsEmptyException{
        if(stack.size()<2)
            throw new UnderTwoElementsException();
        if(stack.isEmpty()){
            throw new stackIsEmptyException();
        }
        ComplexNumber element1 = stack.removeFirst();
        ComplexNumber element2 = stack.removeFirst();
        
        insertComplexNumber(element1);
        insertComplexNumber(element2);
    } 
    
    /**
     * "over" that pushes a copy of the second last element on the stack;
     * @throws UnderTwoElementsException
     */
    
   public static void over()throws UnderTwoElementsException{ 
        if(stack.size()<2) 
            throw new UnderTwoElementsException(); 
        ComplexNumber element = stack.get(stack.size() - 1); 
         
        insertComplexNumber(element); 
    }
}
