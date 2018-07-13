
package coaching.tuples;

import java.util.Map;

public class KeyValue<K, V> implements Map.Entry<K, V> {

    private K key;
    private V value;

    public KeyValue(final K key, final V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    public K setKey(final K key) {
        return this.key = key;
    }

    @Override
    public V setValue(final V value) {
        return this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s=%s", key, value);
    }

    public String debugString() {
        return String.format("%s [key=%s, value=%s]", this.getClass().getSimpleName(), key, value);
    }
}
