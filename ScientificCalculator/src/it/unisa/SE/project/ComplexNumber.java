/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;

/**
 *
 * @author Michela
 */
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
  
   
public void setReal(Double real) {
        this.real = real;
    }

  
    public void setImaginary(Double imaginary) {
        this.imaginary = imaginary;
    }
    
    @Override
    public String toString() {
        if(imaginary>0)
            return String.valueOf(real) + " + j" + String.valueOf(imaginary);
        else if(imaginary<0)
            return String.valueOf(real) + " - j" + String.valueOf(-imaginary);
        else if( imaginary == 0)
             return String.valueOf(real); 
        else 
            return String.valueOf(imaginary);
                
    }
    
    
 @Override
    public int hashCode() {
        int hash = 7;
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
        final ComplexNumber other = (ComplexNumber) obj;
        if (Double.doubleToLongBits(this.real) != Double.doubleToLongBits(other.real)) {
            return false;
        }
        if (Double.doubleToLongBits(this.imaginary) != Double.doubleToLongBits(other.imaginary)) {
            return false;
        }
        return true;
    }
    
  
    
}
