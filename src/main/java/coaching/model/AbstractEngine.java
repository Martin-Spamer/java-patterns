
package coaching.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Engine class.
 */
public abstract class AbstractEngine implements FuelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private FuelInterface fuel;

	/**
	 * Instantiates a new abstract engine.
	 *
	 * @param fuel
	 *            the fuel
	 */
	public AbstractEngine(final FuelInterface fuel) {
		super();
		fuelType(fuel);
	}

	/**
	 * Use fuel type.
	 *
	 * @param fuel
	 *            the fuel
	 */
	private final void fuelType(final FuelInterface fuel) {
		this.fuel = fuel;
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
