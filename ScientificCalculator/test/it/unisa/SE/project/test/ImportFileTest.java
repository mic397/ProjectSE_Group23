/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project.test;

import Command.CommandInvoker;
import ProjectException.ElementNotAvailableException;
import ProjectException.FileExistException;
import ProjectException.TextOperationPresent;
import ProjectException.UnsuitableFileException;
import ProjectException.notAcceptableValueException;
import it.unisa.SE.project.Calculator;
import it.unisa.SE.project.ImportFile;
import it.unisa.SE.project.SaverFile;
import java.io.IOException;
import java.util.HashMap;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aniel
 */
public class ImportFileTest {

    private ImportFile importer, importer2;
    private SaverFile saver;
    private String name1, name2;
    private String nameExtended1, nameExtended2;
    private Calculator calc;
    private CommandInvoker inv;
    private HashMap<String, String> map;
    private StringBuilder builder;

    public ImportFileTest() {
    }

    @Before
    public void setUp() {
        nameExtended1 = "C:\\Users\\aniel\\Documents\\NetBeansProjects\\ProjectCalculator\\ProjectSE_Group23\\ScientificCalculator\\src\\prova.txt";
        name1 = "prova.txt";
        nameExtended2 = "C:\\Users\\aniel\\Documents\\NetBeansProjects\\ProjectCalculator\\ProjectSE_Group23\\ScientificCalculator\\src\\prova2.txt";
        name2 = "prova2.txt";
        builder = new StringBuilder();
        map = new HashMap<>();
        calc = Calculator.getCalculator();
        inv = new CommandInvoker(calc);
    }

    /**
     * verify if it throws FileExistsException
     *
     * @throws ProjectException.FileExistException
     * @throws ProjectException.UnsuitableFileException
     * @throws ProjectException.TextOperationPresent
     * @throws ProjectException.ElementNotAvailableException
     * @throws ProjectException.notAcceptableValueException
     */
    @Test(expected = NullPointerException.class)
    public void testExecuteNullPointerException() throws FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException {
        this.importer2.execute(inv);
    }

    /**
     * verify the corretness of usability files
     *
     * @throws FileExistException
     * @throws UnsuitableFileException
     * @throws TextOperationPresent
     * @throws ElementNotAvailableException
     * @throws notAcceptableValueException
     * @throws IOException
     */
    @Test(expected = UnsuitableFileException.class)
    public void testExecuteUnsuitableFileException() throws FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException, IOException {
        this.builder.append("prova");
        saver = new SaverFile(nameExtended1, builder.toString());
        saver.execute();
        importer = new ImportFile(nameExtended1, name1);
        this.importer.execute(inv);
    }

    /**
     * verify the content empty file
     *
     * @throws FileExistException
     * @throws UnsuitableFileException
     * @throws TextOperationPresent
     * @throws ElementNotAvailableException
     * @throws notAcceptableValueException
     * @throws IOException
     */
    @Test
    public void testExecuteEmptyFile() throws FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException, IOException {
        builder.append("Name Operation:").append("\t\t").append("Operation commands:\n");
        saver = new SaverFile(nameExtended1, builder.toString());
        saver.execute();
        importer = new ImportFile(nameExtended1, name1);
        this.map = this.importer.execute(inv);
        assertTrue(this.map.isEmpty());
    }

    /**
     * verify the full content by importing file
     * @throws FileExistException
     * @throws UnsuitableFileException
     * @throws TextOperationPresent
     * @throws ElementNotAvailableException
     * @throws notAcceptableValueException
     * @throws IOException 
     */
    @Test
    public void testExecute() throws FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException, IOException {
        builder.append("Name Operation:").append("\t\t").append("Operation commands:\n");
        String nameOp = "testOpImporter";
        String nameCommandOp = "+ + + - -";
        builder.append(nameOp).append("\t\t\t").append(nameCommandOp).append("\n");
        saver = new SaverFile(nameExtended1, builder.toString());
        saver.execute();
        importer = new ImportFile(nameExtended1, name1);
        this.map = this.importer.execute(inv);
        HashMap<String, String> expected = new HashMap<>();
        expected.put(name1 + "/"+ nameOp, nameCommandOp);
        assertEquals(expected, this.map);
    }
    
    @After
    public void tearDown() {
    }
}
