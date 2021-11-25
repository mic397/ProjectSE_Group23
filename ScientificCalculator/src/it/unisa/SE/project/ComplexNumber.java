/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;

import ProjectException.ArgumentNotDefined;

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
    
 public static ComplexNumber sub(ComplexNumber number1, ComplexNumber number2){
        double r1=number1.getReal();
        double i1=number1.getImaginary();

        double r2=number2.getReal();
        double i2=number2.getImaginary();

        double sumReal=r1-r2;
        double sumIm=i1-i2;

        ComplexNumber complexResult=new ComplexNumber(sumReal, sumIm);
        return complexResult;
    }

   
    
     /** 
     * return the module of a complex number
     * @param number1
     * @return double
     */
    public static double mod(ComplexNumber number1){
        double r1=number1.getReal();
        double i1=number1.getImaginary();
        double mod=Math.sqrt(r1*r1+i1*i1);
        return mod;
    }
    
    /** 
     * return the argument of a complex number
     * @param number1
     * @return double
     * @throws ProjectException.ArgumentNotDefined
     */
    public static double arg(ComplexNumber number1) throws ArgumentNotDefined{
        double r=number1.getReal();
        double i=number1.getImaginary();
        
        if(r==0 && i>0){
            return (Math.PI/2*100d);
        }
        if(r==0 && i<0){
            return (-Math.PI/2);
        }
        if(r==0 && i==0){
            throw new ArgumentNotDefined("Arg of 0/0 is not defined");
        }
        if(r<0 && i>=0){
            return (Math.atan(i/r)+Math.PI);
        }
        if(r<0 && i<0){
            return (Math.atan(i/r)-Math.PI);
        } 
        return (Math.atan(i/r));
    }
}
