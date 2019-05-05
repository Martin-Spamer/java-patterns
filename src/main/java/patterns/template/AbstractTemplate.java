
package patterns.template;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract TemplateClass class.
 */




@Slf4j
public abstract class AbstractTemplate implements TemplateInterface {

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
