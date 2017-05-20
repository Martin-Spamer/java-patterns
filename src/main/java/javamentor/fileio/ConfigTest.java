package javamentor.fileio;

import org.junit.Test;

public class ConfigTest {

	@Test
	public void test() {
		// Display the system properties.
		final java.util.Properties systemProperties = System.getProperties();
		systemProperties.list(System.out);

		// load a properties file.
		final Config propertiesFileExample = new Config("example.properties");
		propertiesFileExample.setProperty("TIMESTAMP", java.util.Calendar.getInstance().toString());
		propertiesFileExample.list(System.out);
		propertiesFileExample.save("example.properties");
	}

}
