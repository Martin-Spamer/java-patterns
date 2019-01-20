
package coaching.bags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implements a Bag class with Generic Type.
 *
 * @param <T> the generic type
 */
@SuppressWarnings("serial")
public class GenericBag<T> extends ArrayList<T> implements GenericBagInterface<T> {

    /** Provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** random number generator. */
    private final Random random = new Random();

    /** The initial state. */
    private T[] initialState;

    /**
     * Instantiates a new empty bag.
     */
    public GenericBag() {
        super();
        this.log.info("GenericBag({})");
    }

    /**
     * Instantiates a new bag from string array. Accepts 0..N arguments.
     *
     * @param values the values
     */
    @SafeVarargs
    public GenericBag(final T... values) {
        super();
        this.log.info("GenericBag({})", values);
        fill(values);
    }

    /*
     * (non-Javadoc)
     * @see coaching.bags.GenericBagInterface#fill(java.lang.Object[])
     */
    @SuppressWarnings("unchecked")
    @Override
    public GenericBagInterface<T> fill(final T... values) {
        this.log.debug("{}.fill({})", this.getClass().getSimpleName(), values);
        if (values != null) {
            this.initialState = values;
            this.addAll(Arrays.asList(values));
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.bags.GenericBagInterface#pick()
     */
    @Override
    public T pick() {
        this.log.debug("{}.pick()", this.getClass().getSimpleName());
        return choose();
    }

    /*
     * (non-Javadoc)
     * @see coaching.bags.GenericBagInterface#choose()
     */
    @Override
    public T choose() {
        this.log.debug("{}.choose()", this.getClass().getSimpleName());
        final int size = size();
        if (size > 0) {
            final int nextInt = this.random.nextInt(size);
            return remove(nextInt);
        } else {
            return null;
        }
    }

    /*
     * (non-Javadoc)
     * @see coaching.bags.GenericBagInterface#reset()
     */
    @Override
    public GenericBagInterface<T> reset() {
        this.log.debug("{}.reset()", this.getClass().getSimpleName());
        return fill(this.initialState);
    }

}
