/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;
import it.unisa.SE.project.*;

/**
 *
 * @author Michela
 */
public class InsertCommand implements Command {
    Calculator c;
    ComplexNumber num;
    
    public InsertCommand(Calculator c,ComplexNumber num){
        this.c= c;
        this.num = num;
    }
    @Override
    public void execute() throws Exception {
        c.insertInStack(num);
    }
    
    
}
