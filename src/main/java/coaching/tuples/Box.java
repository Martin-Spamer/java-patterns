
package coaching.tuples;

/**
 * Box class for generic type T.
 *
 * Boxing is an effective way of adapting the behaviour of a type.
 *
 * @param <T> the generic type
 */
public class Box<T> {

	protected T t;

	/**
	 * Instantiates a new box.
	 */
	public Box() {
	}

	/**
	 * Instantiates a new box.
	 *
	 * @param t the type T
	 */
	public Box(final T t) {
		super();
		this.t = t;
	}

	/**
	 * Sets the.
	 *
	 * @param t the type T
	 */
	public void set(final T t) {
		this.t = t;
	}

	/**
	 * Gets the.
	 *
	 * @return the t as type T
	 */
	public T get() {
		return this.t;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Box [t=%s]", this.t);
	}

}
