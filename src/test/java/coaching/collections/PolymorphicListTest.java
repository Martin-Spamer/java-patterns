
package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * class PolymorphicListTest.
 */
public class PolymorphicListTest {

	private static final Logger LOG = LoggerFactory.getLogger(PolymorphicListTest.class);

	/**
	 * Unit Test to polymorphic list.
	 */
	@Test
	public void testPolymorphicList() {
		LOG.info("testPolymorphicList");
		final PolymorphicList polymorphicList = new PolymorphicList();
		assertNotNull("Value cannot be null", polymorphicList);
		LOG.info("{}", polymorphicList.toString());
	}

	/**
	 * Unit Test to polymorphic list usage.
	 */
	@Test
	public void testPolymorphicListUsage() {
		LOG.info("testPolymorphicList");
		final PolymorphicList polymorphicList = new PolymorphicList();
		assertNotNull("Value cannot be null", polymorphicList);
		polymorphicList.add(new Integer(0));
		LOG.info("{}", polymorphicList.toString());
	}

	/**
	 * Unit Test to add.
	 */
	@Test
	public void testAdd() {
		LOG.info("testAdd");
		final PolymorphicList polymorphicList = new PolymorphicList();
		assertNotNull("Value cannot be null", polymorphicList);
		assertNotNull("Value cannot be null", polymorphicList.add(1));
		LOG.info("{}", polymorphicList.toString());
	}

}
