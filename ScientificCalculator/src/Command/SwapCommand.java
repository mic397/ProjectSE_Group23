/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import ProjectException.UnderOneElementException;
import ProjectException.UnderTwoElementsException;
import ProjectException.stackIsEmptyException;
import it.unisa.SE.project.*;


/**
 *
 * @author Michela
 */
public class SwapCommand implements Command{
     private Calculator c;
    
    public SwapCommand(Calculator c){
        this.c = c;
    }

    /**
     * 
     * @throws UnderTwoElementsException
     * @throws stackIsEmptyException
     * @throws UnderOneElementException 
     */
    @Override
    public void execute() throws UnderTwoElementsException, stackIsEmptyException, UnderOneElementException  {
        c.swap();
    }

}
