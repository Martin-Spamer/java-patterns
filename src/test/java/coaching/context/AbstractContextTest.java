package coaching.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;

public class AbstractContextTest {

	public class TestContext extends AbstractContext {

		private TestContext() {
			super();
		}

		/**
		 * @param properties
		 */
		private TestContext(final Properties properties) {
			super(properties);
		}
	}

	@Test
	public void testAbstractContext() {
		final TestContext testContext = new TestContext();
		assertNotNull(testContext);
	}

	@Test
	public void testAbstractContextProperties() {
		final TestContext testContext = new TestContext(new Properties());
		assertNotNull(testContext);
	}

	@Test
	public void testSetProperties() {
		final TestContext testContext = new TestContext();
		assertNotNull(testContext);
		testContext.setProperties(new Properties());
	}

	@Test
	public void testSetGetProperty() {
		final TestContext testContext = new TestContext();
		assertNotNull(testContext);
		final String key = "key";
		final String value = "value";
		testContext.setProperty(key, value);
		assertEquals(value, testContext.getProperty(key));
	}

}
