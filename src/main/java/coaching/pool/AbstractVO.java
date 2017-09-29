


package coaching.pool;

/**
 * AbstractVO Class.
 */
public abstract class AbstractVO {

	/** The dirty. */
	private boolean dirty = false;

	/**
	 * Dirty.
	 */
	protected void dirty() {
		dirty = true;
	}

	/**
	 * Checks if is dirty.
	 *
	 * @return true, if is dirty
	 */
	protected boolean isDirty() {
		return dirty;
	}

}
