
package polymorphism;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The ConcreteSwitchTest Class.
 */
public class ConcreteSwitchTest {

	protected final Logger log = LoggerFactory.getLogger(ConcreteSwitchTest.class);

	/**
	 * Test pass.
	 */
	@Test
	public void testPass() {
		final ConcreteSwitch command = new ConcreteSwitch();
		assertNotNull(command.execute("PASS"));
	}

	/**
	 * Test fail.
	 */
	@Test
	public void testFail() {
		final ConcreteSwitch command = new ConcreteSwitch();
		assertNotNull(command.execute("FAIL"));
	}

}
