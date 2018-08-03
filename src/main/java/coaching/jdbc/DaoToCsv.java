
package coaching.jdbc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import coaching.csv.CsvFile;
import coaching.csv.CsvFile.FileNotLoadedException;

/**
 * JdbcToCsv class.
 */
public class DaoToCsv extends AbstractDao {

    /** Data access object. */
    private final DynamicDao dao;

    /** Output CSV file. */
    private final CsvFile csvFile;

    /**
     * Default constructor.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    public DaoToCsv() throws FileNotLoadedException {
        super();
        dao = new DynamicDao();
        csvFile = new CsvFile();
    }

    /**
     * To csv file.
     *
     * @throws SQLException
     */
    protected void toCsvFile() throws SQLException {
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
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /**
     * To csv file.
     *
     * @param filename the filename
     * @throws SQLException
     */
    protected void toCsvFile(final String filename) throws SQLException {
        toCsvFile(new File(filename));
    }

    /**
     * To csv file.
     *
     * @param file the file
     * @throws SQLException
     */
    protected void toCsvFile(final File file) throws SQLException {
        try {
            final FileWriter writer = new FileWriter(file);
            final BufferedWriter bufferedWriter = new BufferedWriter(writer);
            toCsvFile(bufferedWriter);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (final IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * To csv file.
     *
     * @param bufferedWriter the buffered writer
     * @throws SQLException
     */
    protected void toCsvFile(final BufferedWriter bufferedWriter)
            throws SQLException {
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
                log.error(e.getLocalizedMessage(), e);
            }
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Csv body to.
     *
     * @param bufferedWriter the buffered writer
     * @throws SQLException
     */
    protected void csvBodyTo(final BufferedWriter bufferedWriter)
            throws SQLException {
        try {
            bufferedWriter.write(bodyToString());
        } catch (final IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
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
