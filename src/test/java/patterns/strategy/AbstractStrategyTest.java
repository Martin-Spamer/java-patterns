
package patterns.strategy;

import java.util.Properties;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class AbstractStrategyTest.
 */
@Slf4j
public final class AbstractStrategyTest {

    /**
     * Unit Test to operation.
     */
    @Test
    public void testContext() {
        final Context context = new Context();
        assertNotNull(context);
        log.info(context.toString());

        final StrategyInterface strategyAlice = new StrategyAlice(context);
        assertNotNull(strategyAlice);
        strategyAlice.operation();
        log.info(strategyAlice.toString());

        final StrategyInterface strategyBob = new StrategyBob(context);
        assertNotNull(strategyBob);
        strategyBob.operation();
        log.info(strategyBob.toString());

        final StrategyInterface strategyCharlie = new StrategyCharlie(context);
        assertNotNull(strategyCharlie);
        strategyCharlie.operation();
        log.info(strategyCharlie.toString());
    }

    /**
     * Unit test to context properties.
     */
    @Test
    public void testContextProperties() {
        final Context context = new Context(new Properties());
        assertNotNull(context);
        log.info(context.toString());

        final StrategyInterface strategyAlice = new StrategyAlice(context);
        assertNotNull(strategyAlice);
        strategyAlice.operation();
        log.info(strategyAlice.toString());

        final StrategyInterface strategyBob = new StrategyBob(context);
        assertNotNull(strategyBob);
        strategyBob.operation();
        log.info(strategyBob.toString());

        final StrategyInterface strategyCharlie = new StrategyCharlie(context);
        assertNotNull(strategyCharlie);
        strategyCharlie.operation();
        log.info(strategyCharlie.toString());
    }
}
