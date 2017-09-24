package patterns.strategy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AbstractStrategyTest {

	@Test
	public void testOperation() {
		final Context context = new Context();
		assertNotNull(context);
		final StrategyInterface strategyAlice = new StrategyAlice(context);
		assertNotNull(strategyAlice);
		final StrategyInterface strategyBob = new StrategyBob(context);
		assertNotNull(strategyBob);
		final StrategyInterface strategyCharlie = new StrategyCharlie(context);
		assertNotNull(strategyCharlie);
	}
}
