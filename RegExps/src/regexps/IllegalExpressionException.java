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
public class IllegalExpressionException extends Exception {
    public IllegalExpressionException () {
        super();
    }

    public IllegalExpressionException (String message) {
        super(message);
    }

    public IllegalExpressionException (Throwable cause) {
        super(cause);
    }

    public IllegalExpressionException (String message, Throwable cause) {
        super(message, cause);
    }
}
