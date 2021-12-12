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
public class UnsuitableFileException extends Exception {

    /**
     * Creates a new instance of <code>UnsuitableFileException</code> without
     * detail message.
     */
    public UnsuitableFileException() {
    }

    /**
     * Constructs an instance of <code>UnsuitableFileException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnsuitableFileException(String msg) {
        super(msg);
    }
}
