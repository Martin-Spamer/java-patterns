
package patterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Element Class.
 */





@Slf4j
public final class ConcreteElement extends AbstractElement {

    /*
     * (non-Javadoc)
     * @see patterns.visitor.AbstractElement#accept(patterns.visitor.
     * VisitorInterface)
     */
    @Override
    public void accept(final VisitorInterface visitor) {
        log.info("{}.accept", this.getClass().getSimpleName());
    }

}
