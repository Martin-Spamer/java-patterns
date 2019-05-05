
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyAlice Class.
 */

/** log 			constant. */




@Slf4j
public class StrategyAlice extends AbstractStrategy {

    /**
     * Instantiates a new alice strategy.
     *
     * @param context the context
     */
    public StrategyAlice(final Context context) {
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
