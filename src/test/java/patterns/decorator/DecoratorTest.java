
package patterns.decorator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The AbstractDecoratorTest Class.
 */
public class DecoratorTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(DecoratorTest.class);

    /**
     * Unit Test to operation.
     */
    @Test
    public void testDecoratedComponentOperation() {
        final DecoratedComponent component = new DecoratedComponent();
        assertNotNull(component);
        assertNotNull(component.operation());
        LOG.info("{}", component.toString());
    }

    /**
     * Unit Test to before.
     */
    @Test
    public void testBeforeOperation() {
        final DecoratedComponent component = new DecoratedComponent();
        assertNotNull(component);

        final AbstractComponent behaviour = new ConcreteDecorator();
        assertNotNull(component.attachBefore(behaviour));
        assertNotNull(component.operation());
        assertNotNull(component.detachBefore(behaviour));
        assertNotNull(component.operation());
        LOG.info("{}", component.toString());
    }

    /**
     * Unit Test to after.
     */
    @Test
    public void testAfter() {
        final DecoratedComponent component = new DecoratedComponent();
        assertNotNull(component);
        final AbstractComponent behaviour = new ConcreteDecorator();
        component.attachAfter(behaviour);
        component.operation();
        component.detachAfter(behaviour);
        component.operation();
    }

}
