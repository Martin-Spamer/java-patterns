
package patterns.builder;

/**
 * Part class.
 */
public abstract class AbstractPart {

    /** The part name. */
    private final String partName;

    /**
     * The Constructor.
     */
    public AbstractPart() {
        super();
        partName = this.getClass().getSimpleName();
    }

    /**
     * The Constructor.
     *
     * @param partName the part name
     */
    public AbstractPart(final String partName) {
        super();
        this.partName = partName;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [partName=%s]",
                    this.getClass().getSimpleName(),
                    partName);
    }

}
