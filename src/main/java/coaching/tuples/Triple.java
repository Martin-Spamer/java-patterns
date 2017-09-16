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
	 * x
	 * y
	 * z
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
	 * generic type
	 * generic type
	 * generic type
	 * triple
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
	 * generic type
	 * generic type
	 * generic type
	 * x
	 * y
	 * z
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
	 * tuple
	 *
	 * @return the triple
	 */
	public Triple<X, Y, Z> copy() {
		return new Triple<X, Y, Z>(getX(), getY(), getZ());
	}

	/**
	 * x.
	 *
	 * new x
	 * triple
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
	 * new y
	 * triple
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
	 * new z
	 * triple
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
	 * x
	 *
	 * @return the x
	 */
	public X getX() {
		return this.x;
	}

	/**
	 * y.
	 *
	 * y
	 *
	 * @return the y
	 */
	public Y getY() {
		return this.y;
	}

	/**
	 * z.
	 *
	 * z
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.x == null ? 0 : this.x.hashCode());
		result = prime * result + (this.y == null ? 0 : this.y.hashCode());
		result = prime * result + (this.z == null ? 0 : this.z.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
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
