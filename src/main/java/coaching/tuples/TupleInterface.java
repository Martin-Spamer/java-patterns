

package coaching.tuples;

/**
 * Tuple Interface.
 *
 * generic type
 * generic type
 *
 * @param <L> the generic type
 * @param <R> the generic type
 */
public interface TupleInterface<L, R> {

	/**
	 * left.
	 *
	 * new left
	 *
	 * @param left the new
	 *            left
	 */
	public void setLeft(L left);

	/**
	 * right.
	 *
	 * @param right the new
	 *            right
	 */
	public void setRight(R right);

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
