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
public class stackIsEmptyException extends Exception {

    /**
     * Creates a new instance of <code>stackIsEmptyException</code> without
     * detail message.
     */
    public stackIsEmptyException() {
    }

    /**
     * Constructs an instance of <code>stackIsEmptyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public stackIsEmptyException(String msg) {
        super(msg);
    }
}
