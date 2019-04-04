
package coaching.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * The GenericTable class is composed of GenericTableRow classes.
 *
 * @param <T> the generic type
 */
@Slf4j
public class GenericTable<T> {

    /** The table name. */
    private String tableName;

    /** The column names. */
    private final List<String> colNames = new ArrayList<String>();

    /** The rows of the table. */
    private final List<GenericTableRow> rows = new ArrayList<GenericTableRow>();

    /**
     * Instantiates a new table.
     */
    public GenericTable() {
        super();
    }

    /**
     * Instantiates a new table.
     *
     * @param tableName the table name
     */
    public GenericTable(final String tableName) {
        super();
        this.tableName = tableName;
    }

    /**
     * Sets the table name.
     *
     * @param tableName the tableName to set
     * @return the table
     */
    public GenericTable setName(final String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Gets the table name.
     *
     * @return the tableName
     */
    public String getName() {
        return this.tableName;
    }

    /**
     * Adds the column name.
     *
     * @param colName the col name
     * @return the table
     */
    public GenericTable addColumnName(final String colName) {
        this.colNames.add(colName);
        return this;
    }

    /**
     * Adds a multiple column names.
     *
     * @param colNames the col names
     * @return the table
     */

    public GenericTable addColumnNames(final String... colNames) {
        this.colNames.addAll(Arrays.asList(colNames));
        return this;
    }

    /**
     * Adds a new column from data.
     *
     * @param colData the col data
     * @return the table
     */
    public GenericTable addColumn(final String... colData) {
        for (int i = 0; i < colData.length; i++) {
            this.rows.get(i).addCells(colData[i]);
        }
        return this;
    }

    /**
     * Adds a row.
     *
     * @param values the values
     * @return the table
     */
    public GenericTable addRow(final String values) {
        addRow(new GenericTableRow(values));
        return this;
    }

    /**
     * Adds a row.
     *
     * @param values the values
     * @return the table
     */
    public GenericTable addRow(final String... values) {
        addRow(new GenericTableRow(values));
        return this;
    }

    /**
     * Adds a table row.
     *
     * @param e the e
     * @return the boolean
     * @see java.util.List#add(java.lang.Object)
     */
    public GenericTable addRow(final GenericTableRow e) {
        this.rows.add(e);
        return this;
    }

    /**
     * Gets the row at index.
     *
     * @param index the index
     * @return the table row
     * @see java.util.List#get(int)
     */
    public GenericTableRow getRow(final int index) {
        return this.rows.get(index);
    }

    /**
     * To csv string.
     *
     * @return the string
     */
    public String toCsvString() {
        return "\n" + tableHeader() + tableBody();
    }

    /**
     * GenericTable header.
     *
     * @return the string
     */
    protected String tableHeader() {
        final StringBuilder stringBuffer = new StringBuilder();

        final Iterator<String> itemIterator = this.colNames.iterator();
        if (itemIterator.hasNext()) {
            stringBuffer.append(itemIterator.next());
            while (itemIterator.hasNext()) {
                stringBuffer.append(',');
                stringBuffer.append(itemIterator.next());
            }
        }

        stringBuffer.append('\n');
        return stringBuffer.toString();
    }

    /**
     * GenericTable body.
     *
     * @return the string
     */
    protected String tableBody() {
        final StringBuilder stringBuffer = new StringBuilder();

        final Iterator<GenericTableRow> tableRow = this.rows.iterator();
        if (tableRow.hasNext()) {
            stringBuffer.append(tableRow.next());
            while (tableRow.hasNext()) {
                stringBuffer.append(',');
                stringBuffer.append(tableRow.next().toRowString());
            }
        }

        stringBuffer.append('\n');
        return stringBuffer.toString();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [tableName=%s, colNames=%s, rows=%s]",
            this.getClass().getSimpleName(),
            this.tableName,
            this.colNames,
            this.rows);
    }

}
