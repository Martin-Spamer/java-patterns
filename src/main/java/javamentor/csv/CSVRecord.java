package javamentor.csv;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CSVRecord Class.
 */
public class CSVRecord {

	/** The Constant log. */
	protected static final Logger log = LoggerFactory.getLogger(CSVRecord.class);

	/** The fields. */
	private List<String> fields;

	/**
	 * Instantiates a new CSV record.
	 */
	public CSVRecord() {
		super();
	}

	/**
	 * Instantiates a new CSV record.
	 *
	 * @param lineOfData the line of data
	 */
	public CSVRecord(final String lineOfData) {
		parse(lineOfData);
	}

	/**
	 * Column count.
	 *
	 * @return the int
	 */
	public int columnCount() {
		return this.fields.size();
	}

	/**
	 * Gets the column.
	 *
	 * @param index the index
	 * @return the column
	 */
	public String getColumn(final int index) {
		return this.fields.get(index);
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return this.fields.isEmpty();
	}

	/**
	 * Parses the.
	 *
	 * @param lineOfData the line of data
	 */
	private void parse(final String lineOfData) {
		this.fields = Arrays.asList(lineOfData.split(","));
	}

	/**
	 * Removes the.
	 *
	 * @param index the index
	 * @return the CSV record
	 */
	public CSVRecord remove(final int index) {
		this.fields.remove(index);
		return this;
	}

	/**
	 * Sets the.
	 *
	 * @param index the index
	 * @param field the field
	 * @return the CSV record
	 */
	public CSVRecord set(final int index, final String field) {
		this.fields.set(index, field);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", this.fields).replace("[", "").replace("]", "");
	}

}
