
package automation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

/**
 * AbstractDataTest Class.
 */
public class AbstractDataTest {

	/**
	 * The TestData Class.
	 */
	public class TestData extends AbstractData {
	}

	/**
	 * Unit Test to abstract data.
	 */
	@Test
	public void testAbstractData() {
		final TestData testData = new TestData();
		assertNotNull(testData);
	}

	/**
	 * Unit Test to extend abstract data.
	 */
	@Test
	public void testExtendAbstractData() {
		final TestData testData = new TestData();
		assertNotNull(testData);
	}

	/**
	 * Unit Test to load null.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testLoadNull() throws Exception {
		new TestData().load(null);
	}

	/**
	 * Unit Test to load string.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testLoadString() throws Exception {
		final Class<? extends AbstractDataTest> thisClass = this.getClass();
		final InputStream inStream = thisClass.getResourceAsStream("./Data.csv");
		new TestData().load(inStream);
	}

	/**
	 * Unit Test to load from XML.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testLoadFromXML() throws Exception {
		final Class<? extends AbstractDataTest> thisClass = this.getClass();
		final InputStream inStream = thisClass.getResourceAsStream("./Data.csv");
		new TestData().loadFromXML(inStream);
	}

	/**
	 * Unit Test to store output stream.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStoreOutputStream() throws Exception {
		final OutputStream out = new FileOutputStream("./target/testOut.properties");
		new TestData().store(out);
	}

	/**
	 * Unit Test to store output stream string.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStoreOutputStreamString() throws Exception {
		final OutputStream out = new FileOutputStream("./target/testOut.properties");
		new TestData().store(out, "");
	}

	/**
	 * Unit Test to size.
	 */
	@Test
	public void testSize() {
		new TestData().size();
	}

	/**
	 * Unit Test to set get property.
	 */
	@Test
	public void testSetGetProperty() {
		final TestData testData = new TestData();
		final String key = "key";
		final String value = "value";
		testData.setProperty(key, value);
		final String actual = testData.getProperty(key);
		assertEquals(value, actual);
	}

	/**
	 * Unit Test to get property string string.
	 */
	@Test
	public void testGetPropertyStringString() {
		final TestData testData = new TestData();
		final String key = "key";
		final String defaultValue = "value";
		final String actual = testData.getProperty(key, defaultValue);
		assertEquals(defaultValue, actual);
	}

}
