
package patterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * StrategyBob Class.
 */
@Slf4j
public class StrategyBob extends AbstractStrategy {

    /**
     * Instantiates a new strategy bob.
     *
     * @param context the context
     */
    public StrategyBob(final Context context) {
        super(context);
    }

}
