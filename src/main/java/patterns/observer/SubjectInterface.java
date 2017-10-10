

package patterns.observer;

/**
 * Subject Interface.
 */
public interface SubjectInterface {

	/**
	 * Attach observer.
	 *
	 * @param observer the observer
	 */
	public void attachObserver(AbstractObserver observer);

	/**
	 * Detach observer.
	 *
	 * @param observer the observer
	 */
	public void detachObserver(ObserverInterface observer);

	/**
	 * Update observers.
	 */
	public void updateObservers();

}
