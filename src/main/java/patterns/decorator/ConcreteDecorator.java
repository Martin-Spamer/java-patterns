
package patterns.decorator;

/**
 * An example concrete decorator class.
 */
public class ConcreteDecorator extends AbstractComponent {

    /*
     * (non-Javadoc)
     * @see patterns.decorator.AbstractComponent#operation()
     */
    @Override
    public AbstractComponent operation() {
        log.info(this.getClass().getSimpleName());
        return this;
    }

}
