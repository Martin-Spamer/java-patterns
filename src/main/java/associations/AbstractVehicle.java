/**
 * Created on 28-Jun-2004
 */
package associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractVehicle Class.
 */
public abstract class AbstractVehicle implements VehicleInterface, FuelInterface {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	/** The engine. */
	protected AbstractEngine engine;
	
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
		return this.driver;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Vehicle#travel(java.lang.String)
	 */
	// Polymorphic interface
	public void travel(String destination) {
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
