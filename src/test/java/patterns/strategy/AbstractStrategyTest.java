package patterns.strategy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AbstractStrategyTest {

	@Test
	public void testOperation() {
		final Context context = new Context();
		assertNotNull("Value cannot be null",context);
		final StrategyInterface strategyAlice = new StrategyAlice(context);
		assertNotNull("Value cannot be null",strategyAlice);
		final StrategyInterface strategyBob = new StrategyBob(context);
		assertNotNull("Value cannot be null",strategyBob);
		final StrategyInterface strategyCharlie = new StrategyCharlie(context);
		assertNotNull("Value cannot be null",strategyCharlie);
	}
}
