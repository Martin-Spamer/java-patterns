/**
 * Created on 28-Jun-2004
 */
package coaching.model;

import org.slf4j.*;

/**
 * An abstract Vehicle class.
 */
public abstract class AbstractVehicle implements VehicleInterface, FuelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected AbstractEngine engine;
	protected Driver driver;

	/**
	 * Instantiates a new abstract vehicle.
	 *
	 * @param engine the engine
	 */
	public AbstractVehicle(final AbstractEngine engine) {
		this.engine = engine;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#setDriver(associations.Driver)
	 */
	@Override
	public AbstractVehicle setDriver(final Driver driver) {
		this.driver = driver;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#getDriver()
	 */
	@Override
	public Driver getDriver() {
		return driver;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#travel(java.lang.String)
	 */
	// Polymorphic interface
	@Override
	public VehicleInterface travel(final String destination) {
		log.info(destination);
		return this;
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
