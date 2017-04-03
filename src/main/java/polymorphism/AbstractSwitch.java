
package polymorphism;

import java.util.Hashtable;

/**
 * The Class AbstractSwitch.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public abstract class AbstractSwitch<K, V> {

	/** The actions. */
	private final Hashtable<K, V> actions = new Hashtable<K, V>();

	/**
	 * Instantiates a new abstract switch.
	 */
	public AbstractSwitch() {
	}

	/**
	 * Gets the.
	 *
	 * @param key the key
	 * @return the v
	 */
	public V get(Object key) {
		return actions.get(key);
	}

	/**
	 * Gets the or default.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the or default
	 */
	public V getOrDefault(Object key, V defaultValue) {
		return actions.getOrDefault(key, defaultValue);
	}

	/**
	 * Put.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the v
	 */
	public V put(K key, V value) {
		return actions.put(key, value);
	}

	/**
	 * Adds the.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the v
	 */
	public V add(K key, V value) {
		return actions.put(key, value);
	}

	/**
	 * Execute.
	 *
	 * @param key the key
	 * @return the v
	 */
	public V execute(Object key) {
		return actions.get(key);
	}

}
