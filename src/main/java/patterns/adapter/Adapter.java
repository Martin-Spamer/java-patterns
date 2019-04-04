
package patterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class Adapter.
 */
@Slf4j
public class Adapter implements TargetInterface {

    /*
     * (non-Javadoc)
     * @see patterns.adapter.TargetInterface#operation()
     */
    @Override
    public Result operation() {
        final AdapteeInterface adaptee = new Adaptee();
        return adaptee.operation();
    }

}
