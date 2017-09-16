package patterns.strategy;

/**
 * StrategyBob Class.
 */
class StrategyBob extends AbstractStrategy {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.strategy.AbstractStrategy#operation()
	 */
	@Override
	public void operation() {
		this.log.info("operation()");
	}

}
