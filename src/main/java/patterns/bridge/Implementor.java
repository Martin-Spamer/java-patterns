
package patterns.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * Implementor Class.
 */




@Slf4j
public class Implementor extends AbstractImplementor {

    /*
     * (non-Javadoc)
     * @see patterns.bridge.AbstractImplementor#operation()
     */
    @Override
    public void operation() {
        log.info(this.getClass().getSimpleName());
    }

}
