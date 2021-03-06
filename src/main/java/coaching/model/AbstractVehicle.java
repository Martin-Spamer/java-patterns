/**
 * Created on 28-Jun-2004
 */

package coaching.model;

/**
 * An abstract Vehicle class.
 */
public abstract class AbstractVehicle implements VehicleInterface, FuelInterface {

    /** The engine. */
    protected AbstractEngine engine;

    /** The driver. */
    protected Driver driver;

    /**
     * Instantiates a new abstract vehicle.
     *
     * @param engine the engine
     */
    public AbstractVehicle(final AbstractEngine engine) {
        this.engine = engine;
    }

    /*
     * (non-Javadoc)
     * @see coaching.model.FuelInterface#addFuel(int)
     */
    @Override
    public void addFuel(final int quantity) {
        this.engine.addFuel(quantity);
    }

    /*
     * (non-Javadoc)
     * @see coaching.model.FuelInterface#useFuel(int)
     */
    @Override
    public void useFuel(final int quantity) {
        this.engine.useFuel(quantity);
    }

    /*
     * (non-Javadoc)
     * @see associations.Vehicle#setDriver(associations.Driver)
     */
    @Override
    public AbstractVehicle setDriver(final Driver driver) {
        this.driver = driver;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see associations.Vehicle#getDriver()
     */
    @Override
    public Driver getDriver() {
        return this.driver;
    }

    /*
     * (non-Javadoc)
     * @see associations.Vehicle#travel(java.lang.String)
     */
    @Override
    public VehicleInterface travel(final String destination) {
        this.engine.useFuel(1);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [engine=%s, driver=%s]", this.getClass().getSimpleName(), this.engine, this.driver);
    }

}
