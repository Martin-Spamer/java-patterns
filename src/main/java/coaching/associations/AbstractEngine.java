package coaching.associations;

import org.slf4j.*;

public abstract class AbstractEngine implements FuelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected FuelInterface fuel;

	public AbstractEngine(final FuelInterface fuel) {
		super();
		useFuel(fuel);
	}

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
		return "Engine [fuel=" + fuel + "]";
	}

}
