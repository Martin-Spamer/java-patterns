
package coaching.csv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CsvRecord Class.
 */
public class CsvRecord {

    private List<String> fields = new ArrayList<String>();

    /**
     * Instantiates a new CSV record.
     */
    public CsvRecord() {
        super();
    }

    /**
     * Instantiates a new CSV record from a line of data.
     *
     * @param lineOfData the line of data.
     */
    public CsvRecord(final String lineOfData) {
        super();
        parse(lineOfData);
    }

    /**
     * Parses the line of data into fields.
     *
     * @param lineOfData the line of data
     */
    private void parse(final String lineOfData) {
        this.fields = Arrays.asList(lineOfData.split(", "));
    }

    /**
     * @param e
     * @return
     * @see java.util.List#add(java.lang.Object)
     */
    public boolean add(final String e) {
        return this.fields.add(e);
    }

    /**
     * @param index
     * @param element
     * @see java.util.List#add(int, java.lang.Object)
     */
    public void add(final int index, final String element) {
        this.fields.add(index, element);
    }

    /**
     * Sets the field value at index.
     *
     * @param index the index
     * @param field the field
     * @return the CSV record
     */
    public CsvRecord set(final int index, final String field) {
        this.fields.set(index, field);
        return this;
    }

    /**
     * Column count.
     *
     * @return the number of field columns as int.
     */
    public int columnCount() {
        return this.fields.size();
    }

    /**
     * column.
     *
     * @param index the index.
     * @return the column.
     */
    public String getColumn(final int index) {
        return this.fields.get(index);
    }

    /**
     * Checks if is empty.
     *
     * @return true, if record is empty.
     */
    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    /**
     * Removes the field value by index.
     *
     * @param index the index
     * @return the CSV record
     */
    public CsvRecord remove(final int index) {
        this.fields.remove(index);
        return this;
    }

    /**
     * Fields.
     *
     * @return the list
     */
    public List<String> getFields() {
        return this.fields;
    }

    /**
     * @return
     * @see java.util.List#toArray()
     */
    public Object[] toArray() {
        return this.fields.toArray();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [fields=%s]", this.getClass().getSimpleName(), this.fields.toString());
    }

}
