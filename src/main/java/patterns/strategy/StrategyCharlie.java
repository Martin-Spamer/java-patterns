
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyThree Class.
 */
@Slf4j
public class StrategyCharlie extends AbstractStrategy {

    /**
     * Instantiates a new strategy charlie.
     *
     * @param context the context
     */
    public StrategyCharlie(final Context context) {
        super(context);
    }

}
