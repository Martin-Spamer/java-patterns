package patterns.strategy;

/**
 * StrategyThree Class.
 */
class StrategyThree extends AbstractStrategy {

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
