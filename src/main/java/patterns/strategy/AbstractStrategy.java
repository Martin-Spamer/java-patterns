package patterns.strategy;

import org.slf4j.*;

/**
 * Abstract Strategy Class.
 */
public abstract class AbstractStrategy implements StrategyInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Context context = null;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.strategy.StrategyInterface#operation()
	 */
	@Override
	public abstract void operation();

}
