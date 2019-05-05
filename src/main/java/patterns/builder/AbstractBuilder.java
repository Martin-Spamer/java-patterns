
package patterns.builder;

/**
 * AbstractBuilder Class.
 */
public abstract class AbstractBuilder implements BuilderInterface {

    /*
     * (non-Javadoc)
     * @see patterns.builder.BuilderInterface#build()
     */
    @Override
    public abstract AbstractPart build();

    /*
     * (non-Javadoc)
     * @see patterns.builder.BuilderInterface#build(java.lang.String)
     */
    @Override
    public abstract AbstractPart build(final String partName);
}
