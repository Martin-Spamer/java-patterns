
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Strategy Class.
 */
@Slf4j
public abstract class AbstractStrategy implements StrategyInterface {

    /** The context. */
    private Context context = null;

    /**
     * Instantiates a new abstract strategy.
     *
     * @param context the context
     */
    public AbstractStrategy(final Context context) {
        super();
        this.context = context;
    }

    /*
     * (non-Javadoc)
     * @see patterns.strategy.AbstractStrategy#operation()
     */
    @Override
    public void operation() {
        log.info("{}.operation() should be overridden.", this.getClass().getSimpleName());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [context=%s]", this.getClass().getSimpleName(), context);
    }

}
