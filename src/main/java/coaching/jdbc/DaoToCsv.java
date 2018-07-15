
package coaching.jdbc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.csv.CsvFile;
import coaching.csv.CsvFile.FileNotLoadedException;

/**
 * JdbcToCsv class.
 */
class DaoToCsv extends JdbcBase {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** Data access object. */
    private final DynamicDao dao;

    /** Output CSV file. */
    private final CsvFile csvFile;

    /**
     * Default constructor.
     *
     * @throws FileNotLoadedException
     */
    public DaoToCsv() throws FileNotLoadedException {
        super();
        dao = new DynamicDao();
        csvFile = new CsvFile();
    }

    /**
     * To csv file.
     */
    protected void toCsvFile() {
        toCsvFile(getFilename(getTableName()));
    }

    /**
     * Gets the filename.
     *
     * @param nameStem the name stem
     * @return the filename
     */
    protected String getFilename(final String nameStem) {
        return String.format("%s.csv", nameStem);
    }

    /**
     * Get the name of the table.
     *
     * @return the string
     */
    private String getTableName() {
        try {
            return resultSetMetaData.getTableName(1);
        } catch (final SQLException e) {
            log.error(e.toString(), e);
        }
        return null;
    }

    /**
     * To csv file.
     *
     * @param filename the filename
     */
    protected void toCsvFile(final String filename) {
        toCsvFile(new File(filename));
    }

    /**
     * To csv file.
     *
     * @param file the file
     */
    protected void toCsvFile(final File file) {
        try {
            final FileWriter writer = new FileWriter(file);
            final BufferedWriter bufferedWriter = new BufferedWriter(writer);
            toCsvFile(bufferedWriter);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (final IOException e) {
            log.error(e.toString(), e);
        }
    }

    /**
     * To csv file.
     *
     * @param bufferedWriter the buffered writer
     */
    protected void toCsvFile(final BufferedWriter bufferedWriter) {
        if (resultSetMetaData != null) {
            csvHeaderTo(bufferedWriter);
        }
        csvBodyTo(bufferedWriter);
    }

    /**
     * Csv header to.
     *
     * @param bufferedWriter the buffered writer
     */
    protected void csvHeaderTo(final BufferedWriter bufferedWriter) {
        try {
            final ArrayList<String> columns = columnLabels();
            try {
                bufferedWriter.write(columns.toString());
            } catch (final IOException e) {
                log.error(e.toString(), e);
            }
        } catch (final SQLException e) {
            log.error(e.toString(), e);
        }
    }

    /**
     * Column labels.
     *
     * @return the array list< string>
     * @throws SQLException the SQL exception
     */
    private ArrayList<String> columnLabels() throws SQLException {
        final ArrayList<String> columns = new ArrayList<String>();
        for (int i = 1; i < resultSetMetaData.getColumnCount(); i++) {
            final String columnName = resultSetMetaData.getColumnName(i);
            columns.add(columnName);
        }
        return columns;
    }

    /**
     * Csv body to.
     *
     * @param bufferedWriter the buffered writer
     */
    protected void csvBodyTo(final BufferedWriter bufferedWriter) {
        try {
            bufferedWriter.write(bodyToString());
        } catch (final IOException e) {
            log.error(e.toString(), e);
        }
    }

    /**
     * Body to string.
     *
     * @return the string
     */
    private String bodyToString() {
        try {
            final ArrayList<String> columns = columnLabels();
            final ArrayList<String> values = new ArrayList<String>();

            while (resultSet.next()) {
                for (final String columnName : columns) {
                    values.add(resultSet.getString(columnName));
                }
                return values.toString();
            }
        } catch (final SQLException e) {
            log.error(e.toString(), e);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [dao=%s, csvFile=%s]",
                    this.getClass().getSimpleName(),
                    dao,
                    csvFile);
    }
}
