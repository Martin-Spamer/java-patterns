
package javamentor.fileio;

import org.junit.Test;

/**
 * ConfigTest Class.
 */
public class ConfigTest {

	/**
	 * Unit Test to.
	 */
	@Test
	public void test() {
		// * system properties.
		final java.util.Properties systemProperties = System.getProperties();
		systemProperties.list(System.out);

		// load a properties file.
		final Config propertiesFileExample = new Config("example.properties");
		propertiesFileExample.setProperty("TIMESTAMP", java.util.Calendar.getInstance().toString());
		propertiesFileExample.list(System.out);
		propertiesFileExample.save("example.properties");
	}

}
