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
public class NoSelectedRowException extends Exception {

    /**
     * Creates a new instance of <code>NoSelectedRowException</code> without
     * detail message.
     */
    public NoSelectedRowException() {
    }

    /**
     * Constructs an instance of <code>NoSelectedRowException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoSelectedRowException(String msg) {
        super(msg);
    }
}
