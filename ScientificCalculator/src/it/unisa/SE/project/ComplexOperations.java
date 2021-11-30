/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.SE.project;

import ProjectException.ArgumentNotDefinedException;
import ProjectException.notAcceptableValueException;
import java.util.*;

/**
 *
 * @author Michela
 */
public class ComplexOperations {
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
     * @param num
     * @param alpha
     * @return the multiply operation's result between a complex number and a
     * scale.
     */
    
    public static ComplexNumber scale(ComplexNumber num, double alpha) {
        return new ComplexNumber(alpha * num.getReal(), alpha * num.getImaginary());
    }

    /**
     * @param num
     * @return a number with the inverted sign
     */
    
    public static ComplexNumber invertSign(ComplexNumber num) {
        return ComplexOperations.scale(num,-1);
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
    
     
    
    
    /**  
     * Return the multiplication between two complex numbers 
     * @param number1 
     * @param number2 
     * @return ComplexNumber 
     */ 
    public static ComplexNumber mul(ComplexNumber number1, ComplexNumber number2){ 
        double a=number1.getReal(); 
        double b=number1.getImaginary(); 
 
        double c=number2.getReal(); 
        double d=number2.getImaginary(); 
         
        double realTot=a*c-b*d; 
        double immTot=a*d+b*c; 
         
        ComplexNumber complexResult=new ComplexNumber(realTot, immTot); 
        return complexResult; 
    }
/**  
     * Return the division between two complex numbers
     * @param number1  first operan
     * @param number2  second operan
     * @return ComplexNumber    
     * @throws ArithmeticException Throws exceptio if second operand is 0 
     */
    
    public static ComplexNumber div(ComplexNumber number1, ComplexNumber number2) throws ArithmeticException{
        double r1=number1.getReal();
        double i1=number1.getImaginary();

        double r2=number2.getReal();
        double i2=number2.getImaginary();
        
        if((r2*r2+i2*i2)==0){
            throw new ArithmeticException("Division by 0");
        }
        double realTot=Math.round((r1*r2+i1*i2)/(r2*r2+i2*i2)*1000d)/1000d;
        double immTot=Math.round((i1*r2-r1*i2)/(r2*r2+i2*i2)*1000d)/1000d;

        ComplexNumber complexResult=new ComplexNumber(realTot, immTot);
        return complexResult;
    }
}
