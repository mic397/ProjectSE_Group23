/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;
import it.unisa.SE.project.*;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Michela
 */
public class UserDefinedCommand implements Command {
    public List<Command> commands;
    
    
    
    public UserDefinedCommand(List<Command> commands){
        
        this.commands= commands;
    }
    
    
    @Override
    public void execute() throws Exception {
        for(Command c: commands){
            c.execute(); 
        }
    }
    
    
    
    
}
