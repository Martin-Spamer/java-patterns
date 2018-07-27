
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
