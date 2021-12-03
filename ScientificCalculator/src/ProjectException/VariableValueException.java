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
public class VariableValueException extends Exception {

    /**
     * Creates a new instance of <code>VariableValueException</code> without
     * detail message.
     */
    public VariableValueException() {
    }

    /**
     * Constructs an instance of <code>VariableValueException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public VariableValueException(String msg) {
        super(msg);
    }
}
