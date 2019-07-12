
package coaching.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * The GenericTable class is composed of GenericTableRow classes.
 */
@Slf4j
public class Table {

    private String tableName;
    private final List<String> colNames = new ArrayList<String>();
    private final List<TableRow> rows = new ArrayList<TableRow>();
    private final List<TableColumn> columns = new ArrayList<TableColumn>();

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
            log.info("{}", value);
        }

        int size = this.rows.size();
        for (int i = 0; i < size; i++) {
            TableRow row = this.rows.get(i);
            row.addCell(colData[i]);
            log.info("{}", row);
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
     * @return the table
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
     * GenericTable header.
     *
     * @return the string
     */
    protected String tableHeader() {
        return this.colNames.toString();
    }

    /**
     * GenericTable body.
     *
     * @return the string
     */
    protected String tableBody() {
        final StringBuilder stringBuffer = new StringBuilder();
        for (TableRow tableRow : this.rows) {
            stringBuffer.append(tableRow.toString());
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [tableName=%s, colNames=%s, rows=%s, columns]",
            this.getClass().getSimpleName(),
            this.tableName,
            this.colNames,
            this.rows,
            this.columns);
    }

}
