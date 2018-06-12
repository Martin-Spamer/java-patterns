
package coaching.tuples;

/**
 * Tuple Interface.
 *
 * @param <L>
 *            the l generic type L.
 * @param <R>
 *            the r generic type R.
 */
public interface TupleInterface<L, R> {

	/**
	 * left.
	 *
	 * new left
	 *
	 * @param left
	 *            the new left
	 */
	public void setLeft(final L left);

	/**
	 * right.
	 *
	 * @param right
	 *            the new right
	 */
	public void setRight(final R right);

	/**
	 * left.
	 *
	 * @return the left
	 */
	public L getLeft();

	/**
	 * right.
	 *
	 * @return the right
	 */
	public R getRight();

	/**
	 * Return a shallow copy of this.
	 *
	 * @return the tuple interface
	 */
	public TupleInterface<L, R> copy();

}
