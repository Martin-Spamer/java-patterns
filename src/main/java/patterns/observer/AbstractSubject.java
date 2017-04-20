
package patterns.observer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Subject Class.
 */
public abstract class AbstractSubject {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private final List<AbstractObserver> observers = new ArrayList<AbstractObserver>();

	public void attach(final AbstractObserver observer) {
		observers.add(observer);
	}

	public void detach(final AbstractObserver observer) {
		observers.remove(observer);
	}

	public void updateObservers() {
		for (final AbstractObserver observer : observers) {
			observer.updateObservers();
		}
	}

}
