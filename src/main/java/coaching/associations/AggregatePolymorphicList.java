
package coaching.associations;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * Aggregation with a Polymorphic List class.
 *
 * Objects can be added or removed from an aggregation at runtime. The lifetime
 * of the parts is disconnected from the lifetime of the whole. We can describe
 * this as having no life-time constraint.
 */


@Slf4j
public final class AggregatePolymorphicList {

    /** The integer list. */
    private final List<AbstractPerson> aggregation = new ArrayList<>();

    /**
     * Instantiates a new polymorphic list.
     */
    public AggregatePolymorphicList() {
        super();
        log.info("PolymorphicList()");
    }

    /**
     * Integer object.
     *
     * @param person the integer in
     * @return this for fluent interface.
     */
    public AggregatePolymorphicList add(final AbstractPerson person) {
        log.info("PolymorphicList({})", person);
        this.aggregation.add(person);
        return this;
    }

    /**
     * Execute.
     *
     * @return the aggregate polymorphic list
     */
    public AggregatePolymorphicList execute() {
        for (final AbstractPerson abstractPerson : this.aggregation) {
            abstractPerson.doWork();
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [integerList=%s]", this.getClass().getSimpleName(), this.aggregation);
    }

}
