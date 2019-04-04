
package patterns.decorator;

import lombok.extern.slf4j.Slf4j;
import patterns.composite.ComponentInterface;

/**
 * An abstract Component class.
 */
@Slf4j
public abstract class AbstractComponent implements ComponentInterface {

    /*
     * (non-Javadoc)
     * @see patterns.decorator.ComponentInterface#operation()
     */
    @Override
    public ComponentInterface operation() {
        throw new UnsupportedOperationException();
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
