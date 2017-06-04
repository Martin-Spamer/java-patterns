package javamentor.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AbstractConfigTest {

	public class Configuration extends AbstractConfig {
	}

	@Test
	public void testAbstractConfig() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testAbstractConfigString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testLoadFromPropertyFile() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testLoadFromXmlFile() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testGetPropertyString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testGetPropertyStringString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testToPropertyFilename() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testToXmlFilename() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	@Test
	public void testToString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

}
