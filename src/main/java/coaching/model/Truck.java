/**
 * Created on 05-Jul-2004
 */

package coaching.model;

import lombok.extern.slf4j.Slf4j;

/**
 * Truck class.
 */
@Slf4j
public class Truck extends AbstractVehicle {

    /**
     * Instantiates a new truck.
     */
    public Truck() {
        super(new DieselEngine());
    }

}
