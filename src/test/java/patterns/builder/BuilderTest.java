
package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * The BuilderTest Class.
 */
public class BuilderTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuilderTest.class);

	/**
	 * Unit Test to build one.
	 */
	@Test
	public void testBuilderOne() {
		final BuilderOne builder = new BuilderOne();
		assertNotNull(builder);
		final Part product = builder.build();
		LOG.info("product = {}", product);
	}

	/**
	 * Unit Test to build two.
	 */
	@Test
	public void testBuilderTwo() {
		final BuilderTwo builder = new BuilderTwo();
		assertNotNull(builder);
		final Part product = builder.build();
		LOG.info("product = {}", product);
	}

}
