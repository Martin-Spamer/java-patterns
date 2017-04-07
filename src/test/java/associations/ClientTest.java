/**
 * Created on 05-Jul-2004
 */
package associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClientTest Class.
 */
public class ClientTest {

	private static final Logger log = LoggerFactory.getLogger(ClientTest.class);

	/**
	 * Example aggregation.
	 */
	@Test
	public void testExampleAggregation() {
		final Driver aDriver = new Driver("Alice");
		log.info("{}", aDriver);
	}

	/**
	 * Example composition.
	 */
	@Test
	public void testExampleComposition() {
		final VehicleInterface aCar = new Car();
		log.info("{}", aCar);
	}

	@Test
	public void testExampleaTaxi() {
		final Taxi taxi = new Taxi();
		log.info("{}", taxi);
	}

}
