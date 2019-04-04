
package patterns.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * RefinedAbstraction Class.
 */
@Slf4j
public class RefinedAbstraction extends Abstraction {

    /**
     * Instantiates a new refined abstraction.
     *
     * @param implementor the implementor
     */
    public RefinedAbstraction(final AbstractImplementor implementor) {
        super(implementor);
    }

}
