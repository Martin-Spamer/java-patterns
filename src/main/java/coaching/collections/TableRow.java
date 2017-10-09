
package coaching.collections;

import java.util.*;

import org.slf4j.*;

/**
 * Table Row class.
 */
public class TableRow {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final List<TableCell> cols = new ArrayList<TableCell>();

	/**
	 * Instantiates a new table row.
	 *
	 * @param values the values
	 */
	public TableRow(final String... values) {
		for (final String value : values) {
			final TableCell tableCell = new TableCell(value);
			this.cols.add(tableCell);
		}
	}

	public String toRowString() {
		final StringBuffer stringBuffer = new StringBuffer();

		final Iterator<TableCell> tableRow = this.cols.iterator();
		if (tableRow.hasNext()) {
			stringBuffer.append(tableRow.next());
			while (tableRow.hasNext()) {
				stringBuffer.append(',');
				stringBuffer.append(tableRow.next());
			}
		}

		stringBuffer.append('\n');
		return stringBuffer.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("TableRow [cols=%s]", Arrays.asList(this.cols));
	}

}
