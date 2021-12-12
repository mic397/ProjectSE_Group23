/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

import it.unisa.SE.project.*;

import java.util.List;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michela
 */

public class UserDefinedCommand implements Command {
    private List<Command> commands;
    
    public UserDefinedCommand(List<Command> commands) {
        this.commands = commands;
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    public void execute() throws Exception{
        LinkedList<ComplexNumber> tmp = new LinkedList<>();
            for (Command c : commands) {
                    c.execute();
            } 
    }
}
