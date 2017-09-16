package patterns.strategy;

/**
 * StrategyOne Class.
 */
class StrategyOne extends AbstractStrategy {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.strategy.AbstractStrategy#operation()
	 */
	@Override
	public void operation() {
		log.info("operation()");
	}

}
