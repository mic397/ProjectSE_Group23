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
public class OverCommand implements Command{
  
    private Calculator c;
    
    public OverCommand(Calculator c){
        this.c = c;
    }
    
    /**
     * 
     * @return
     * @throws UnderOneElementException
     * @throws UnderTwoElementsException
     * @throws stackIsEmptyException 
     */
    @Override
    public void execute() throws UnderOneElementException, UnderTwoElementsException, stackIsEmptyException  {
       c.over();
    }

}
