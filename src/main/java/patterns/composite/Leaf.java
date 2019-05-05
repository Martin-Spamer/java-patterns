
package patterns.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * Leaf Class.
 */




@Slf4j
public final class Leaf extends AbstractComponent {

    /*
     * (non-Javadoc)
     * @see patterns.composite.Component#operation()
     */
    @Override
    public ComponentInterface operation() {
        return this;
    }

}
