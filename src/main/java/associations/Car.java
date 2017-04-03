/**
 * Created on 28-Jun-2004
 *
 */
package associations;

/**
 * The Class Car.
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
	public Car(Engine engine) {
		super(engine);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	public void fuelUp(Fuel fuel) {
	}

}
