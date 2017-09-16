
package patterns.strategy;

import coaching.rules.AbstractContext;

/**
 * Context Class.
 */
public final class Context extends AbstractContext {

	private StrategyInterface strategy = null;

	/**
	 * Instantiates a new context.
	 */
	public Context() {
		super();
	}

	/**
	 * Instantiates a new context.
	 *
	 * @param strategy the strategy
	 */
	public Context(final StrategyInterface strategy) {
		super();
		this.strategy = strategy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Context [strategy=%s]", this.strategy);
	}
}
