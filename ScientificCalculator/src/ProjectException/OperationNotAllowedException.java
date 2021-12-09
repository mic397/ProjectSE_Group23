/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectException;

/**
 *
 * @author Michela
 */
public class OperationNotAllowedException extends Exception{
    /*
     * Creates a new instance of <code>OperationNotAllowedException</code> without detail
     * message.
     */
    public OperationNotAllowedException() {
    }

    /*
     * Constructs an instance of <code>OperationNotAllowedException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public OperationNotAllowedException(String msg) {
        super(msg);
    }
}
