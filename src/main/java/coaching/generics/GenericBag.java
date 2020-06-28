
package coaching.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;

/**
 * Implements a Bag class with Generic Type.
 *
 * @param <T> the generic type
 */
@SuppressWarnings("serial")



@Slf4j
public class GenericBag<T> extends ArrayList<T> implements GenericBagInterface<T> {

    /** random number generator. */
    private final Random random = new Random();

    /** The initial state. */
    private T[] initialState;

    /**
     * Instantiates a new empty bag.
     */
    public GenericBag() {
        super();
        log.info("GenericBag({})");
    }

    /**
     * Instantiates a new bag from string array. Accepts 0..N arguments.
     *
     * @param values the values
     */
    @SafeVarargs
    public GenericBag(final T... values) {
        super();
        log.info("GenericBag({})", values);
        fill(values);
    }

    /*
     * (non-Javadoc)
     * @see coaching.bags.GenericBagInterface#fill(java.lang.Object[])
     */
    @SuppressWarnings("unchecked")
    @Override
    public GenericBagInterface<T> fill(final T... values) {
        log.debug("{}.fill({})", this.getClass().getSimpleName(), values);
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
        log.debug("{}.pick()", this.getClass().getSimpleName());
        return choose();
    }

    /*
     * (non-Javadoc)
     * @see coaching.bags.GenericBagInterface#choose()
     */
    @Override
    public T choose() {
        log.debug("{}.choose()", this.getClass().getSimpleName());
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
        log.debug("{}.reset()", this.getClass().getSimpleName());
        return fill(this.initialState);
    }

}
