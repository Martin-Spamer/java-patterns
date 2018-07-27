
package coaching.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generic Observable class, functions similar to @see java.util.Observable.
 *
 * @param <T> the generic type
 */
public class Observable<T> {

    /**
     * The Observer Interface.
     *
     * @param <U> the generic type
     */
    public interface Observer<U> {
        /**
         * Update.
         *
         * @param observer the observer
         * @param arg the arg
         */
        public void update(Observable<? extends U> observer, U arg);
    }

    /** The changed. */
    private boolean changed = false;

    /** The observers. */
    private final Collection<Observer<? super T>> observers;

    /**
     * Instantiates a new observable.
     */
    public Observable() {
        this(new ArrayList<Observer<? super T>>());
    }

    /**
     * Instantiates a new observable.
     *
     * @param t the t
     */
    public Observable(final Collection<Observer<? super T>> t) {
        observers = t;
    }

    /**
     * Adds the observer.
     *
     * @param observer the observer
     */
    public void addObserver(final Observer<? super T> observer) {
        synchronized (observers) {
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }
    }

    /**
     * Removes the observer.
     *
     * @param observer the observer
     */
    public void removeObserver(final Observer<? super T> observer) {
        synchronized (observers) {
            observers.remove(observer);
        }
    }

    /**
     * Clear observers.
     */
    public void clearObservers() {
        synchronized (observers) {
            this.observers.clear();
        }
    }

    /**
     * Sets the changed.
     */
    public void setChanged() {
        synchronized (observers) {
            this.changed = true;
        }
    }

    /**
     * Clear changed.
     */
    public void clearChanged() {
        synchronized (observers) {
            this.changed = false;
        }
    }

    /**
     * Checks for changed.
     *
     * @return true, if successful
     */
    public boolean hasChanged() {
        synchronized (observers) {
            return this.changed;
        }
    }

    /**
     * Count observers.
     *
     * @return the int
     */
    public int countObservers() {
        synchronized (observers) {
            return observers.size();
        }
    }

    /**
     * Notify observers.
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * Notify observers.
     *
     * @param value the value
     */
    public void notifyObservers(final T value) {
        ArrayList<Observer<? super T>> toNotify = null;
        synchronized (observers) {
            if (!changed) {
                return;
            }
            toNotify = new ArrayList<>(observers);
            changed = false;
        }
        for (final Observer<? super T> observer : toNotify) {
            observer.update(this, value);
        }
    }
}
