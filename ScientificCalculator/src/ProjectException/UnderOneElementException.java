/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectException;

/**
 *
 * @author aniel
 */
public class UnderOneElementException extends Exception {

    /**
     * Creates a new instance of <code>UnderOneElement</code> without detail
     * message.
     */
    public UnderOneElementException() {
    }

    /**
     * Constructs an instance of <code>UnderOneElement</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UnderOneElementException(String msg) {
        super(msg);
    }
}
