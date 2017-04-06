
package polymorphism;

import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractSwitch Class.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
@SuppressWarnings("serial")
public abstract class AbstractSwitch<K, V> extends Hashtable<K, V> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Execute.
	 *
	 * @param key the key
	 * @return the v
	 */
	public V execute(K key) {
		final V v = super.get(key);
		return v;
	}

}
