/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project.test;

import it.unisa.SE.project.Utils;
import java.io.File;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aniel
 */
public class UtilsTest {

    private File f, f1;

    public UtilsTest() {
    }

    @Before
    public void setUp() {
        f = new File("prova.txt");
        f1 = new File("prova.java");
    }

    @After
    public void tearDown() {
    }

    /**
     * verify the correct extension file
     */
    @Test
    public void testGetExtension() {
        assertEquals("txt", Utils.getExtension(f));
        assertEquals("java", Utils.getExtension(f1));
    }
}
