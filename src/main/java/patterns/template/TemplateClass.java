
package patterns.template;

/**
 * Concrete Template class.
 */
public final class TemplateClass extends AbstractTemplate {

    /*
     * (non-Javadoc)
     * @see patterns.gof.behavioural.template_method.AbstractClass#
     * primitiveOperationA()
     */
    @Override
    public TemplateInterface primitiveOperationAlice() {
        this.log.info("primitiveOperationAlice()");
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.gof.behavioural.template_method.AbstractClass#
     * primitiveOperationB()
     */
    @Override
    public TemplateInterface primitiveOperationBob() {
        this.log.info("primitiveOperationBob()");
        return this;
    }

}
