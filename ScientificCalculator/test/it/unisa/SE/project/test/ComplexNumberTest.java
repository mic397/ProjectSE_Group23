/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.SE.project.test;

import ProjectException.ArgumentNotDefinedException;
import ProjectException.notAcceptableValueException;
import it.unisa.SE.project.ComplexNumber;

import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Michela
 */
public class ComplexNumberTest {

    public ComplexNumberTest() {
    }

    @Test
    public void testToString() {
        String expected = "5.0 + j9.0";
        ComplexNumber n = new ComplexNumber(5.0, 9.0);
        assertEquals(expected, n.toString());

        expected = "0.0 + j9.0";
        n = new ComplexNumber(0.0, 9.0);
        assertEquals(expected, n.toString());

        expected = "5.0";
        n = new ComplexNumber(5.0, 0.0);
        assertEquals(expected, n.toString());

        expected = "3.5 - j7.9";
        n.setReal(3.5);
        n.setImaginary(-7.9);
        assertEquals(expected, n.toString());

        expected = "-11.5 - j10.9";
        n.setReal(-11.5);
        n.setImaginary(-10.9);
        assertEquals(expected, n.toString());

        expected = "-3.0 + j5.7";
        n.setReal(-3.0);
        n.setImaginary(5.7);
        assertEquals(expected, n.toString());

    }

    
}
