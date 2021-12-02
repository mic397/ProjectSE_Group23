/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.SE.project;
import java.util.Objects;
import java.util.HashMap;
import ProjectException.NotVariableKeyException;



public class Variables{
    private HashMap<Character, ComplexNumber> map;
    
    
    
    public Variables() {
       this.map = new HashMap<>();
    }
    
    
    /**
     * This method checks that the variable is between the letters  [a,z] of English alphabet
     *
     * @param var 
     */
    
     private void verifyVariable(char var) throws NotVariableKeyException {
        if (!((var >= 'a') && (var <= 'z'))) {
            throw new NotVariableKeyException();
        }
    }
    
    /**
     * This method save a ComplexNumbers in a variable
     *
     * @param key 
     * @param number 
     * 
     */
    public void setVariableValue(char key, ComplexNumber number) throws NotVariableKeyException{
        verifyVariable(key);
        if(!Character.isAlphabetic(key)){
           throw new NotVariableKeyException() ;
        }else{
            map.put(Character.toLowerCase(key), number);
            
        }
       
    }
    
    /**
     * This method the ComplexNumbers contained in the key
     * @param key
     * @return ComplexNumber
     */
    public ComplexNumber getVariableValue(char key){
        return map.get(key);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.map);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Variables other = (Variables) obj;
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }
    
 

}
   
  
    
    
    
    
