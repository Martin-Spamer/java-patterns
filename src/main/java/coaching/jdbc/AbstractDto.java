
package coaching.jdbc;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * An abstract data transfer object class.
 * Usage <code>Address extends AbstractDto</code>
 */
public abstract class AbstractDto {

    /** The fields. */
    protected Map<String, String> fields = new HashMap<>();

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
        this.fields.put(key, value);
    }

    /**
     * Gets the.
     *
     * @param key the key
     * @return the string
     */
    public String getField(final String key) {
        return this.fields.get(key);
    }

    /**
     * Contains key.
     *
     * @param key the key
     * @return true, if successful
     */
    public boolean containsKey(final String key) {
        return this.fields.containsKey(key);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [fields=%s]", this.getClass().getSimpleName(), this.fields);
    }

}
