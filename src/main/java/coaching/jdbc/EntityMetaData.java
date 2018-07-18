/**
 * EntityMetaData.java
 * Created on 01 December 2004, 15:46
 **/

package coaching.jdbc;

import java.io.File;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * The EntityMetaData class, query JDBC MetaData.
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
     * @return
     * @throws SQLException the SQL exception
     */
    private String toCsvFile(final ResultSetMetaData resultSetMetaData)
            throws SQLException {
        final StringBuilder sb = new StringBuilder();

        final String columnLabelLine = headerLine(resultSetMetaData);
        log.info("{}", columnLabelLine);
        sb.append(columnLabelLine);

        final String columnTypeLine = typeLine(resultSetMetaData);
        log.info("{}", columnTypeLine);
        sb.append(columnLabelLine);

        return sb.toString();
    }

    private String headerLine(final ResultSetMetaData resultSetMetaData)
            throws SQLException {
        final StringBuilder columnLabelLine = new StringBuilder("#");

        final int colCount = resultSetMetaData.getColumnCount();
        for (int column = 1; column < colCount; column++) {
            final String str = String
                .format("%s%s",
                        resultSetMetaData.getColumnLabel(column),
                        separator);
            columnLabelLine.append(str);
        }
        return columnLabelLine.toString();
    }

    private String typeLine(final ResultSetMetaData resultSetMetaData)
            throws SQLException {
        final StringBuilder columnTypeLine = new StringBuilder();

        final int colCount = resultSetMetaData.getColumnCount();
        for (int column = 1; column < colCount; column++) {
            final String str = String
                .format("%s%s",
                        resultSetMetaData.getColumnTypeName(column),
                        separator);
            columnTypeLine.append(str);
        }
        return columnTypeLine.toString();
    }

}
