
package coaching.tuples;

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
