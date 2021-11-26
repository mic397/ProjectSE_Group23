/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;

import ProjectException.ArgumentNotDefinedException;
import ProjectException.notAcceptableValueException;

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
    
  /** 
     * Return the subtraction between two complex numbers
     * @param number1  first operand
     * @param number2  second operand
     * @return ComplexNumber
     */  
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
     * Return the sum between two complex numbers
     * @param number1
     * @param number2
     * @return ComplexNumber
     */
    public static ComplexNumber sum(ComplexNumber number1, ComplexNumber number2){
        double r1=number1.getReal();
        double i1=number1.getImaginary();

        double r2=number2.getReal();
        double i2=number2.getImaginary();

        double sumReal=r1+r2;
        double sumIm=i1+i2;

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
     * @param a
     * @param b
     * @return the multiply operation's result between two complex numbers:
     */
    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {       
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imag = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imag);
    }
    
    /**
     * @param alpha
     * @return the multiply operation's result between a complex number and a
     * scale.
     */
    public ComplexNumber scale(double alpha) {
        ComplexNumber complex = this;
        return new ComplexNumber(alpha * this.getReal(), alpha * this.getImaginary());
    }

    /**
     * @return a number with the inverted sign
     */
    public ComplexNumber invertSign() {
        return this.scale(-1);
    }

    /**
     * @param a
     * @return the conjugate of a complex numbers:
     */
    public static ComplexNumber conjugate(ComplexNumber a) {
        a.setImaginary(-a.getImaginary());
        return new ComplexNumber(a.getReal(), a.getImaginary());
    }
    
    /**
     * @param a
     * @return the reciprocal of complex number = z: 1/z = conjugate(z)/(re(z)^2
     * + im(z)^2)
     * @throws ProjectException.notAcceptableValueException
     */
    public static ComplexNumber reciprocal(ComplexNumber a) throws notAcceptableValueException {
        double scale = a.getReal() * a.getReal() + a.getImaginary() * a.getImaginary();
        if (scale == 0) {
            //JOPtionPaneMessage->error
            throw new notAcceptableValueException();
        }
        return new ComplexNumber(a.getReal() / scale, -a.getImaginary() / scale);
    }
    
    /**
     * @param a
     * @param b
     * @return the divide operation's result between two complex numebers :
     * @throws ProjectException.notAcceptableValueException
     */
    public static ComplexNumber divides(ComplexNumber a,ComplexNumber b) throws notAcceptableValueException {
        return ComplexNumber.multiply(a, ComplexNumber.reciprocal(b));
    }
    
    /** 
     * return the argument of a complex number
     * @param number1
     * @return double
     * @throws ProjectException.ArgumentNotDefinedException
     */
    public static double arg(ComplexNumber number1) throws ArgumentNotDefinedException{
        double r=number1.getReal();
        double i=number1.getImaginary();
        
        if(r==0 && i>0){
            return (Math.PI/2*1000d);
        }
        if(r==0 && i<0){
            return (-Math.PI/2);
        }
        if(r==0 && i==0){
            throw new ArgumentNotDefinedException("Arg of 0/0 is not defined");
        }
        if(r<0 && i>=0){
            return (Math.atan(i/r)+Math.PI);
        }
        if(r<0 && i<0){
            return (Math.atan(i/r)-Math.PI);
        } 
        return (Math.atan(i/r));
    }
    
     /** 
     * Return the square root of a complex number
     * @param number1
     * @return ComplexNumber
     * @throws ProjectException.ArgumentNotDefinedException
     */
    public static ComplexNumber sqrt(ComplexNumber number1) throws ArgumentNotDefinedException{
        double mod = mod(number1);
        double arg = arg(number1);
        double realTot=Math.round((Math.sqrt(mod)*Math.cos(arg/2))*1000d)/1000d;
        double immTot=Math.round((Math.sqrt(mod)*Math.sin(arg/2))*1000d)/1000d;
        ComplexNumber Result=new ComplexNumber(realTot, immTot);
        return Result;
    }

     
}
