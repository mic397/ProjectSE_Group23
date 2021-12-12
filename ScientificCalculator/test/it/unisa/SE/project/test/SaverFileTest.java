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
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author aniel
 */
public class SaverFileTest {

    private ImportFile importer;
    private SaverFile saver1, saver2;
    private String name1, name2;
    private String nameExtended1, nameExtended2;
    private Calculator calc;
    private CommandInvoker inv;
    private HashMap<String, String> map;
    private StringBuilder builder;

    public SaverFileTest() {
    }

    @Before
    public void setUp() throws IOException {
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
     * verify the corretness of usability files
     * @throws IOException
     * @throws FileExistException
     * @throws UnsuitableFileException
     * @throws TextOperationPresent
     * @throws ElementNotAvailableException
     * @throws notAcceptableValueException 
     */
    @Test(expected = UnsuitableFileException.class)
    public void testExecuteUnsuitableFileException() throws IOException, FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException {
        saver1 = new SaverFile(nameExtended1, name1);
        saver1.execute();
        importer = new ImportFile(nameExtended1, name1);
        this.importer.execute(inv);
    }

    /**
     * verify the full content by saving file
     * @throws IOException
     * @throws FileExistException
     * @throws UnsuitableFileException
     * @throws TextOperationPresent
     * @throws ElementNotAvailableException
     * @throws notAcceptableValueException 
     */
    @Test
    public void testExecute() throws IOException, FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException {
        builder.append("Name Operation:").append("\t\t").append("Operation commands:\n");
        String nameOp = "testOpSaver";
        String nameCommandOp = "sqrt + - sqrt";
        builder = builder.append(nameOp).append("\t\t\t").append(nameCommandOp).append("\n");
        saver2 = new SaverFile(nameExtended2, builder.toString());
        saver2.execute();
    }
}
