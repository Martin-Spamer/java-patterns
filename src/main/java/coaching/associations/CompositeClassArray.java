
package coaching.associations;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * Using a basic Java array to implement a UML Composite.
 *
 * The Lifetime of parts is constraint bound by lifetime of parent.
 **/



@Slf4j
public class CompositeClassArray {

    /** The Composite implemented using a class array. */
    private final AbstractPerson[] composite = { new Alice(), new Bob(), new Charlie(), new Dan() };

    /**
     * Instantiates a new composite class array.
     */
    public CompositeClassArray() {
        super();
        log.info("CompositeClassArray() {}", this);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [composite=%s]", this.getClass().getSimpleName(), Arrays.toString(this.composite));
    }

}
