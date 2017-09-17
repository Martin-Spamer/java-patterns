package patterns.strategy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AbstractStrategyTest {

	@Test
	public void testOperation() {
		final StrategyInterface strategyAlice = new StrategyAlice(new Context());
		assertNotNull(strategyAlice);
		final StrategyInterface strategyBob = new StrategyBob(new Context());
		assertNotNull(strategyBob);
		final StrategyInterface strategyCharlie = new StrategyCharlie(new Context());
		assertNotNull(strategyCharlie);
	}

}
