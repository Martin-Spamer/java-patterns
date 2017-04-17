
package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Subject Class.
 */
public abstract class AbstractSubject {

	private final List<AbstractObserver> observers = new ArrayList<AbstractObserver>();

	public void attach(final AbstractObserver observer) {
		this.observers.add(observer);
	}

	public void detach(final AbstractObserver observer) {
		this.observers.remove(observer);
	}

	public void updateObservers() {
		for (final AbstractObserver observer : this.observers) {
			observer.updateObservers();
		}
	}

}
