
package patterns.gof.behavioural.observer;

/**
 * The Class Subject.
 */
public abstract class Subject {

	/** The my observer. */
	public Observer myObserver;

	/**
	 * Attach.
	 *
	 * @param observer the observer
	 */
	public void attach(final Observer observer) {
	}

	/**
	 * Detach.
	 *
	 * @param observer the observer
	 */
	public void detach(final Observer observer) {
	}

}