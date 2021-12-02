/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectException;

/**
 *
 * @author Michela
 */
public class NotVariableKeyException extends RuntimeException {
    
    /*
     * Creates a new instance of <code>NotVariableKeyException</code> without detail
     * message.
     */
    public NotVariableKeyException() {
    }

    /*
     * Constructs an instance of <code>NotVariableKeyException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NotVariableKeyException(String msg) {
        super(msg);
    }
}
