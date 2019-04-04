
package patterns.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstraction Class.
 */
@Slf4j
public abstract class Abstraction {

    /** The implementor. */
    private AbstractImplementor implementor = null;

    /**
     * Instantiates a new abstraction.
     *
     * implementor
     *
     * @param implementor the implementor
     */
    public Abstraction(final AbstractImplementor implementor) {
        super();
        this.implementor = implementor;
    }

    /**
     * Operation.
     */
    public void operation() {
        implementor.operation();
    }

}
