
package patterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Visitor Class.
 */
@Slf4j
public final class ConcreteVisitorOne extends AbstractVisitor {

    /*
     * (non-Javadoc)
     * @see
     * patterns.visitor.AbstractVisitor#visit(patterns.visitor.ElementInterface)
     */
    @Override
    public void visit(final ElementInterface element) {
        throw new UnsupportedOperationException();
    }

}
