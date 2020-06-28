/**
 * EntityMetaData.java
 * Created on 01 December 2004, 15:46
 **/

package coaching.jdbc;

import java.io.File;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

/**
 * The EntityMetaData class, query JDBC MetaData.
 */



@Slf4j
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
     * Instantiates a new entity meta data.
     */
    public EntityMetaData() {
        super();
    }

    /**
     * Process.
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

    /**
     * Gets the separator.
     *
     * @return the separator
     */
    public char getSeparator() {
        return separator;
    }

    /**
     * Gets the header line.
     *
     * @return the header line
     */
    public String getHeaderLine() {
        return headerLine;
    }

    /**
     * Gets the field names.
     *
     * @return the field names
     */
    public String getFieldNames() {
        return fieldNames;
    }

    /**
     * Gets the data line.
     *
     * @return the data line
     */
    public String getDataLine() {
        return dataLine;
    }

    /**
     * Gets the output file.
     *
     * @return the output file
     */
    public File getOutputFile() {
        return outputFile;
    }

    /**
     * To csv file.
     *
     * @param resultSetMetaData the result set meta data
     * @return the string
     * @throws SQLException the SQL exception
     */
    private String toCsvFile(final ResultSetMetaData resultSetMetaData) throws SQLException {
        final StringBuilder sb = new StringBuilder();

        final String columnLabelLine = headerLine(resultSetMetaData);
        log.info("{}", columnLabelLine);
        sb.append(columnLabelLine);

        final String columnTypeLine = typeLine(resultSetMetaData);
        log.info("{}", columnTypeLine);
        sb.append(columnLabelLine);

        return sb.toString();
    }

    /**
     * Header line.
     *
     * @param resultSetMetaData the result set meta data
     * @return the string
     * @throws SQLException the SQL exception
     */
    private String headerLine(final ResultSetMetaData resultSetMetaData) throws SQLException {
        final StringBuilder columnLabelLine = new StringBuilder("#");

        final int colCount = resultSetMetaData.getColumnCount();
        for (int column = 1; column < colCount; column++) {
            final String str = String.format("%s%s", resultSetMetaData.getColumnLabel(column), separator);
            columnLabelLine.append(str);
        }
        return columnLabelLine.toString();
    }

    /**
     * Type line.
     *
     * @param resultSetMetaData the result set meta data
     * @return the string
     * @throws SQLException the SQL exception
     */
    private String typeLine(final ResultSetMetaData resultSetMetaData) throws SQLException {
        final StringBuilder columnTypeLine = new StringBuilder();

        final int colCount = resultSetMetaData.getColumnCount();
        for (int column = 1; column < colCount; column++) {
            final String str = String.format("%s%s", resultSetMetaData.getColumnTypeName(column), separator);
            columnTypeLine.append(str);
        }
        return columnTypeLine.toString();
    }

}
