
package idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractLoggingTest Class.
 */
public class AbstractLoggingTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractLoggingTest.class);

	/**
	 * The MockLog Class.
	 */
	public final class MockLog extends AbstractLogging {
	}

	/**
	 * Unit Test to to log.
	 */
	@Test
	public void testToLog() {
		new MockLog().toLog();
	}

	/**
	 * Unit Test to log to.
	 */
	@Test
	public void testLogTo() {
		new MockLog().logTo(LOG);
	}

}
