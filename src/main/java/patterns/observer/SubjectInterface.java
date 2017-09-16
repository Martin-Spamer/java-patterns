
package patterns.observer;

/**
 * SubjectInterface Interface.
 */
public interface SubjectInterface {

	/**
	 * Attach observer.
	 *
	 * @param observer the observer
	 */
	void attachObserver(AbstractObserver observer);

	/**
	 * Detach observer.
	 *
	 * @param observer the observer
	 */
	void detachObserver(ObserverInterface observer);

	/**
	 * Update observers.
	 */
	void updateObservers();

}
