


package coaching.model;

/**
 * PetrolEngine Class.
 */
public class PetrolEngine extends AbstractEngine implements FuelInterface {

	/**
	 * Instantiates a new petrol engine.
	 */
	public PetrolEngine() {
		super(new PetrolFuel());
	}

}
