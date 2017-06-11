
package javamentor.tuples;

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
	 * @param <X> the generic type
	 * @param <Y> the generic type
	 * @param <Z> the generic type
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the new instance of tuple
	 */
	public static <X, Y, Z> Triple<X, Y, Z> create(final X x, final Y y, final Z z) {
		return new Triple<X, Y, Z>(x, y, z);
	}

	/**
	 * Return a shallow copy of this.
	 *
	 * @return the tuple
	 */
	public Triple<X, Y, Z> copy() {
		return new Triple<X, Y, Z>(getX(), getY(), getZ());
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 * @return the triple
	 */
	public Triple<X, Y, Z> setX(final X x) {
		this.x = x;
		return this;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 * @return the triple
	 */
	public Triple<X, Y, Z> setY(final Y y) {
		this.y = y;
		return this;
	}

	/**
	 * Sets the z.
	 *
	 * @param z the new z
	 * @return the triple
	 */
	public Triple<X, Y, Z> setZ(final Z z) {
		this.z = z;
		return this;
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public X getX() {
		return this.x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public Y getY() {
		return this.y;
	}

	/**
	 * Gets the z.
	 *
	 * @return the z
	 */
	public Z getZ() {
		return this.z;
	}

	@Override
	public String toString() {
		return String.format("Triple [x=%s, y=%s, z=%s]", this.x, this.y, this.z);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.x == null ? 0 : this.x.hashCode());
		result = prime * result + (this.y == null ? 0 : this.y.hashCode());
		result = prime * result + (this.z == null ? 0 : this.z.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Triple other = (Triple) obj;
		if (this.x == null) {
			if (other.x != null) {
				return false;
			}
		} else if (!this.x.equals(other.x)) {
			return false;
		}
		if (this.y == null) {
			if (other.y != null) {
				return false;
			}
		} else if (!this.y.equals(other.y)) {
			return false;
		}
		if (this.z == null) {
			if (other.z != null) {
				return false;
			}
		} else if (!this.z.equals(other.z)) {
			return false;
		}
		return true;
	}

}
