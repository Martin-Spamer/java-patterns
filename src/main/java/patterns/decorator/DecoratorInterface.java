
package patterns.decorator;

/**
 * Decorator Interface.
 */
public interface DecoratorInterface {

    /**
     * Attach before behaviour.
     *
     * @param behaviour            the behaviour
     * @return the decorator interface
     */
    DecoratorInterface attachBefore(final AbstractComponent behaviour);

    /**
     * Detach before behaviour.
     *
     * @param behaviour            the behaviour
     * @return the decorator interface
     */
    DecoratorInterface detachBefore(final AbstractComponent behaviour);

    /**
     * Attach after behaviour.
     *
     * @param behaviour            the behaviour
     * @return the decorator interface
     */
    DecoratorInterface attachAfter(final AbstractComponent behaviour);

    /**
     * Detach after behaviour.
     *
     * @param behaviour            the behaviour
     * @return the decorator interface
     */
    DecoratorInterface detachAfter(final AbstractComponent behaviour);

}
