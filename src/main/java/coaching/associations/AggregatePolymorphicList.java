
package coaching.associations;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Aggregation with a Polymorphic List class.
 *
 * Objects can be added or removed from an aggregation at runtime. The lifetime
 * of the parts is disconnected from the lifetime of the whole. We can describe
 * this as having no life-time constraint.
 */
public final class AggregatePolymorphicList {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AggregatePolymorphicList.class);

    /** The integer list. */
    private final List<AbstractPerson> aggregation = new ArrayList<>();

    /**
     * Instantiates a new polymorphic list.
     */
    public AggregatePolymorphicList() {
        super();
        LOG.info("PolymorphicList()");
    }

    /**
     * Integer object.
     *
     * @param person the integer in
     * @return this for fluent interface.
     */
    public AggregatePolymorphicList add(final AbstractPerson person) {
        LOG.info("PolymorphicList({})", person);
        aggregation.add(person);
        return this;
    }

    /**
     * Execute.
     *
     * @return the aggregate polymorphic list
     */
    public AggregatePolymorphicList execute() {
        for (final AbstractPerson abstractPerson : aggregation) {
            abstractPerson.execute();
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [integerList=%s]", this.getClass().getSimpleName(), aggregation);
    }

}
