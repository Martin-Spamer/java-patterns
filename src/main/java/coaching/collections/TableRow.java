
package coaching.collections;

import java.util.Hashtable;

import org.slf4j.*;

/**
 * Table Row class.
 */
public class TableRow {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private final Hashtable<String, TableCell> cols = new Hashtable<String, TableCell>();

	/**
	 * Put.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the table cell
	 * @see java.util.Hashtable#put(java.lang.Object, java.lang.Object)
	 */
	public TableCell put(final String key, final TableCell value) {
		return cols.put(key, value);
	}

	/**
	 * Gets the.
	 *
	 * @param key the key
	 * @return the table cell
	 * @see java.util.Hashtable#get(java.lang.Object)
	 */
	public TableCell get(final Object key) {
		return cols.get(key);
	}

}
