/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project.test;

import ProjectException.stackIsEmptyException;
import ProjectException.UnderTwoElementsException;
import it.unisa.SE.project.ComplexNumber;
import it.unisa.SE.project.Model;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aniel
 */
public class ModelTest {

    private Model model;
    private ComplexNumber number1;
    private ComplexNumber number2;

    public ModelTest() {
    }

    @Before
    public void setUp() {
        model = new Model();
        number1 = new ComplexNumber(7.0, 15.0);
        number2 = new ComplexNumber(-3.0, 9.0);
    }

    /**
     * Add two number Complex in the model
     */
    public void insertValues() {
        model.insertComplexNumber(number1);
        model.insertComplexNumber(number2);
    }

    /**
     * Verify that the elements are added in the stack; the stack's size is
     * modified
     */
    @Test
    public void testInsertComplexNumber() {
        int size = Model.size();
        this.insertValues();
        assertEquals(Model.size(), size + 2);
        assertEquals(Model.size(), model.getStack().size());
    }

    /**
     * Verify that when the stack is empty, the operation is not acceptable
     *
     * @throws stackIsEmptyException
     */
    @Test(expected = stackIsEmptyException.class)
    public void testRemoveComplexNumberEmpty() throws stackIsEmptyException {
        Model.removeFirstComplexNumber();
    }

    /**
     * Verify that the method removes exactly the element saved on the stack's
     * top
     *
     * @throws stackIsEmptyException
     */
    @Test
    public void testRemoveComplexNumber() throws stackIsEmptyException {
        this.insertValues();
        int size = Model.size();
        Model.removeFirstComplexNumber();
        assertEquals(Model.size(), size - 1);
    }

    /**
     * Verify that when the stack is empty, the operation is not acceptable
     *
     * @throws stackIsEmptyException
     */
    @Test(expected = stackIsEmptyException.class)
    public void testGetFirstComplexNumberEmpty() throws stackIsEmptyException {
        Model.getFirstComplexNumber();
    }

    /**
     * Verify that the method returns exactly the element saved on the stack's
     * top
     *
     * @throws stackIsEmptyException
     * @timeout = 1000 ms
     */
    @Test(timeout = 1000)
    public void testGetFirstComplexNumber() throws stackIsEmptyException {
        this.insertValues();
        assertEquals(Model.getFirstComplexNumber(), number2);
        model.getStack().removeFirst();
        assertEquals(Model.getFirstComplexNumber(), number1);
    }

    /**
     * Verify that the method removes all complex numbers
     *
     * @throws ProjectException.stackIsEmptyException
     */
    @Test
    public void testClearModel() throws stackIsEmptyException {
        this.insertValues();
        Model.clearModel();
        assertEquals(0, Model.size());
    }

    /**
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = stackIsEmptyException.class)
    public void testClearModelEmpty() throws stackIsEmptyException {
        Model.clearModel();
    }

    /**
     * @throws ProjectException.stackIsEmptyException
     */
    @Test(expected = stackIsEmptyException.class)
    public void testDuplicateFirstEmpty() throws stackIsEmptyException {
        Model.duplicateFirst();
    }

    /**
     * Verify that the first two complex numbers on the top of the stack have
     * the same value
     *
     * @throws stackIsEmptyException
     */
    public static void testDuplicateFirst() throws stackIsEmptyException {
        ComplexNumber top = Model.getFirstComplexNumber();
        Model.duplicateFirst();
        assertEquals(top, Model.getFirstComplexNumber());
    }

    /**
     * Verify that "dup" operation add a new Stack's top complex number
     * @throws stackIsEmptyException
     */
    public static void testDuplicateFirstSize() throws stackIsEmptyException {
        int sizeBefore = Model.size();
        Model.duplicateFirst();
        assertEquals(sizeBefore + 1, Model.size());
    }

    /**
     * Verify the size Model is the number of elements stored in it
     */
    @Test
    public void testSize(){
        assertEquals(0, Model.size());
        this.insertValues();
        assertEquals(2, Model.size());
    }
    
    @After
    public void tearDown() {
    }
    
    
    /**
     * Verify that "swap" operation exchanges the last two elements on the stack
     * @throws UnderTwoElementsException,stackIsEmptyException
     */
    @Test
    public void testSwap() throws UnderTwoElementsException,stackIsEmptyException {
        this.insertValues();
        Model.swap();
        assertEquals(number1, Model.getFirstComplexNumber());
    }

    /**
     * @throws ProjectException.UnderTwoElementsException
     */
    
    @Test(expected = UnderTwoElementsException.class)
    public void testSwapLess2Elements() throws UnderTwoElementsException,stackIsEmptyException {
        Model.swap();
        
        
        
    }
    
    
    
       
    /**
     * Verify that "over" that pushes a copy of the second last element on the stack
     * @throws UnderTwoElementsException,stackIsEmptyException
     */
    @Test
    public void testOver() throws UnderTwoElementsException,stackIsEmptyException {
        this.insertValues();
        Model.over();
        assertEquals(number1, model.getFirstComplexNumber());
    }

    /**
     * @throws ProjectException.UnderTwoElementsException
     */
    
    @Test(expected = UnderTwoElementsException.class)
    public void testOverLess2Elements() throws UnderTwoElementsException {
        Model.over();
          
    }
    
    
}
