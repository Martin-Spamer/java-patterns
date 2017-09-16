package patterns.strategy;

/**
 * StrategyAlice Class.
 */
class StrategyAlice extends AbstractStrategy {

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
