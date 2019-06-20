
package coaching.associations;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * Using a basic Java array to implement an example UML Aggregation.
 *
 * Objects can be added or removed from an aggregation at runtime. The lifetime
 * of the parts is disconnected from the lifetime of the whole. We can describe
 * this as having no life-time constraint.
 **/


/** The Constant 			log. */
@Slf4j
public final class AggregateClassArray {

    /** The SIZE of the Aggregation. */
    private static final int SIZE = 4;

    /** The aggregate Implement an Aggregate using a Array of classes. */
    private final AbstractPerson[] aggregate = new AbstractPerson[SIZE];

    /**
     * Sets the aggregate.
     *
     * @param index the index
     * @param element the element
     * @return the aggregate class array
     */
    public AggregateClassArray setAggregate(final int index, final AbstractPerson element) {
        log.info("setAggregate({},{}) = {}", index, element, this);
        this.aggregate[index] = element;
        return this;
    }

    /**
     * Execute.
     */
    public void execute() {
        for (final AbstractPerson person : this.aggregate) {
            person.doWork();
        }
    }

    /**
     * Execute.
     *
     * @param index the index
     * @return the aggregate class array
     */
    public AggregateClassArray execute(final int index) {
        log.info("execute {}", this);
        this.aggregate[index].doWork();
        return this;
    }

    /**
     * Gets the aggregate.
     *
     * @param index the index
     * @return the aggregate
     */
    public AbstractPerson getAggregate(final int index) {
        log.info("{}.execute", this.getClass().getName());
        return this.aggregate[index];
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [aggregate=%s]", this.getClass().getSimpleName(), Arrays.toString(this.aggregate));
    }

}
