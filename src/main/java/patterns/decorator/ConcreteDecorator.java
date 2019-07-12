
package patterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * An example concrete decorator class.
 */





@Slf4j
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
