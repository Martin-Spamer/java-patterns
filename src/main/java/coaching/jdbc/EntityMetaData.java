/**
 * EntityMetaData.java
 * Created on 01 December 2004, 15:46
 **/

package coaching.jdbc;

import java.io.File;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * The EntityMetaData class.
 */
public class EntityMetaData extends JdbcBase {

    /** The separator. */
    private final char separator = ',';

    /** The header line. */
    private final String headerLine = null;

    /** The field names. */
    private final String fieldNames = null;

    /** The data line. */
    private final String dataLine = null;

    /** The output file. */
    private final File outputFile = null;

    /**
     * The Constructor.
     *
     * @throws Exception the exception
     */
    public EntityMetaData() {
        super();
    }

    /**
     * Process.
     *
     * @throws Exception the exception
     */
    public void process() {
        try {
            super.query();
        } catch (final SQLException e) {
            log.error(e.toString());

        }
        try {
            toCsvFile(resultSetMetaData);
        } catch (final SQLException e) {
            log.error(e.toString());

        }
    }

    public char getSeparator() {
        return separator;
    }

    public String getHeaderLine() {
        return headerLine;
    }

    public String getFieldNames() {
        return fieldNames;
    }

    public String getDataLine() {
        return dataLine;
    }

    public File getOutputFile() {
        return outputFile;
    }

    /**
     * To csv file.
     *
     * @param resultSetMetaData the result set meta data
     * @throws SQLException the SQL exception
     */
    private void toCsvFile(final ResultSetMetaData resultSetMetaData)
            throws SQLException {
        StringBuffer classTypeLine = headerLine(resultSetMetaData);
        final int colCount = resultSetMetaData.getColumnCount();

        // * CSV header line
        final StringBuffer columnLabelLine = new StringBuffer("#");
        for (int column = 1; column < colCount; column++) {
            columnLabelLine
                .append(resultSetMetaData.getColumnLabel(column) + separator);
        }
        log.info("{}", columnLabelLine);

        // * type line
        final StringBuffer columnTypeLine = new StringBuffer("#");
        for (int column = 1; column < colCount; column++) {
            columnTypeLine
                .append(resultSetMetaData.getColumnTypeName(column)
                        + separator);
        }
        log.info("{}", columnTypeLine);

        log.info("{}", classTypeLine);
    }

    private StringBuffer headerLine(final ResultSetMetaData resultSetMetaData)
            throws java.sql.SQLException {
        final int colCount = resultSetMetaData.getColumnCount();
        final StringBuffer classTypeLine = new StringBuffer("#");
        for (int column = 1; column < colCount; column++) {
            classTypeLine
                .append(resultSetMetaData.getColumnClassName(column)
                        + separator);
        }
        return classTypeLine;
    }
}
