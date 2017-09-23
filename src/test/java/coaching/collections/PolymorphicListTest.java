package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class PolymorphicListTest {

	private static final Logger LOG = LoggerFactory.getLogger(PolymorphicListTest.class);

	@Test
	public void testPolymorphicList() {
		LOG.info("testPolymorphicList");
		final PolymorphicList polymorphicList = new PolymorphicList();
		assertNotNull(polymorphicList);
		LOG.info("{}", polymorphicList.toString());
	}

	@Test
	public void testPolymorphicListUsage() {
		LOG.info("testPolymorphicList");
		final PolymorphicList polymorphicList = new PolymorphicList();
		assertNotNull(polymorphicList);
		polymorphicList.add(new Integer(0));
		LOG.info("{}", polymorphicList.toString());
	}

	@Test
	public void testAdd() {
		LOG.info("testAdd");
		final PolymorphicList polymorphicList = new PolymorphicList();
		assertNotNull(polymorphicList);
		assertNotNull(polymorphicList.add(1));
		LOG.info("{}", polymorphicList.toString());
	}

}
