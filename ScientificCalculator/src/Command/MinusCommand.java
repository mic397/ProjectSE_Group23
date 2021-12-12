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
public class MinusCommand implements Command {

    private Calculator c;

    public MinusCommand(Calculator c) {
        this.c = c;
    }

    @Override
    public void execute() throws UnderOneElementException, stackIsEmptyException {
        c.sub();
    }

}
