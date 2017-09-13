package coaching.rules;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		LOG.info("new RulesEngine();");
		new RulesEngine();
	}

	/**
	 * Unit Test to execute.
	 */
	@Test
	public void testExecute() {
		LOG.info("new RulesEngine().execute();");
		new RulesEngine().execute();
	}

}
