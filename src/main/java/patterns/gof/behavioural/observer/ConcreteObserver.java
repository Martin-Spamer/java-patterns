
package patterns.gof.behavioural.observer;

/**
 * An asynchronous update interface for receiving notifications about Concrete
 * information as the Concrete is constructed.
 */
class ConcreteObserver extends Observer {

	/** The state. */
	public Object state;

	/** The my concrete subject. */
	public ConcreteSubject myConcreteSubject;

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.observer.Observer#update()
	 */
	@Override
	public void update() {
	}

}
