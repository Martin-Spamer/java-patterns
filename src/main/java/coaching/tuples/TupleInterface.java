
package coaching.tuples;

/**
 * TupleInterface Interface.
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
	 * 			left
	 */
	void setLeft(L left);

	/**
	 * right.
	 *
	 * new right
	 *
	 * @param right the new
	 * 			right
	 */
	void setRight(R right);

	/**
	 * left.
	 *
	 * left
	 *
	 * @return the left
	 */
	L getLeft();

	/**
	 * right.
	 *
	 * right
	 *
	 * @return the right
	 */
	R getRight();

	/**
	 * Return a shallow copy of this.
	 *
	 * tuple
	 *
	 * @return the tuple interface
	 */
	TupleInterface<L, R> copy();

}