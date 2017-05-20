/**
 * Created on 05-Jul-2004
 */
package javamentor.associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javamentor.associations.Car;
import javamentor.associations.Driver;
import javamentor.associations.MotorCycle;
import javamentor.associations.Passenger;
import javamentor.associations.Rider;
import javamentor.associations.Taxi;
import javamentor.associations.Truck;
import javamentor.associations.VehicleInterface;

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

	@Test
	public void testExampleTaxi() {
		final Passenger passenger = new Passenger();
		final Taxi taxi = new Taxi();
		taxi.setPassenger(passenger);
		log.info("{}", taxi);
	}

	@Test
	public void testExampleMotorCycleRider() {
		final Rider rider = new Rider();
		final MotorCycle motorCycle = new MotorCycle();
		motorCycle.setRider(rider);
		log.info("{}", motorCycle);
	}

	@Test
	public void testExampleTruck() {
		final Truck truck = new Truck();
		log.info("{}", truck);
	}

}
