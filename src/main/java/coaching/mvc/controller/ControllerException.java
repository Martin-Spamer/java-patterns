/*
 * CommandException.java
 *
 * Created on 18 April 2006, 21:19
 *
 * To change this template, choose Tools | Template Manager
 * editor.
 */

package coaching.mvc.controller;

/**
 * ControllerException class.
 */
@SuppressWarnings("serial")
public class ControllerException extends Exception {

    /**
     * Instantiates a new controller exception.
     *
     * @param msg the msg
     */
    public ControllerException(final String msg) {
        super(msg);
    }
}
