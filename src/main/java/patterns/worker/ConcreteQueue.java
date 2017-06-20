package patterns.worker;

/**
 * ConcreteQueue Class.
 */
class ConcreteQueue implements QueueInterface {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.worker.QueueInterface#put(java.lang.Object)
	 */
	@Override
	public ConcreteQueue put(final Object object) {
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.worker.QueueInterface#take()
	 */
	@Override
	public Object take() {
		return null;
	}

}
