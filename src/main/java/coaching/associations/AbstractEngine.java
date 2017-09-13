package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractEngine Class.
 */
public abstract class AbstractEngine implements FuelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected FuelInterface fuel;

	/**
	 * Abstract engine constructor, engine must have fuel.
	 *
	 * @param fuel the fuel
	 */
	public AbstractEngine(final FuelInterface fuel) {
		super();
		useFuel(fuel);
	}

	/**
	 * Use fuel.
	 *
	 * @param fuel the fuel
	 */
	public void useFuel(final FuelInterface fuel) {
		this.fuel = fuel;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	@Override
	public void fuelUp(final FuelInterface fuel) {
		fuel.fuelUp(fuel);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [fuel=" + this.fuel + "]";
	}

}
