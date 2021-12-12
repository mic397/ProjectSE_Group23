/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project.test;

import it.unisa.SE.project.FileCalculatorFilter;
import java.io.File;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aniel
 */
public class FileCalculatorFilterTest {

    private File f, f1;
    private FileCalculatorFilter calculatorFilter;

    public FileCalculatorFilterTest() {
    }

    @Before
    public void setUp() {
        calculatorFilter = new FileCalculatorFilter();
        f = new File("prova.txt");
        f1 = new File("prova.java");
    }

    @After
    public void tearDown() {
    }

    /**
     * verify the corretnless of the extension file accepted
     */
    @Test
    public void testAccept() {
        assertTrue(this.calculatorFilter.accept(f));
        assertFalse(this.calculatorFilter.accept(f1));
    }
    
    
    /**
     * verify the correct description file
     */
    @Test
    public void testGetDescription() {
        String ret = "File UserDefinedOperation (*.txt)";
        assertEquals(ret, this.calculatorFilter.getDescription());
    }
}
