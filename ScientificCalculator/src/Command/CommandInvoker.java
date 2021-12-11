
package Command;
import it.unisa.SE.project.*;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.io.*;


/**
 *
 * @author Michela
 */
public class CommandInvoker {
    
    public Command  sum;
    public Command  sub;
    public Command  mul;
    public Command  div;
    public Command  invert;
    public Command  sqrt;
    public Command  clear;
    public Command  dup;
    public Command  drop;
    public Command  swap;
    public Command  over;
    public Map<String,Command> map;
    public Map<String,String> map1;
    public Model c;
    public CommandInvoker(Calculator c){
        map = new HashMap<>();
        map1 = new HashMap<>();
        this.map.put("+",new PlusCommand(c));
        this.map.put("-",new MinusCommand(c));
        this.map.put("*",new ProdCommand(c));
        this.map.put(":",new DivCommand(c));
        this.map.put("+-",new InvertSignCommand(c));
        this.map.put("sqrt",new SquareRootCommand(c));
        this.map.put("clear",new ClearCommand(c));
        this.map.put("dup",new DupCommand(c));
        this.map.put("drop",new DropCommand(c));
        this.map.put("swap",new SwapCommand(c));
        this.map.put("over",new OverCommand(c));
       
        this.sum = new PlusCommand(c);
        this.sub=  new MinusCommand(c);
        this.mul=  new ProdCommand(c);
        this.div=  new DivCommand(c);
        this.invert=  new InvertSignCommand(c);
        this.sqrt=  new SquareRootCommand(c);
        this.clear=  new ClearCommand(c);
        this.drop=  new DropCommand(c);
        this.dup=  new DupCommand(c);
        this.swap=  new SwapCommand(c);
        this.over=  new OverCommand(c);
        
        
    }
    
    public boolean addCommand(String name, String comString) throws Exception{
        Command com=this.map.get(name);
       if(com==null){
           List<Command> list = (new Parser()).parser(comString,this);
           Command com2 = new UserDefinedCommand(list);
           map.put(name,com2);
           map1.put(name,comString);
           return true;
        
        } else{
           return false;
           
       }
    }
        
   public void executeCommand(String name) throws Exception{
       Command com=this.map.get(name);
       if(com==null){
          System.out.println("command not found");
         
        } else
          com.execute();
   }
   
   public boolean deleteCommand(String name){ 
       Command com=this.map.get(name);
       if(com==null){
          System.out.println("command not found");
          
           return false;
        }
         map.remove(name);
          map1.remove(name);
         return true;
         
   }
   
   
   public void modifyCommand(String name,String command) throws Exception{
       Command com=this.map.get(name);
       if(com==null){
          System.out.println("command not found");
          
        
        } else{
           List<Command> list = (new Parser()).parser(command,this);
           Command com2 = new UserDefinedCommand(list);
           map.put(name,com2);
           map1.put(name,command);
       }
         
           
   }
   
   
   public void save(String filename) throws Exception, IOException{  
       if(filename != null) {
    PrintWriter op = new PrintWriter(new BufferedWriter(new FileWriter(filename))); 
 
    for (Map.Entry<String, String> tablehash : map1.entrySet()) { 
      op.write(tablehash.getKey() + ": " + tablehash.getValue() + "\n"); 
                } 
      op.close(); 
      
}
       else{
          throw new IOException();
       
}
}
}