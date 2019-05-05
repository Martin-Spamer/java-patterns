
package patterns.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * An abstract Component class.
 */




@Slf4j
public abstract class AbstractComponent implements ComponentInterface {

    /**
     * Adds the component.
     *
     * @param component the component
     * @return the component interface
     */
    public ComponentInterface add(final AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * Remove the component.
     *
     * @param component the component
     * @return the component interface
     */
    public ComponentInterface remove(final AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * Get child component.
     *
     * @param index the index
     * @return the child
     */
    public ComponentInterface getChild(final int index) {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * @see patterns.composite.ComponentInterface#operation()
     */
    @Override
    public ComponentInterface operation() {
        throw new UnsupportedOperationException();
    }

}
