
package coaching.rules;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * The RulesEngineTest Class.
 */
public class RulesEngineTest {
	private static final Logger LOG = LoggerFactory.getLogger(RulesEngineTest.class);

	/**
	 * Unit Test to rules engine.
	 */
	@Test
	public void testRulesEngine() {
		LOG.info("testRulesEngine();");
		final RulesEngine rulesEngine = new RulesEngine();
		assertNotNull("Value cannot be null", rulesEngine);
	}

	/**
	 * Unit Test to execute.
	 */
	@Test
	public void testExecute() {
		LOG.info("new RulesEngine().execute();");
		final RulesEngine rulesEngine = new RulesEngine();
		assertNotNull("Value cannot be null", rulesEngine.execute());
	}

}
