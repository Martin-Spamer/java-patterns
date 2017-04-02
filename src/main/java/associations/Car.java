/**
 * Created on 28-Jun-2004
 *
 */
package associations;

/**
 * The Car Class.
 */
public class Car extends AbstractVehicle {

	public Car() {
		super(new PetrolEngine());
	}

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
