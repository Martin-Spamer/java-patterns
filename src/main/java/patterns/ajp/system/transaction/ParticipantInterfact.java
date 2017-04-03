
package patterns.ajp.system.transaction;

/**
 * The Interface ParticipantInterfact.
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