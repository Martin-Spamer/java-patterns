


package coaching.idioms;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * StaticLoggingTest Class.
 */
public class StaticLoggingTest {

	private static final Logger LOG = LoggerFactory.getLogger(StaticLoggingTest.class);

	/**
	 * Unit Test to send to log.
	 */
	@Test
	public void testSendToLog() {
		assertNotNull("Value cannot be null", LOG);
	}

}
