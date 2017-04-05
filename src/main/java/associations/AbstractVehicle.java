/**
 * Created on 28-Jun-2004
 */
package associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractVehicle Class.
 */
public abstract class AbstractVehicle implements VehicleInterface, FuelInterface, JourneyInterface {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(AbstractVehicle.class);

	/** The engine. */
	private AbstractEngine engine;

	/** The driver. */
	protected Driver driver;

	/**
	 * Instantiates a new abstract vehicle.
	 */
	public AbstractVehicle() {
	}

	/**
	 * Instantiates a new abstract vehicle.
	 *
	 * @param engine the engine
	 */
	public AbstractVehicle(AbstractEngine engine) {
		this.engine = engine;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#setDriver(associations.Driver)
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#getDriver()
	 */
	public Driver getDriver() {
		return driver;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#travel(java.lang.String)
	 */
	// Polymorphic interface
	public void travel(String destination) {
		engine.useFuel(engine);
		log.info(destination);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractVehicle [engine=" + engine + ", driver=" + driver + "]";
	}

}
