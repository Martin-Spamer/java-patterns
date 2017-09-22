
package coaching.tuples;

/**
 * Triple Class.
 *
 * @param <X> the generic type
 * @param <Y> the generic type
 * @param <Z> the generic type
 */
public class Triple<X, Y, Z> {

	private X x;
	private Y y;
	private Z z;

	/**
	 * Instantiates a new tuple.
	 */
	public Triple() {
		super();
	}

	/**
	 * Instantiates a new triple.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 */
	public Triple(final X x, final Y y, final Z z) {
		super();
		setX(x);
		setY(y);
		setZ(z);
	}

	/**
	 * a factory method to create a instance of triple from default.
	 *
	 * @param <X> the generic type
	 * @param <Y> the generic type
	 * @param <Z> the generic type
	 * @return the triple
	 */
	public static <X, Y, Z> Triple<X, Y, Z> create() {
		return new Triple<X, Y, Z>();
	}

	/**
	 * a factory method to create a instance of triple from values.
	 *
	 * new instance of tuple
	 *
	 * @param <X> the generic type
	 * @param <Y> the generic type
	 * @param <Z> the generic type
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the triple
	 */
	public static <X, Y, Z> Triple<X, Y, Z> create(final X x, final Y y, final Z z) {
		return new Triple<X, Y, Z>(x, y, z);
	}

	/**
	 * Return a shallow copy of this.
	 *
	 * @return the triple
	 */
	public Triple<X, Y, Z> copy() {
		return new Triple<X, Y, Z>(getX(), getY(), getZ());
	}

	/**
	 * x.
	 *
	 * @param x the x
	 * @return the triple
	 */
	public Triple<X, Y, Z> setX(final X x) {
		this.x = x;
		return this;
	}

	/**
	 * y.
	 *
	 * @param y the y
	 * @return the triple
	 */
	public Triple<X, Y, Z> setY(final Y y) {
		this.y = y;
		return this;
	}

	/**
	 * z.
	 *
	 * @param z the z
	 * @return the triple
	 */
	public Triple<X, Y, Z> setZ(final Z z) {
		this.z = z;
		return this;
	}

	/**
	 * x.
	 *
	 * @return the x
	 */
	public X getX() {
		return this.x;
	}

	/**
	 * y.
	 *
	 * @return the y
	 */
	public Y getY() {
		return this.y;
	}

	/**
	 * z.
	 *
	 * @return the z
	 */
	public Z getZ() {
		return this.z;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Triple [x=%s, y=%s, z=%s]", this.x, this.y, this.z);
	}

}
