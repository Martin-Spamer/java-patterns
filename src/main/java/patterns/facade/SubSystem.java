
package patterns.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * class SubSystem.
 */





@Slf4j
public class SubSystem {

    /**
     * Operation.
     */
    public void operation() {
        log.info("{}.operation", toString());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [...]", this.getClass().getSimpleName());
    }

}
