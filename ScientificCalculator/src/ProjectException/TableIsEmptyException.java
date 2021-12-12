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
public class TableIsEmptyException extends Exception {

    /**
     * Creates a new instance of <code>TableIsEmptyException</code> without
     * detail message.
     */
    public TableIsEmptyException() {
    }

    /**
     * Constructs an instance of <code>TableIsEmptyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TableIsEmptyException(String msg) {
        super(msg);
    }
}
