
package patterns.strategy;

import java.util.Properties;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class AbstractStrategyTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testContext() {
        final Context context = new Context();
        assertNotNull(context);
        log.info(context.toString());

        final Strategy strategyAlice = new StrategyAlice(context);
        assertNotNull(strategyAlice);
        strategyAlice.operation();
        log.info(strategyAlice.toString());

        final Strategy strategyBob = new StrategyBob(context);
        assertNotNull(strategyBob);
        strategyBob.operation();
        log.info(strategyBob.toString());

        final Strategy strategyCharlie = new StrategyCharlie(context);
        assertNotNull(strategyCharlie);
        strategyCharlie.operation();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testContextProperties() {
        final Context context = new Context(new Properties());
        assertNotNull(context);
        log.info(context.toString());

        final Strategy strategyAlice = new StrategyAlice(context);
        assertNotNull(strategyAlice);
        strategyAlice.operation();
        log.info(strategyAlice.toString());

        final Strategy strategyBob = new StrategyBob(context);
        assertNotNull(strategyBob);
        strategyBob.operation();
        log.info(strategyBob.toString());

        final Strategy strategyCharlie = new StrategyCharlie(context);
        assertNotNull(strategyCharlie);
        strategyCharlie.operation();
        log.info(strategyCharlie.toString());
    }
}
