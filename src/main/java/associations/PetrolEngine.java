
package associations;

/**
 * The PetrolEngine Class.
 */
public class PetrolEngine extends AbstractEngine implements FuelInterface {

	/**
	 * Instantiates a new petrol engine.
	 */
	public PetrolEngine() {
		super(new PetrolFuel());
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
