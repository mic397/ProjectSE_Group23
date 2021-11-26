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
public class notAcceptableValueException extends Exception {

    /**
     * Creates a new instance of <code>notAcceptableValueException</code>
     * without detail message.
     */
    public notAcceptableValueException() {
    }

    /**
     * Constructs an instance of <code>notAcceptableValueException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public notAcceptableValueException(String msg) {
        super(msg);
    }
}
