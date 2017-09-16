
package coaching.associations;

import org.slf4j.*;

/**
 * class AbstractEngine.
 */
public abstract class AbstractEngine implements FuelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected FuelInterface fuel;

	/**
	 * Instantiates a new abstract engine.
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [fuel=" + this.fuel + "]";
	}

}
