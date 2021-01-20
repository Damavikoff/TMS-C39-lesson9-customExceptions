/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexps;

/**
 *
 * @author SharpSchnitzel
 */
public class InvalidFormatException extends RuntimeException {
    public InvalidFormatException () {
        super();
    }

    public InvalidFormatException (String message) {
        super(message);
    }

    public InvalidFormatException (Throwable cause) {
        super(cause);
    }

    public InvalidFormatException (String message, Throwable cause) {
        super(message, cause);
    }
}
