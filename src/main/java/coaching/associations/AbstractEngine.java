
package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractEngine Class.
 */
public abstract class AbstractEngine implements FuelInterface {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/** The fuel. */
	protected FuelInterface fuel;

	/**
	 * Instantiates a new abstract engine.
	 *
	 * fuel
	 *
	 * @param fuel the fuel
	 */
	public AbstractEngine(FuelInterface fuel) {
		super();
		useFuel(fuel);
	}

	/**
	 * Use fuel.
	 *
	 * fuel
	 *
	 * @param fuel the fuel
	 */
	public void useFuel(FuelInterface fuel) {
		this.fuel = fuel;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	@Override
	public void fuelUp(FuelInterface fuel) {
		fuel.fuelUp(fuel);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + "]";
	}

}
