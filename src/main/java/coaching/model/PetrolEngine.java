
package coaching.model;

import lombok.extern.slf4j.Slf4j;

/**
 * PetrolEngine class.
 */


@Slf4j
public class PetrolEngine extends AbstractEngine implements FuelInterface {

    /**
     * Instantiates a new petrol engine.
     */
    public PetrolEngine() {
        super(new Petrol());
    }

}
