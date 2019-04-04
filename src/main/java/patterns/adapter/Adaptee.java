
package patterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class Adaptee.
 */
@Slf4j
public class Adaptee implements AdapteeInterface {

    /*
     * (non-Javadoc)
     * @see patterns.adapter.AdapteeInterface#operation()
     */
    @Override
    public Result operation() {
        return new Result();
    }

}
