/*
 * ObserverInterface.java
 *
 * Created on 06 May 2006, 13:07
 *
 * To change this template, choose Tools | Template Manager
 * editor.
 */

package coaching.mvc;

import java.util.Observable;

/**
 * Observer Interface.
 */
public interface ObserverInterface {

    /**
     * Update.
     *
     * @param observable the observable
     * @param object the object
     */
    public void update(Observable observable, Object object);
}
