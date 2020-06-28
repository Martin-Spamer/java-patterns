
package patterns.template;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete Template class.
 */





@Slf4j
public final class TemplateClass extends AbstractTemplate {

    /*
     * (non-Javadoc)
     * @see patterns.gof.behavioural.template_method.AbstractClass#
     * primitiveOperationA()
     */
    @Override
    public TemplateInterface primitiveOperationAlice() {
        log.info("primitiveOperationAlice()");
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.gof.behavioural.template_method.AbstractClass#
     * primitiveOperationB()
     */
    @Override
    public TemplateInterface primitiveOperationBob() {
        log.info("primitiveOperationBob()");
        return this;
    }

}
