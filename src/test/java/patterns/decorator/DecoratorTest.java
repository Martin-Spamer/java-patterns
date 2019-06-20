
package patterns.decorator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit Test for an abstract Decorator class.
 */


/** The Constant 			log. */
@Slf4j
public final class DecoratorTest {

    /**
 * The MissingOperation.
     */
    public final class MissingOperation extends AbstractComponent {
    }

    /**
 * The ConcreteDecorator.
     */
    public final class ConcreteDecorator extends AbstractComponent {
        /*
         * (non-Javadoc)
         * @see patterns.decorator.AbstractComponent#operation()
         */
        @Override
        public AbstractComponent operation() {
            final String simpleName = this.getClass().getSimpleName();
            log.info(simpleName.toString());
            return this;
        }
    }

    /**
     * Unit Test to operation.
     */
    @Test
    public void testDecoratedComponentOperation() {
        final DecoratedComponent component = new DecoratedComponent();
        assertNotNull(component);
        assertNotNull(component.operation());
        log.info(component.toString());
    }

    /**
     * Unit Test to operation.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testMissingOperationImplementation() {
        final MissingOperation missingOperation = new MissingOperation();
        assertNotNull(missingOperation);
        missingOperation.operation();
    }

    /**
     * Unit Test to before Operation.
     */
    @Test
    public void testBeforeOperation() {
        final DecoratedComponent component = new DecoratedComponent();
        assertNotNull(component);

        final AbstractComponent behaviour = new ConcreteDecorator();
        assertNotNull(behaviour);

        assertNotNull(component.attachBefore(behaviour));
        assertNotNull(component.operation());
        assertNotNull(component.detachBefore(behaviour));
        assertNotNull(component.operation());

        log.info(component.toString());
    }

    /**
     * Unit Test to after Operation.
     */
    @Test
    public void testAfterOperation() {
        final DecoratedComponent component = new DecoratedComponent();
        assertNotNull(component);

        final AbstractComponent behaviour = new ConcreteDecorator();
        assertNotNull(behaviour);

        component.attachAfter(behaviour);
        component.operation();
        component.detachAfter(behaviour);
        component.operation();

        log.info(component.toString());
    }

}
