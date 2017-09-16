package patterns.strategy;

import org.slf4j.*;

/**
 * AbstractStrategy Class.
 */
public abstract class AbstractStrategy implements StrategyInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.strategy.StrategyInterface#operation()
	 */
	@Override
	public abstract void operation();

}
