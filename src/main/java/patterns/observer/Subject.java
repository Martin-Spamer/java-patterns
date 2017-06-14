
package patterns.observer;

/**
 * Subject Class.
 */
public final class Subject extends AbstractSubject {

	private Boolean status = false;

	/**
	 * status.
	 *
	 * status
	 *
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * status.
	 *
	 * new status
	 *
	 * @param status the new
	 * 			status
	 */
	public void setStatus(Boolean status) {
		this.status = status;
		updateObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Subject [status=%s]", status);
	}

}
