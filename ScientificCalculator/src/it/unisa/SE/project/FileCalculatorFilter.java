/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author aniel
 */
public class FileCalculatorFilter extends FileFilter{

    @Override
    public boolean accept(File f) {
        
        if (f.isDirectory())
            return true;
        
        String extension = Utils.getExtension(f);
        
        if(extension == null)
            return false;
        
        return extension.equals("txt");
    }

    @Override
    public String getDescription() {
        return "File UserDefinedOperation (*.txt)";
    }
    
}
