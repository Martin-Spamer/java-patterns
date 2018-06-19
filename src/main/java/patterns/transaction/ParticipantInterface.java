
package patterns.transaction;

/**
 * Participant Interface.
 */
public interface ParticipantInterface {

    /**
     * Join operation.
     * Must return this for fluent interface.
     *
     * @return this to provide a participant with a fluent interface.
     */
    public ParticipantInterface join();

    /**
     * Commit operation.
     * Must return this for fluent interface.
     *
     * @return this to provide a participant with a fluent interface.
     */
    public ParticipantInterface commit();

    /**
     * Cancel operation.
     * Must return this for fluent interface.
     *
     * @return this to provide a participant with a fluent interface.
     */
    public ParticipantInterface cancel();

}
