
package javamentor.associations;

/**
 * The Taxi Class.
 */
public class Taxi extends Car {

	/**
	 * Instantiates a new taxi.
	 */
	public Taxi() {
		super(new DieselEngine());
	}

	/**
	 * Instantiates a new taxi.
	 *
	 * @param engine the engine
	 */
	public Taxi(DieselEngine engine) {
		super(engine);
	}

	/**
	 * Gets the passenger.
	 *
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 * Sets the passenger.
	 *
	 * @param passenger the new passenger
	 */
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	/** The passenger. */
	protected Passenger passenger;

}
