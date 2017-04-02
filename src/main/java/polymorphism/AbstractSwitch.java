package polymorphism;

import java.util.Hashtable;

/**
 * a class to provide a non-integer switch using the command patterns [GOF:233]
 *
 * @version v0.01
 */
public abstract class AbstractSwitch<K,V> {

	private final Hashtable<K,V> actions = new Hashtable<K,V>();

	/**
	 * Creates a new instance of Switch
	 */
	public AbstractSwitch() {
	}

	public V get(Object key) {
		return actions.get(key);
	}

	public V getOrDefault(Object key, V defaultValue) {
		return actions.getOrDefault(key, defaultValue);
	}

	public V put(K key, V value) {
		return actions.put(key, value);
	}

	public V add(K key, V value) {
		return actions.put(key, value);
	}
	
	public V execute(Object key) {
		return actions.get(key);
	}

}
