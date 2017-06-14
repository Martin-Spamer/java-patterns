
package patterns.observer;

/**
 * SubjectInterface Interface.
 */
public interface SubjectInterface {

	/**
	 * Attach observer.
	 *
	 * observer
	 *
	 * @param observer the observer
	 */
	void attachObserver(AbstractObserver observer);

	/**
	 * Detach observer.
	 *
	 * observer
	 *
	 * @param observer the observer
	 */
	void detachObserver(ObserverInterface observer);

	/**
	 * Update observers.
	 */
	void updateObservers();

}