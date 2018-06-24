
package patterns.decorator;

/**
 * Decorator Interface.
 */
public interface DecoratorInterface {

    /**
     * Attach before behaviour.
     *
     * @param behaviour
     *            the behaviour
     */
    void attachBefore(final AbstractComponent behaviour);

    /**
     * Detach before behaviour.
     *
     * @param behaviour
     *            the behaviour
     */
    void detachBefore(final AbstractComponent behaviour);

    /**
     * Attach after behaviour.
     *
     * @param behaviour
     *            the behaviour
     */
    void attachAfter(final AbstractComponent behaviour);

    /**
     * Detach after behaviour.
     *
     * @param behaviour
     *            the behaviour
     */
    void detachAfter(final AbstractComponent behaviour);

}
