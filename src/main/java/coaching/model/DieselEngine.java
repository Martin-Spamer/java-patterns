
package coaching.model;

/**
 * DieselEngine Class.
 */
public class DieselEngine extends AbstractEngine implements FuelInterface {

    /**
     * Instantiates a new diesel engine.
     */
    public DieselEngine() {
        super(new DieselFuel());
    }

}
