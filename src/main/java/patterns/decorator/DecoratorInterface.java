
package patterns.decorator;

/**
 * The DecoratorInterface Interface.
 */
public interface DecoratorInterface {

	/**
	 * Attach before.
	 *
	 * @param behaviour the behaviour
	 */
	public void attachBefore(AbstractComponent behaviour);

	/**
	 * Detach before.
	 *
	 * @param behaviour the behaviour
	 */
	public void detachBefore(AbstractComponent behaviour);

	/**
	 * Attach after.
	 *
	 * @param behaviour the behaviour
	 */
	public void attachAfter(AbstractComponent behaviour);

	/**
	 * Detach after.
	 *
	 * @param behaviour the behaviour
	 */
	public void detachAfter(AbstractComponent behaviour);

}
