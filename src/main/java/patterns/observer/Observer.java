
package patterns.observer;

/**
 * An asynchronous update interface for receiving notifications about Concrete
 * information as the Concrete is constructed.
 */
class Observer extends AbstractObserver {

	/** The state. */
	public Object state;

	/** The my concrete subject. */
	public Subject myConcreteSubject;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.observer.Observer#update()
	 */
	@Override
	public void update() {
	}

}
