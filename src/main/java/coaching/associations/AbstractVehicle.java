/**
 * Created on 28-Jun-2004
 */
package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractVehicle Class.
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
	public void setDriver(final Driver driver) {
		this.driver = driver;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#getDriver()
	 */
	@Override
	public Driver getDriver() {
		return this.driver;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#travel(java.lang.String)
	 */
	// Polymorphic interface
	@Override
	public void travel(final String destination) {
		this.engine.useFuel(this.engine);
		this.log.info(destination);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractVehicle [engine=" + this.engine + ", driver=" + this.driver + "]";
	}

}
