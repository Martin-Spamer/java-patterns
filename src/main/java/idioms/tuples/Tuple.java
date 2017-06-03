package idioms.tuples;

/**
 * The Twin Tuple Class.
 *
 * @param <L> the generic type
 * @param <R> the generic type
 */
public class Tuple<L, R> implements TupleInterface<L, R> {

	/** The left hand side of Tuple. */
	private L left;

	/** The right hand side of Tuple */
	private R right;

	/**
	 * Instantiates a new tuple.
	 */
	public Tuple() {
		super();
		this.left = null;
		this.right = null;
	}

	/**
	 * Instantiates a new tuple.
	 *
	 * @param left the left
	 * @param right the right
	 */
	public Tuple(final L left, final R right) {
		super();
		setLeft(left);
		setRight(right);
	}

	/**
	 * a factory method to create a instance of tuple from values.
	 *
	 * @param <L> the generic type
	 * @param <R> the generic type
	 * @param left the left
	 * @param right the right
	 * @return the new instance of tuple
	 */
	public static <L, R> TupleInterface<L, R> pair(final L left, final R right) {
		return new Tuple<L, R>(left, right);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see idioms.tuples.TupleInterface#setLeft(L)
	 */
	@Override
	public void setLeft(final L left) {
		this.left = left;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see idioms.tuples.TupleInterface#setRight(R)
	 */
	@Override
	public void setRight(final R right) {
		this.right = right;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see idioms.tuples.TupleInterface#getLeft()
	 */
	@Override
	public L getLeft() {
		return this.left;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see idioms.tuples.TupleInterface#getRight()
	 */
	@Override
	public R getRight() {
		return this.right;
	}

	/**
	 * Checks if is equal to.
	 *
	 * @param tuple the tuple
	 * @return true, if is equal to
	 */
	public boolean isEqualTo(final TupleInterface<L, R> tuple) {
		return this.left.equals(tuple.getLeft()) && this.right.equals(tuple.getRight());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see idioms.tuples.TupleInterface#copy()
	 */
	@Override
	public TupleInterface<L, R> copy() {
		return new Tuple<L, R>(getLeft(), getRight());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Tuple [left=%s, right=%s]", this.left, this.right);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.left == null ? 0 : this.left.hashCode());
		result = prime * result + (this.right == null ? 0 : this.right.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		final Tuple<L, R> other = (Tuple<L, R>) o;
		if (this.left == null) {
			if (other.left != null) {
				return false;
			}
		} else if (!this.left.equals(other.left)) {
			return false;
		}
		if (this.right == null) {
			if (other.right != null) {
				return false;
			}
		} else if (!this.right.equals(other.right)) {
			return false;
		}
		return true;
	}

}
