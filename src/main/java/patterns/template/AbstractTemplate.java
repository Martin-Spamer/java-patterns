
package patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract TemplateClass class.
 */
public abstract class AbstractTemplate implements TemplateInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * TemplateClass method provides common entry.
     */
    public void templateMethod() {
        primitiveOperationAlice();
        primitiveOperationBob();
    }

    /**
     * Primitive operation A.
     *
     * @return the template interface
     */
    protected abstract TemplateInterface primitiveOperationAlice();

    /**
     * Primitive operation B.
     *
     * @return the template interface
     */
    protected abstract TemplateInterface primitiveOperationBob();
}
