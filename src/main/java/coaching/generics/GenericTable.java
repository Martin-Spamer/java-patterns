
package coaching.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The GenericTable class is composed of GenericTableRow classes.
 *
 * @param <T> the generic type
 */
public class GenericTable<T> {

    private String tableName;
    private final List<String> colNames = new ArrayList<String>();
    private final List<GenericTableRow<T>> rows = new ArrayList<GenericTableRow<T>>();

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
    public GenericTable<T> setName(final String tableName) {
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
    public GenericTable<T> addColumnName(final String colName) {
        this.colNames.add(colName);
        return this;
    }

    /**
     * Adds a multiple column names.
     *
     * @param colNames the col names
     * @return the table
     */
    public GenericTable<T> addColumnNames(final String... colNames) {
        this.colNames.addAll(Arrays.asList(colNames));
        return this;
    }

    /**
     * Gets the column names.
     *
     * @return the column names
     */
    public String getColumnNames() {
        return this.colNames.toString();
    }

    /**
     * Adds a new column from data.
     *
     * @param colData the col data
     * @return the table
     */
    public GenericTable<T> addColumn(final T... colData) {
        if (colData != null) {
            for (int i = 0; i < colData.length; i++) {
                if (this.rows.size() > i) {
                    GenericTableRow<T> row = this.rows.get(i);
                    row.addCell(colData[i]);
                }
            }
        }
        return this;
    }

    /**
     * Adds a row.
     *
     * @param values the values
     * @return the table
     */
    public GenericTable<T> addRow(final T values) {
        addRow(new GenericTableRow<T>(values));
        return this;
    }

    /**
     * Adds a table row.
     *
     * @param e the e
     * @return the boolean
     * @see java.util.List#add(java.lang.Object)
     */
    public GenericTable<T> addRow(final GenericTableRow<T> e) {
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
    public GenericTableRow<T> getRow(final int index) {
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

        for (GenericTableRow<T> tableRow : this.rows) {
            stringBuffer.append(tableRow.toString());
        }

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
