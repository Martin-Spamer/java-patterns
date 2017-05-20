
package javamentor.associations;

/**
 * The DieselEngine Class.
 */
public class DieselEngine extends AbstractEngine implements FuelInterface {

	/**
	 * Instantiates a new diesel engine.
	 */
	public DieselEngine() {
		super(new DieselFuel());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Engine#fuelUp(associations.Fuel)
	 */
	@Override
	public void fuelUp(FuelInterface fuel) {
	}

}
