
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyAlice Class.
 */
@Slf4j
public class StrategyAlice extends AbstractStrategy {

    /**
     * Instantiates a new strategy alice.
     *
     * @param context the context
     */
    public StrategyAlice(final Context context) {
        super(context);
    }

}
