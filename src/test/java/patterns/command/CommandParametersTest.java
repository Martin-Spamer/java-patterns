
package patterns.command;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CommandParametersTest Class.
 */
public class CommandParametersTest {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * The MockCommandParameters Class.
	 */
	public class MockCommandParameters extends AbstractParameters {

		/**
		 * Instantiates a new mock command parameters.
		 */
		public MockCommandParameters() {
			super();
		}

		/**
		 * Instantiates a new mock command parameters.
		 *
		 * @param key the key
		 * @param value the value
		 */
		public MockCommandParameters(String key, String value) {
			super(key, value);
		}
	}

	/**
	 * Unit Test to abstract parameters.
	 */
	@Test
	public void testAbstractParameters() {
		final ParametersInterface commandParameters = new MockCommandParameters();
		assertNotNull(commandParameters);
		log.info("{}", commandParameters.toString());
	}

	/**
	 * Unit Test to abstract parameters string string.
	 */
	@Test
	public void testAbstractParametersStringString() {
		final ParametersInterface commandParameters = new MockCommandParameters("key", "value");
		assertNotNull(commandParameters);
		log.info("{}", commandParameters.toString());
		assertEquals("value", commandParameters.valueFor("key"));
	}

	/**
	 * Unit Test to get string.
	 */
	@Test
	public void testGetString() {
		final ParametersInterface commandParameters = new MockCommandParameters();
		assertNotNull(commandParameters);
		commandParameters.setPrameter("key", "value");
		log.info("{}", commandParameters.toString());
		assertEquals("value", commandParameters.valueFor("key"));
	}

}
