
package coaching.model;

/**
 * The Fuel class.
 */
public class Fuel implements FuelInterface {

    /** The quantity. */
    private int quantity = 0;

    /**
     * Default Constructor.
     */
    public Fuel() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see coaching.model.FuelInterface#addFuel(int)
     */
    @Override
    public void addFuel(final int quantity) {
        this.quantity += quantity;
    }

    /*
     * (non-Javadoc)
     * @see coaching.model.FuelInterface#useFuel(int)
     */
    @Override
    public void useFuel(final int quantity) {
        this.quantity += quantity;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [quantity=%s]", this.getClass().getSimpleName(), this.quantity);
    }

}
