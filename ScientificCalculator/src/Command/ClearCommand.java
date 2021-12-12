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
public class ClearCommand implements Command{

    
   private Calculator c;
    
    public ClearCommand(Calculator c){
        this.c = c;
    }
    
    /**
     * 
     * @throws stackIsEmptyException
     * @throws UnderOneElementException 
     */
    @Override
    public void execute() throws stackIsEmptyException, UnderOneElementException  {
        c.clear();
    }
}
