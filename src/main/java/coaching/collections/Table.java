
package coaching.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Table class is composed of TableRow classes.
 */
public class Table {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The table name. */
    private String tableName;

    /** The column names. */
    private final List<String> colNames = new ArrayList<String>();

    /** The rows of the table. */
    private final List<TableRow> rows = new ArrayList<TableRow>();

    /**
     * Instantiates a new table.
     */
    public Table() {
        super();
    }

    /**
     * Instantiates a new table.
     *
     * @param tableName the table name
     */
    public Table(final String tableName) {
        super();
        this.tableName = tableName;
    }

    /**
     * Sets the table name.
     *
     * @param tableName the tableName to set
     * @return the table
     */
    public Table setName(final String tableName) {
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
    public Table addColumnName(final String colName) {
        this.colNames.add(colName);
        return this;
    }

    /**
     * Adds a multiple column names.
     *
     * @param colNames the col names
     * @return the table
     */
    public Table addColumnNames(final String... colNames) {
        this.colNames.addAll(Arrays.asList(colNames));
        return this;
    }

    /**
     * Adds a new column from data.
     *
     * @param colData the col data
     * @return the table
     */
    public Table addColumn(final String... colData) {
        for (String value : colData) {
            this.log.info("{}", value);
        }

        int size = this.rows.size();
        for (int i = 0; i < size; i++) {
            TableRow row = this.rows.get(i);
            row.addCell(colData[i]);
            this.log.info("{}", row);
        }
        return this;
    }

    /**
     * Gets the column names.
     *
     * @return the column names
     */
    public List<String> getColumnNames() {
        return this.colNames;
    }

    /**
     * Adds a row.
     *
     * @param values the values
     * @return the table
     */
    public Table addRow(final String values) {
        addRow(new TableRow(values));
        return this;
    }

    /**
     * Adds a row.
     *
     * @param values the values
     * @return the table
     */
    public Table addRow(final String... values) {
        addRow(new TableRow(values));
        return this;
    }

    /**
     * Adds a table row.
     *
     * @param e the e
     * @return the boolean
     * @see java.util.List#add(java.lang.Object)
     */
    public Table addRow(final TableRow e) {
        this.rows.add(e);
        return this;
    }

    /**
     * Adds the rows.
     *
     * @param tableRows the table rows
     */
    public Table addRows(final TableRow[] tableRows) {
        return this;
    }

    /**
     * Gets the row at index.
     *
     * @param index the index
     * @return the table row
     * @see java.util.List#get(int)
     */
    public TableRow getRow(final int index) {
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
     * Table header.
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
     * Table body.
     *
     * @return the string
     */
    protected String tableBody() {
        final StringBuilder stringBuffer = new StringBuilder();

        final Iterator<TableRow> tableRow = this.rows.iterator();
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
