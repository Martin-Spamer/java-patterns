
package coaching.associations;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Using a basic Java array to implement an example UML Aggregation.
 *
 * Objects can be added or removed from an aggregation at runtime.
 * The lifetime of the parts is disconnected from the lifetime of the whole.
 * We can describe this as having no life-time constraint.
 **/
public final class AggregateClassArray {

    /** The SIZE of the Aggregation. */
    private static final int SIZE = 4;

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AggregateClassArray.class);

    /** The aggregate Implement an Aggregate using a Array of classes. */
    private final AbstractPerson[] aggregate = new AbstractPerson[SIZE];

    /**
     * Sets the aggregate.
     *
     * @param index
     *            the index
     * @param element
     *            the element
     */
    public void setAggregate(final int index, final AbstractPerson element) {
        LOG.info("{}.execute", this.getClass().getName());
        aggregate[index] = element;
    }

    /**
     * Gets the aggregate.
     *
     * @param index
     *            the index
     * @return the aggregate
     */
    public AbstractPerson getAggregate(final int index) {
        LOG.info("{}.execute", this.getClass().getName());
        return aggregate[index];
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [aggregate=%s]", this.getClass().getSimpleName(), Arrays.toString(aggregate));
    }

}
