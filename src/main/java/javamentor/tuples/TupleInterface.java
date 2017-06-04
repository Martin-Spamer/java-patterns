
package javamentor.tuples;

/**
 * The TupleInterface Interface.
 *
 * @param <L> the generic type
 * @param <R> the generic type
 */
public interface TupleInterface<L, R> {

	/**
	 * Sets the left.
	 *
	 * @param left the new left
	 */
	void setLeft(L left);

	/**
	 * Sets the right.
	 *
	 * @param right the new right
	 */
	void setRight(R right);

	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	L getLeft();

	/**
	 * Gets the right.
	 *
	 * @return the right
	 */
	R getRight();

	/**
	 * Return a shallow copy of this.
	 *
	 * @return the tuple
	 */
	TupleInterface<L, R> copy();

}