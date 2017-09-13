/**
 * Created on 05-Jul-2004
 */
package coaching.associations;

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

}
