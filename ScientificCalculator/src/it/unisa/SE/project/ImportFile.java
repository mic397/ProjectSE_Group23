/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project;

import Command.CommandInvoker;
import ProjectException.ElementNotAvailableException;
import ProjectException.FileExistException;
import ProjectException.TextOperationPresent;
import ProjectException.UnsuitableFileException;
import ProjectException.notAcceptableValueException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aniel
 */
public class ImportFile implements Serializable {
    
    private CommandInvoker command;
    private String nameFileExtended;
    private String nameFile;
    private File in;
    private Scanner scannerInput;

    public ImportFile(String nameEx, String name) throws IOException {
        this.nameFileExtended = nameEx;
        this.nameFile = name;
        this.in = new File(nameEx);
        this.scannerInput = new Scanner(in);
    }

    public HashMap<String, String> execute(CommandInvoker inv) throws FileExistException, UnsuitableFileException, TextOperationPresent, ElementNotAvailableException, notAcceptableValueException { 
        if(!in.exists())
            throw new FileExistException("This file does not exist !");
        HashMap<String,String> ret = new HashMap<>();
        String firstLine = scannerInput.nextLine();
        if(!firstLine.equals("Name Operation:		Operation commands:"))
            throw new UnsuitableFileException("This file is unsuitable !");
        while (scannerInput.hasNextLine()) {
            String var = scannerInput.nextLine();
            String[] splitVar = var.split("\t\t\t");
            String nameOperation = splitVar[0].trim().replaceAll("\n", "");
            String commands = splitVar[1].trim().replaceAll("\n", "");
            inv.addCommand(this.nameFile + "/" + nameOperation, commands);
            ret.put(this.nameFile+ "/" + nameOperation, commands);
        }
        return ret;
    }
}
