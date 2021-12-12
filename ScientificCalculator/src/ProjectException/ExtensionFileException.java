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
public class ExtensionFileException extends Exception {

    /**
     * Creates a new instance of <code>ExtensionFileException</code> without
     * detail message.
     */
    public ExtensionFileException() {
    }

    /**
     * Constructs an instance of <code>ExtensionFileException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExtensionFileException(String msg) {
        super(msg);
    }
}
