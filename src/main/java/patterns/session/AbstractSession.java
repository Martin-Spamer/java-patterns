
package patterns.session;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Session class.
 */




@Slf4j
public abstract class AbstractSession {

    /** A Universally Unique ID. */
    protected UUID uuid = UUID.randomUUID();

    /** The token. */
    protected String token;

    /**
     * Default Constructor.
     */
    public AbstractSession() {
        this(UUID.randomUUID());
    }

    /**
     * The Constructor.
     *
     * @param currentUUID the current UUID
     */
    public AbstractSession(final UUID currentUUID) {
        uuid = currentUUID;
    }

    /**
     * Sets the token.
     *
     * @param token the token to set
     */
    public void setToken(final String token) {
        this.token = token;
    }

    /**
     * Gets the uuid.
     *
     * @return the uuid
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Gets the token.
     *
     * @return the token
     */
    public String token() {
        return token;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [uuid=%s, token=%s]", this.getClass().getSimpleName(), uuid, token);
    }

}
