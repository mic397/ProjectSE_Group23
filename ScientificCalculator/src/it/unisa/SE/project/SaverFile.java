/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project;

import Command.Command;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author aniel
 */
public class SaverFile implements Serializable, Command {

    private String nameFile;
    private PrintWriter out;
    private String obj;

    public SaverFile(String name, String obj) throws IOException{
        this.nameFile = name;
        FileOutputStream fos = new FileOutputStream(name);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        out = new PrintWriter(osw);
        this.obj = obj;
    }

    @Override
    public void execute()  {
       out.print(obj);
       out.close();
    }
}
