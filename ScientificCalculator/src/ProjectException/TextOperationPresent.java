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
public class TextOperationPresent extends Exception {

    /**
     * Creates a new instance of <code>TextOperationPresent</code> without
     * detail message.
     */
    public TextOperationPresent() {
    }

    /**
     * Constructs an instance of <code>TextOperationPresent</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TextOperationPresent(String msg) {
        super(msg);
    }
}
