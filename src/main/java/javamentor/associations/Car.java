/**
 * Created on 28-Jun-2004
 *
 */
package javamentor.associations;

/**
 * The Car Class.
 */
public class Car extends AbstractVehicle {

	/**
	 * Instantiates a new car.
	 */
	public Car() {
		super(new PetrolEngine());
	}

	/**
	 * Instantiates a new car.
	 *
	 * @param engine the engine
	 */
	public Car(AbstractEngine engine) {
		super(engine);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	@Override
	public void fuelUp(FuelInterface fuel) {
	}

}
