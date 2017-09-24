/**
 * Created on 28-Jun-2004
 */
package coaching.associations;

/**
 * MotorCycle Class.
 */
public class MotorCycle extends AbstractVehicle {

	private Rider rider;

	/**
	 * Instantiates a new motor cycle.
	 */
	public MotorCycle() {
		super(new PetrolEngine());
	}

	/**
	 * rider.
	 *
	 * @return the rider
	 */
	public Rider getRider() {
		return rider;
	}

	/**
	 * rider.
	 *
	 * @param rider the new
	 *            rider
	 */
	public void setRider(final Rider rider) {
		this.rider = rider;
	}

}
