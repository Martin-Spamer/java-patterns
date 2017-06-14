
package javamentor.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The PropertyConfigTest Class.
 */
public class PropertyConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(PropertyConfigTest.class);

	/**
	 * Unit Test to.
	 */
	@Test
	public void test() {
		final PropertyConfig config = new PropertyConfig();
		assertNotNull(config);
		LOG.debug("config = {}", config);
	}

}
