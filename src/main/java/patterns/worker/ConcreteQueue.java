package patterns.worker;

/**
 * The ConcreteQueue Class.
 */
class ConcreteQueue implements QueueInterface {

	@Override
	public ConcreteQueue put(final Object object) {
		return this;
	}

	@Override
	public Object take() {
		return null;
	}

}
