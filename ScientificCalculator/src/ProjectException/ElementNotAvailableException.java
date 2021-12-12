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
public class ElementNotAvailableException extends Exception {

    /**
     * Creates a new instance of <code>ElementNotAvailableException</code>
     * without detail message.
     */
    public ElementNotAvailableException() {
    }

    /**
     * Constructs an instance of <code>ElementNotAvailableException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ElementNotAvailableException(String msg) {
        super(msg);
    }
}
