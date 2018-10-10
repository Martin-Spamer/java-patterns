
package coaching.tuples;

import java.util.Map;

/**
 * The Class KeyValue.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public class KeyValue<K, V> implements Map.Entry<K, V> {

    /** The key. */
    private K key;

    /** The value. */
    private V value;

    /**
     * Instantiates a new key value.
     *
     * @param key the key
     * @param value the value
     */
    public KeyValue(final K key, final V value) {
        this.key = key;
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * @see java.util.Map.Entry#getKey()
     */
    @Override
    public K getKey() {
        return this.key;
    }

    /*
     * (non-Javadoc)
     * @see java.util.Map.Entry#getValue()
     */
    @Override
    public V getValue() {
        return this.value;
    }

    /**
     * Sets the key.
     *
     * @param key the key
     * @return the k
     */
    public K setKey(final K key) {
        return this.key = key;
    }

    /*
     * (non-Javadoc)
     * @see java.util.Map.Entry#setValue(java.lang.Object)
     */
    @Override
    public V setValue(final V value) {
        return this.value = value;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s=%s", key, value);
    }

    /**
     * Debug string.
     *
     * @return the string
     */
    public String debugString() {
        return String.format("%s [key=%s, value=%s]", this.getClass().getSimpleName(), key, value);
    }
}
