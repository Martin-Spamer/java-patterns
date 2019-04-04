/**
 * Created on 28-Jun-2004
 *
 */

package coaching.model;

import lombok.extern.slf4j.Slf4j;

/**
 * An example Car class.
 */
@Slf4j
public class Car extends AbstractVehicle implements CarInterface {

    /**
     * Instantiates a new car.
     */
    public Car() {
        super(new PetrolEngine());
    }

    /**
     * Instantiates a new car with an engine.
     *
     * @param engine the engine
     */
    public Car(final AbstractEngine engine) {
        super(engine);
    }

}
