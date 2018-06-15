
package patterns.observer;

/**
 * Subject Interface.
 */
public interface SubjectInterface {

    /**
     * Attach observer.
     *
     * @param observer
     *            the observer
     */
    public void attachObserver(final AbstractObserver observer);

    /**
     * Detach observer.
     *
     * @param observer
     *            the observer
     */
    public void detachObserver(final ObserverInterface observer);

    /**
     * Update observers.
     */
    public void updateObservers();

}
