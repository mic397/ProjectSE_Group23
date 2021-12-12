/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import ProjectException.UnderOneElementException;
import ProjectException.stackIsEmptyException;
import it.unisa.SE.project.*;

/**
 *
 * @author Michela
 */
public class InvertSignCommand implements Command {

    private Calculator c;

    public InvertSignCommand(Calculator c) {
        this.c = c;
    }

    /**
     * 
     * @return 
     * @throws UnderOneElementException
     * @throws stackIsEmptyException 
     */
    @Override
    public void execute() throws UnderOneElementException, stackIsEmptyException {
        c.invertSign();
    }

}
