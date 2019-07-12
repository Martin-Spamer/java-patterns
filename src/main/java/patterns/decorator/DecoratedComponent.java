
package patterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * DecoratedComponent Class.
 */





@Slf4j
public class DecoratedComponent extends AbstractDecorator implements DecoratorInterface {

    /*
     * (non-Javadoc)
     * @see patterns.decorator.AbstractComponent#operation()
     */
    @Override
    public AbstractComponent operation() {
        super.beforeOperation();

        log.info("{}.operation", this.getClass().getSimpleName());

        super.afterOperation();

        return this;
    }

}
