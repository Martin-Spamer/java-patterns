
package patterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Element Class.
 */




@Slf4j
public abstract class AbstractElement implements ElementInterface {

    /*
     * (non-Javadoc)
     * @see patterns.visitor.ElementInterface#accept(patterns.visitor.
     * VisitorInterface)
     */
    @Override
    public abstract void accept(VisitorInterface visitor);

}
