
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyBob Class.
 */

/** log 			constant. */
@Slf4j
public class StrategyBob extends AbstractStrategy {

    /**
     * Instantiates a new bob strategy.
     *
     * @param context the context
     */
    public StrategyBob(final Context context) {
        super(context);
    }

    /* (non-Javadoc)
    * @see patterns.strategy.AbstractStrategy#operation()
    */
    @Override
    public void operation() {
        log.info("{}.operation()", this.getClass().getSimpleName());
    }

}
