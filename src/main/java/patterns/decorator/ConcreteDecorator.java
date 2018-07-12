
package patterns.decorator;

/**
 * An example concrete decorator class.
 */
public class ConcreteDecorator extends AbstractComponent {

    /* (non-Javadoc)
     * @see patterns.decorator.AbstractComponent#operation()
     */
    @Override
    public AbstractComponent operation() {
        final String simpleName = this.getClass().getSimpleName();
        this.log.info(simpleName.toString());
        return this;
    }

}
