
package javamentor.tuples;

/**
 * Box Class of type T.
 * 	E - Element/Enum
 * 	K - Key
 * 	N - Number
 * 	T - Type
 * 	V - Value
 * generic type
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
	 * t
	 *
	 * @param t the t
	 */
	public Box(final T t) {
		super();
		this.t = t;
	}

	/**
	 * Sets the.
	 *
	 * t
	 *
	 * @param t the t
	 */
	public void set(final T t) {
		this.t = t;
	}

	/**
	 * Gets the.
	 *
	 * t
	 *
	 * @return the t
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
