
package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstractSubject Class.
 */
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
        this.observers.add(observer);
    }

    /*
     * (non-Javadoc)
     * @see patterns.observer.SubjectInterface#detachObserver(patterns.observer.
     * ObserverInterface)
     */
    @Override
    public void detachObserver(final ObserverInterface observer) {
        this.observers.remove(observer);
    }

    /*
     * (non-Javadoc)
     * @see patterns.observer.SubjectInterface#updateObservers()
     */
    @Override
    public void updateObservers() {
        for (final ObserverInterface observer : this.observers) {
            observer.updateObservers();
        }
    }
}
