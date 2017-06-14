/**
 * Created on 28-Jun-2004
 */
package javamentor.associations;

/**
 * MotorCycle Class.
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
	@Override
	public void fuelUp(FuelInterface fuel) {
	}

	/**
	 * rider.
	 *
	 * rider
	 *
	 * @return the rider
	 */
	public Rider getRider() {
		return rider;
	}

	/**
	 * rider.
	 *
	 * new rider
	 *
	 * @param rider the new
	 * 			rider
	 */
	public void setRider(Rider rider) {
		this.rider = rider;
	}

}
