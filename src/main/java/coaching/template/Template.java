
package coaching.template;

/**
 * Concrete class.
 */
public final class Template extends AbstractTemplate {

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
