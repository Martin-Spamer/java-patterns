
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Strategy Class.
 */

/** log 			constant. */
@Slf4j
public abstract class AbstractStrategy implements Strategy {

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
        String message = String.format("%s.operation() should be overridden", this.getClass().getSimpleName());
        throw new UnsupportedOperationException(message);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [context=%s]", this.getClass().getSimpleName(), this.context);
    }

}
