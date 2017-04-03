
package associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Engine.
 */
public abstract class Engine implements Fuel {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + "]";
	}

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(Engine.class);

	/** The fuel. */
	protected Fuel fuel;

	/**
	 * Use fuel.
	 *
	 * @param fuel the fuel
	 */
	public void useFuel(Fuel fuel) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	public void fuelUp(Fuel fuel) {
	}

}
