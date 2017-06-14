
package patterns.transaction;

/**
 * ParticipantInterfact Interface.
 */
public interface ParticipantInterfact {

	/**
	 * Join.
	 */
	public void join();

	/**
	 * Commit.
	 */
	public void commit();

	/**
	 * Cancel.
	 */
	public void cancel();

}
