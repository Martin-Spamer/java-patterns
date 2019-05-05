
package patterns.decorator;

import patterns.composite.ComponentInterface;

/**
 * An abstract Component class.
 */
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
