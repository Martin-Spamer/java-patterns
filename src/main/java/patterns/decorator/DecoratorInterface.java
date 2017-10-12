
package patterns.decorator;

/**
 * Decorator Interface.
 */
public interface DecoratorInterface {

	/**
	 * Attach before behaviour.
	 *
	 * @param behaviour the behaviour
	 */
	public void attachBefore(final AbstractComponent behaviour);

	/**
	 * Detach before behaviour.
	 *
	 * @param behaviour the behaviour
	 */
	public void detachBefore(final AbstractComponent behaviour);

	/**
	 * Attach after behaviour.
	 *
	 * @param behaviour the behaviour
	 */
	public void attachAfter(final AbstractComponent behaviour);

	/**
	 * Detach after behaviour.
	 *
	 * @param behaviour the behaviour
	 */
	public void detachAfter(final AbstractComponent behaviour);

}
