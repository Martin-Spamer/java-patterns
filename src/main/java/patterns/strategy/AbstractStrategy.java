package patterns.strategy;

import org.slf4j.*;

/**
 * Abstract Strategy Class.
 */
public abstract class AbstractStrategy implements StrategyInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Context context = null;

	public AbstractStrategy(final Context context) {
		super();
		this.context = context;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.strategy.AbstractStrategy#operation()
	 */
	@Override
	public void operation() {
		this.log.info("{}.operation() should be overridden.", this.getClass().getSimpleName());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("AbstractStrategy [context=%s]", this.context);
	}

}
