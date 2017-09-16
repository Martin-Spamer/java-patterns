
package coaching.csv;

import java.util.*;

import org.slf4j.*;

/**
 * CsvRecord Class.
 */
public class CsvRecord {

	/** The Constant log. */
	protected static final Logger log = LoggerFactory.getLogger(CsvRecord.class);

	/** The fields. */
	private List<String> fields;

	/**
	 * Instantiates a new CSV record.
	 */
	public CsvRecord() {
		super();
	}

	/**
	 * Instantiates a new CSV record.
	 *
	 * line of data
	 *
	 * @param lineOfData the line of data
	 */
	public CsvRecord(final String lineOfData) {
		parse(lineOfData);
	}

	/**
	 * Column count.
	 *
	 * int
	 *
	 * @return the int
	 */
	public int columnCount() {
		return fields.size();
	}

	/**
	 * column.
	 *
	 * index
	 * column
	 *
	 * @param index the index
	 * @return the column
	 */
	public String getColumn(final int index) {
		return fields.get(index);
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return fields.isEmpty();
	}

	/**
	 * Parses the.
	 *
	 * line of data
	 *
	 * @param lineOfData the line of data
	 */
	private void parse(final String lineOfData) {
		fields = Arrays.asList(lineOfData.split(","));
	}

	/**
	 * Removes the.
	 *
	 * index
	 * CSV record
	 *
	 * @param index the index
	 * @return the CSV record
	 */
	public CsvRecord remove(final int index) {
		fields.remove(index);
		return this;
	}

	/**
	 * Sets the.
	 *
	 * index
	 * field
	 * CSV record
	 *
	 * @param index the index
	 * @param field the field
	 * @return the CSV record
	 */
	public CsvRecord set(final int index, final String field) {
		fields.set(index, field);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", fields).replace("[", "").replace("]", "");
	}

}
