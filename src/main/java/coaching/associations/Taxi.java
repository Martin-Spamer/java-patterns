

package coaching.associations;

/**
 * Taxi Class.
 */
public class Taxi extends Car {

	private Passenger passenger;

	/**
	 * Instantiates a new taxi.
	 */
	public Taxi() {
		super(new DieselEngine());
	}

	/**
	 * Instantiates a new taxi with engine.
	 *
	 * @param engine the engine
	 */
	public Taxi(final DieselEngine engine) {
		super(engine);
	}

	/**
	 * passenger.
	 *
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 * new passenger.
	 *
	 * @param passenger the new
	 *            passenger
	 */
	public void setPassenger(final Passenger passenger) {
		this.passenger = passenger;
	}

}
