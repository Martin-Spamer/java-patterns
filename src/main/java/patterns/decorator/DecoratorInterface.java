
package patterns.decorator;

/**
 * DecoratorInterface Interface.
 */
public interface DecoratorInterface {

	/**
	 * Attach before behaviour
	 *
	 * @param behaviour the behaviour
	 */
	public void attachBefore(AbstractComponent behaviour);

	/**
	 * Detach before behaviour
	 *
	 * @param behaviour the behaviour
	 */
	public void detachBefore(AbstractComponent behaviour);

	/**
	 * Attach after behaviour
	 *
	 * @param behaviour the behaviour
	 */
	public void attachAfter(AbstractComponent behaviour);

	/**
	 * Detach after behaviour
	 *
	 * @param behaviour the behaviour
	 */
	public void detachAfter(AbstractComponent behaviour);

}
