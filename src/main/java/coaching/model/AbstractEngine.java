
package coaching.model;

/**
 * Abstract Engine class.
 */
public abstract class AbstractEngine implements FuelInterface {

    /** fuel. */
    private FuelInterface fuel;

    /**
     * Instantiates a new abstract engine.
     *
     * @param fuel setup the fuel
     */
    public AbstractEngine(final FuelInterface fuel) {
        super();
        fuelType(fuel);
    }

    /**
     * Use fuel type.
     *
     * @param fuel the fuel
     */
    private void fuelType(final FuelInterface fuel) {
        this.fuel = fuel;
    }

    /*
     * (non-Javadoc)
     * @see coaching.model.FuelInterface#addFuel(int)
     */
    @Override
    public void addFuel(final int quantity) {
        this.fuel.addFuel(quantity);
    }

    /*
     * (non-Javadoc)
     * @see coaching.model.FuelInterface#useFuel(int)
     */
    @Override
    public void useFuel(final int quantity) {
        this.fuel.useFuel(quantity);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [fuel=%s]", this.getClass().getSimpleName(), this.fuel);
    }

}
