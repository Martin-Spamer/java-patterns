
package coaching.associations;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Using a basic Java array to implement a UML Composite.
 *
 * The Lifetime of parts is constraint bound by lifetime of parent.
 **/
public class CompositeClassArray {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(CompositeClassArray.class);

    /** The Composite implemented using a class array. */
    private final AbstractPerson[] composite = { new Alice(), new Bob(),
            new Charlie(), new Dan() };

    /**
     * Instantiates a new composite class array.
     */
    public CompositeClassArray() {
        super();
        LOG.info("CompositeClassArray() {}", this);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [composite=%s]",
                    this.getClass().getSimpleName(),
                    Arrays.toString(composite));
    }

}
