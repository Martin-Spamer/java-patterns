
package coaching.collections;

import java.util.*;

import org.slf4j.*;

/**
 * Table class.
 */
public class Table {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private final List<TableRow> rows = new ArrayList<TableRow>();

	/**
	 * Adds an.
	 *
	 * @param e the e
	 * @return the boolean
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(final TableRow e) {
		return rows.add(e);
	}

	/**
	 * Gets the.
	 *
	 * @param index the index
	 * @return the table row
	 * @see java.util.List#get(int)
	 */
	public TableRow get(final int index) {
		return rows.get(index);
	}

}
