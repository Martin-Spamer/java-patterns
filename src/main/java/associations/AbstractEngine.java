
package associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractEngine Class.
 */
public abstract class AbstractEngine implements FuelInterface {

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [fuel=" + this.fuel + "]";
	}

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(AbstractEngine.class);

	/** The fuel. */
	protected FuelInterface fuel;

	/**
	 * Use fuel.
	 *
	 * @param fuel the fuel
	 */
	public void useFuel(FuelInterface fuel) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	public void fuelUp(FuelInterface fuel) {
	}

}
