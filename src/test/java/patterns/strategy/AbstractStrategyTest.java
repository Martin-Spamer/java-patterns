
package patterns.strategy;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * class AbstractStrategyTest.
 */
public final class AbstractStrategyTest {

    /**  provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractStrategyTest.class);

    /**
     * Unit Test to operation.
     */
    @Test
    public void testContext() {
        final Context context = new Context();
        assertNotNull(context);
        LOG.info(context.toString());

        final StrategyInterface strategyAlice = new StrategyAlice(context);
        assertNotNull(strategyAlice);
        strategyAlice.operation();
        LOG.info(strategyAlice.toString());

        final StrategyInterface strategyBob = new StrategyBob(context);
        assertNotNull(strategyBob);
        strategyAlice.operation();
        LOG.info(strategyAlice.toString());

        final StrategyInterface strategyCharlie = new StrategyCharlie(context);
        assertNotNull(strategyCharlie);
        strategyAlice.operation();
        LOG.info(strategyAlice.toString());
    }

    /**
     * Unit test to context properties.
     */
    @Test
    public void testContextProperties() {
        final Context context = new Context(new Properties());
        assertNotNull(context);
        LOG.info(context.toString());

        final StrategyInterface strategyAlice = new StrategyAlice(context);
        assertNotNull(strategyAlice);
        strategyAlice.operation();
        LOG.info(strategyAlice.toString());

        final StrategyInterface strategyBob = new StrategyBob(context);
        assertNotNull(strategyBob);
        strategyAlice.operation();
        LOG.info(strategyAlice.toString());

        final StrategyInterface strategyCharlie = new StrategyCharlie(context);
        assertNotNull(strategyCharlie);
        strategyAlice.operation();
        LOG.info(strategyAlice.toString());
    }
}
