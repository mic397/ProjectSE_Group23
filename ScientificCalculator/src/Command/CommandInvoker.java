
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
    public Model c;
    public CommandInvoker(Calculator c){
        map = new HashMap<>();
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
    /**
     * This method allows to add a command 
     * @param name
     * @param comString
     * @return boolean
     * @throws Exception
     */
    
    public boolean addCommand(String name, String comString) throws Exception{
        Command com=this.map.get(name);
       if(com==null){
           List<Command> list = (new Parser()).parser(comString,this);
           Command com2 = new UserDefinedCommand(list);
           map.put(name,com2);
           return true;
        
        } else{
           return false;
           
       }
    }
   /**
     * This method allows to excute a command 
     *
     * @param name
     * @throws Exception
     */      
   public void executeCommand(String name) throws Exception{
       Command com=this.map.get(name);
       if(com==null){
          System.out.println("command not found");
         
        } else
          com.execute();
   }
    /**
     * This method allows to delete a command 
     *
     * @param name
     * @return boolean
     */ 
   public boolean deleteCommand(String name){ 
       Command com=this.map.get(name);
       if(com==null){
          System.out.println("command not found");
          
           return false;
        }
         map.remove(name);
         return true;
         
   }
   
    
   /**
     * This method allows to modify a command 
     * @param name
     * @param command
     * @throws Exception
     */
   public void modifyCommand(String name,String command) throws Exception{
       Command com=this.map.get(name);
       if(com==null){
          System.out.println("command not found");
          
        
        } else{
           List<Command> list = (new Parser()).parser(command,this);
           Command com2 = new UserDefinedCommand(list);
           map.put(name,com2);
       }
         
           
   }
   
   
   
   /**
     * This method allows to reload commands from a file 
     * @param nameFile
     * @return  Map
     * @throws Exception
     * @throws IOException
     */
    public Map<String,String> reloadCommand (String nameFile) throws IOException, Exception{
       Map<String,String> ret = new HashMap<>();
       File file = new File(nameFile);
       if(!file.exists()){
           throw new IOException();
       }
       Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
          String  var = scan.nextLine();
        
        String[] splitVar =  var.split("=");
        String name = splitVar[0].trim().replaceAll("\n","");
        String commands = splitVar[1].trim().replaceAll("\n","");
        try{
            addCommand(name,commands);
            ret.put(name, commands);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        }
      return ret;
   }
   
    
     /**
     * This method allows to save commands in a file 
     * @param mapFile
     * @param nameFile
     * @throws IOException
     */
    public void saveCommand(Map<String,String> mapFile, String nameFile) throws IOException{
        File file1 = new File(nameFile);
         if(!file1.exists()){
           throw new IOException();
       }
        FileWriter fw = new FileWriter(file1);
        for(Map.Entry<String,String> e : mapFile.entrySet() ){
            String s = e.getKey()+"="+e.getValue();
            fw.write(s);
            fw.write(System.lineSeparator());
            
        }
        fw.close();
        
        
        
        
        
    }
   
}