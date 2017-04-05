
package polymorphism;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The ConcreteSwitchTest Class.
 */
public class ConcreteSwitchTest {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(ConcreteSwitchTest.class);

	/**
	 * Test pass.
	 */
	@Test
	public void testPass() {
		final ConcreteSwitch command = new ConcreteSwitch();
		command.execute("PASS");
	}

	/**
	 * Test fail.
	 */
	@Test
	public void testFail() {
		final ConcreteSwitch command = new ConcreteSwitch();
		command.execute("FAIL");
	}

}
