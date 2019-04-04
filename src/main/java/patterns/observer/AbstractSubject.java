
package patterns.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * AbstractSubject Class.
 */
@Slf4j
public abstract class AbstractSubject implements SubjectInterface {

    /** The observers. */
    private final List<AbstractObserver> observers = new ArrayList<>();

    /*
     * (non-Javadoc)
     * @see patterns.observer.SubjectInterface#attachObserver(patterns.observer.
     * AbstractObserver)
     */
    @Override
    public void attachObserver(final AbstractObserver observer) {
        observers.add(observer);
    }

    /*
     * (non-Javadoc)
     * @see patterns.observer.SubjectInterface#detachObserver(patterns.observer.
     * ObserverInterface)
     */
    @Override
    public void detachObserver(final ObserverInterface observer) {
        observers.remove(observer);
    }

    /*
     * (non-Javadoc)
     * @see patterns.observer.SubjectInterface#updateObservers()
     */
    @Override
    public void updateObservers() {
        for (final ObserverInterface observer : observers) {
            observer.updateObservers();
        }
    }
}
