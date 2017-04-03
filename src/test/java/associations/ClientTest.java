/**
 * Created on 05-Jul-2004
 */
package associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ClientTest.
 */
public class ClientTest {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(ClientTest.class);

	/**
	 * Test example aggregation.
	 */
	@Test
	public void testExampleAggregation() {
		final Driver aDriver = new Driver("Alice");
		log.info("{}", aDriver);
	}

	/**
	 * Test example composition.
	 */
	@Test
	public void testExampleComposition() {
		final Vehicle aVehicle = new Car();
		log.info("{}", aVehicle);
	}

}
