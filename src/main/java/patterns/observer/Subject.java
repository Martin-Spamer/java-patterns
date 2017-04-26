package patterns.observer;

/**
 * The Subject Class.
 */
public final class Subject extends AbstractSubject {

	private Boolean status = false;

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Boolean getStatus() {
		return this.status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Boolean status) {
		this.status = status;
		updateObservers();
	}

	@Override
	public String toString() {
		return String.format("Subject [status=%s]", this.status);
	}

}
