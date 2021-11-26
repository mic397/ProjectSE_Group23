/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectException;

/**
 *
 * @author Michela
 */
public class UnderTwoElementsException extends RuntimeException{
    
    /*
     * Creates a new instance of <code>UnderTwoElements</code> without detail
     * message.
     */
    public UnderTwoElementsException() {
    }

    /*
     * Constructs an instance of <code>LessOf2Elements</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UnderTwoElementsException(String msg) {
        super(msg);
    }
    
}
