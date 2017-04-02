/**
 * Created on 28-Jun-2004
 */
package associations;

/**
 * The MotorCycle Class.
 */
public class MotorCycle extends AbstractVehicle {

	/** The rider. */
	private Rider rider;

	/**
	 * Instantiates a new motor cycle.
	 */
	public MotorCycle() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see associations.Fuel#fuelUp(associations.Fuel)
	 */
	public void fuelUp(Fuel fuel) {
	}

	/**
	 * Gets the rider.
	 *
	 * @return the rider
	 */
	public Rider getRider() {
		return this.rider;
	}

	/**
	 * Sets the rider.
	 *
	 * @param rider
	 *            the new rider
	 */
	public void setRider(Rider rider) {
		this.rider = rider;
	}

}
