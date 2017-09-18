package automation;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;

/**
 * Abstract Data Test Class.
 */
public class AbstractDataTest {

	/**
	 * TestData Class.
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
		final TestData testData = new TestData();
		assertNotNull(testData);
		assertNotNull(testData.load(null));
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
		final TestData testData = new TestData();
		assertNotNull(testData.load(inStream));
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
		final TestData testData = new TestData();
		assertNotNull(testData.loadFromXML(inStream));
	}

	/**
	 * Unit Test to store output stream.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStoreOutputStream() throws Exception {
		final OutputStream out = new FileOutputStream("./target/testOut.properties");
		final TestData testData = new TestData();
		assertNotNull(testData.store(out));
	}

	/**
	 * Unit Test to store output stream string.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStoreOutputStreamString() throws Exception {
		final OutputStream out = new FileOutputStream("./target/testOut.properties");
		final TestData testData = new TestData();
		assertNotNull(testData.store(out, this.getClass().getSimpleName()));
	}

	/**
	 * Unit Test to size.
	 */
	@Test
	public void testSize() {
		final TestData testData = new TestData();
		assertNotNull(testData);
		assertEquals(0, testData.size());
	}

	/**
	 * Unit Test to set get property.
	 */
	@Test
	public void testSetGetProperty() {
		final TestData testData = new TestData();
		assertNotNull(testData);
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
		assertNotNull(testData);
		final String key = "key";
		final String defaultValue = "value";
		final String actual = testData.getProperty(key, defaultValue);
		assertEquals(defaultValue, actual);
	}

}
