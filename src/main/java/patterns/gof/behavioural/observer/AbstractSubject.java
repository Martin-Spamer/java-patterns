
package patterns.gof.behavioural.observer;

/**
 * The Subject Class.
 */
public abstract class AbstractSubject {

	/** The my observer. */
	public AbstractObserver myObserver;

	/**
	 * Attach.
	 *
	 * @param observer the observer
	 */
	public void attach(final AbstractObserver observer) {
	}

	/**
	 * Detach.
	 *
	 * @param observer the observer
	 */
	public void detach(final AbstractObserver observer) {
	}

}