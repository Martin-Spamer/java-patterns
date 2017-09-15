package patterns.strategy;

/**
 * StrategyTwo Class.
 */
class StrategyTwo extends AbstractStrategy {

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
