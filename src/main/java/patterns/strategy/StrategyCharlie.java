
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyThree Class.
 */

/** log 			constant. */
@Slf4j
public class StrategyCharlie extends AbstractStrategy {

    /**
     * Instantiates a new charlie strategy.
     *
     * @param context the context
     */
    public StrategyCharlie(final Context context) {
        super(context);
    }

}
