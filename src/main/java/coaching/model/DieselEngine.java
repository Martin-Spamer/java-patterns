
package coaching.model;

import lombok.extern.slf4j.Slf4j;

/**
 * DieselEngine class.
 */
@Slf4j
public class DieselEngine extends AbstractEngine implements FuelInterface {

    /**
     * Instantiates a new diesel engine.
     */
    public DieselEngine() {
        super(new Diesel());
    }
}
