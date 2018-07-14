
package patterns.builder;

/**
 * Builder Interface.
 */
public interface BuilderInterface {

    /**
     * Builds the part.
     *
     * @return the part
     */
    AbstractPart build();

    /**
     * Builds the.
     *
     * @param partName the part name
     * @return the abstract part
     */
    AbstractPart build(final String partName);

}
