/**
 * Created on 05-Jul-2004
 */
package coaching.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClientTest Class.
 */
public class AssociationsTest {

	private static final Logger log = LoggerFactory.getLogger(AssociationsTest.class);

	/**
	 * Unit Test for Car example.
	 */
	@Test
	public void testExampleComposition() {
		final VehicleInterface car = new Car();
		assertNotNull("Value cannot be null", car);
		log.info("{}", car);
	}

	/**
	 * Unit Test for Truck example.
	 */
	@Test
	public void testExampleTruck() {
		final Truck truck = new Truck();
		assertNotNull("Value cannot be null", truck);
		log.info("{}", truck);
	}

	/**
	 * Example aggregation.
	 */
	@Test
	public void testExampleAggregation() {
		final Driver driver = new Driver("Alice");
		assertNotNull("Value cannot be null", driver);
		final Car car = new Car();
		assertNotNull("Value cannot be null", car);
		car.setDriver(driver);
		log.info("{}", car);
	}

	/**
	 * Unit Test to example taxi.
	 */
	@Test
	public void testExampleTaxi() {
		final Taxi taxi = new Taxi();
		assertNotNull("Value cannot be null", taxi);
		final Passenger passenger = new Passenger("Bob");
		assertNotNull("Value cannot be null", passenger);
		taxi.setPassenger(passenger);
		log.info("{}", taxi);
	}

	/**
	 * Unit Test to example motor cycle rider.
	 */
	@Test
	public void testExampleMotorCycleRider() {
		final MotorCycle motorCycle = new MotorCycle();
		assertNotNull("Value cannot be null", motorCycle);
		final Rider rider = new Rider();
		assertNotNull("Value cannot be null", rider);
		motorCycle.setRider(rider);
		log.info("{}", motorCycle);
	}

}
