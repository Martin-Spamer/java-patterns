/**
 * Created on 05-Jul-2004
 */
package coaching.associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClientTest Class.
 */
public class AssociationsTest {

	private static final Logger log = LoggerFactory.getLogger(AssociationsTest.class);

	/**
	 * Example aggregation.
	 */
	@Test
	public void testExampleAggregation() {
		final Driver driver = new Driver("Alice");
		final Car car = new Car();
		car.setDriver(driver);
		log.info("{}", car);
	}

	/**
	 * Example composition.
	 */
	@Test
	public void testExampleComposition() {
		final VehicleInterface aCar = new Car();
		log.info("{}", aCar);
	}

	/**
	 * Unit Test to example taxi.
	 */
	@Test
	public void testExampleTaxi() {
		final Passenger passenger = new Passenger();
		final Taxi taxi = new Taxi();
		taxi.setPassenger(passenger);
		log.info("{}", taxi);
	}

	/**
	 * Unit Test to example motor cycle rider.
	 */
	@Test
	public void testExampleMotorCycleRider() {
		final Rider rider = new Rider();
		final MotorCycle motorCycle = new MotorCycle();
		motorCycle.setRider(rider);
		log.info("{}", motorCycle);
	}

	/**
	 * Unit Test to example truck.
	 */
	@Test
	public void testExampleTruck() {
		final Truck truck = new Truck();
		log.info("{}", truck);
	}

}
