
package patterns.builder;

/**
 * Part class.
 */
public abstract class Part {

    private final String partName;

    public Part() {
        super();
        this.partName = this.getClass().getSimpleName();
    }

    public Part(final String partName) {
        super();
        this.partName = partName;
    }

    @Override
    public String toString() {
        return String.format("%s", this.getClass().getSimpleName());
    }

}
