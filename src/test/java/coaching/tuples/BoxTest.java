
package coaching.tuples;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The BoxTest Class.
 */
public class BoxTest {

	private static final Logger LOG = LoggerFactory.getLogger(BoxTest.class);

	/**
	 * Unit Test to box.
	 */
	@Test
	public void testBox() {
		final Box<String> box = new Box<String>();
		assertNotNull(box);
	}

	/**
	 * Test box object.
	 */
	@Test
	public void testBoxObject() {
		final Box<Object> box = new Box<Object>();
		assertNotNull(box);
		LOG.info(box.toString());
	}

	/**
	 * Test box string.
	 */
	@Test
	public void testBoxString() {
		final Box<String> box = new Box<String>();
		assertNotNull(box);
		LOG.info(box.toString());
	}

}