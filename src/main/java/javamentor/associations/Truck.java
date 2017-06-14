/**
 * Created on 05-Jul-2004
 */
package javamentor.associations;

/**
 * Truck Class.
 */
public class Truck extends AbstractVehicle {

	/**
	 * Instantiates a new truck.
	 */
	public Truck() {
		super(new DieselEngine());
	}

	/**
	 * Instantiates a new truck.
	 *
	 * engine
	 *
	 * @param engine the engine
	 */
	public Truck(DieselEngine engine) {
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
