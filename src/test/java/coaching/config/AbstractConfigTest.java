
package coaching.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The AbstractConfigTest Class.
 */
public class AbstractConfigTest {

	/**
	 * The Configuration Class.
	 */
	public class Configuration extends AbstractConfig {
	}

	/**
	 * Unit Test to abstract config.
	 */
	@Test
	public void testAbstractConfig() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to abstract Configuration string.
	 */
	@Test
	public void testAbstractConfigString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to load from property file.
	 */
	@Test
	public void testLoadFromPropertyFile() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to load from xml file.
	 */
	@Test
	public void testLoadFromXmlFile() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to get property string.
	 */
	@Test
	public void testGetPropertyString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to get property string string.
	 */
	@Test
	public void testGetPropertyStringString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to to property filename.
	 */
	@Test
	public void testToPropertyFilename() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to to xml filename.
	 */
	@Test
	public void testToXmlFilename() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to to string.
	 */
	@Test
	public void testToString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

}
