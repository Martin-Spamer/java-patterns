
package coaching.jdbc;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * The Class AbstractDto.
 */
public abstract class AbstractDto {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** The fields. */
    protected HashMap<String, String> fields = new HashMap<String, String>();

    /**
     * Adds the field.
     *
     * @param keyValuePair the key value pair
     */
    public void addField(final String keyValuePair) {
        final String[] pair = keyValuePair.split("=");
        assertEquals(2, pair.length);
        final String value = pair[1];
        final String key = pair[0];
        addField(key, value);
    }

    /**
     * Adds the field.
     *
     * @param key the key
     * @param value the value
     */
    public void addField(final String key, final String value) {
        fields.put(key, value);
    }

    /**
     * Gets the.
     *
     * @param key the key
     * @return the string
     */
    public String get(final String key) {
        return fields.get(key);
    }

    /**
     * Contains key.
     *
     * @param key the key
     * @return true, if successful
     */
    public boolean containsKey(final String key) {
        return fields.containsKey(key);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [fields=%s]", this.getClass().getSimpleName(), fields);
    }

}
