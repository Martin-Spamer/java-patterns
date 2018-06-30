
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
    Part build();

    Part build(final String partName);

}
