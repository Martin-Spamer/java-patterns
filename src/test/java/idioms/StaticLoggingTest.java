
package idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The StaticLoggingTest Class.
 */
public class StaticLoggingTest {

	private static final Logger LOG = LoggerFactory.getLogger(StaticLoggingTest.class);

	/**
	 * Unit Test to to log.
	 */
	@Test
	public void testToLog() {
		new StaticLogging().toLog();
	}

	/**
	 * Unit Test to log to.
	 */
	@Test
	public void testLogTo() {
		new StaticLogging().logTo(LOG);
	}

}
