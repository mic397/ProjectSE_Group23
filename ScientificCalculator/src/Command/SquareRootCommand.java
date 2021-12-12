/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import ProjectException.ArgumentNotDefinedException;
import ProjectException.UnderOneElementException;
import ProjectException.stackIsEmptyException;
import it.unisa.SE.project.*;



/**
 *
 * @author Michela
 */
public class SquareRootCommand implements Command{

    private Calculator c;
    
    public SquareRootCommand(Calculator c){
        this.c = c;
    }
    
    
    @Override
    public void execute() throws UnderOneElementException, stackIsEmptyException, ArgumentNotDefinedException  {
        c.sqrt();
    }

}
