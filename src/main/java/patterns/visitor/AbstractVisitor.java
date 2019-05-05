
package patterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Visitor Class.
 */




@Slf4j
public abstract class AbstractVisitor implements VisitorInterface {

    /*
     * (non-Javadoc)
     * @see
     * patterns.visitor.VisitorInterface#visit(patterns.visitor.AbstractElement)
     */
    @Override
    public abstract void visit(final ElementInterface element);

}
