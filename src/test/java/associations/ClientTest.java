/**
 * Created on 05-Jul-2004
 */
package associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientTest {
	private static final Logger log = LoggerFactory.getLogger(ClientTest.class);

	@Test
	public void testExampleAggregation() {
		final Driver aDriver = new Driver("Alice");
		log.info("{}", aDriver);
	}

	@Test
	public void testExampleComposition() {
		final Vehicle aVehicle = new Car();
		log.info("{}", aVehicle);
	}

}
