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
public class ArgumentNotDefinedException extends Exception {

    /**
     * Creates a new instance of <code>ArgumentNotDefined</code> without detail
     * message.
     */
    public ArgumentNotDefinedException() {
    }

    /**
     * Constructs an instance of <code>ArgumentNotDefined</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArgumentNotDefinedException(String msg) {
        super(msg);
    }
}
