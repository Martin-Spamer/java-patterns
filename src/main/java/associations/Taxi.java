package associations;

/**
 * The Taxi Class.
 */
public class Taxi extends Car {

	public Taxi() {
		super(new DieselEngine());
	}

	public Taxi(DieselEngine engine) {
		super(engine);
	}

	public Passenger getPassenger() {
		return this.passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	protected Passenger passenger;

}
