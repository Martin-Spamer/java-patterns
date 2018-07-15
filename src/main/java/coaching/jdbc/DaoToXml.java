
package coaching.jdbc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

/**
 * The JdbcToXml class.
 */
class DaoToXml extends JdbcBase {

    /**
     * The Constructor.
     *
     * @throws Exception the exception
     */
    public DaoToXml() throws Exception {
        super();
    }

    /**
     * Process.
     *
     * @throws Exception the exception
     */
    public void process() throws Exception {
        super.query();
        toXmlFile();
    }

    /**
     * To xml file.
     */
    public void toXmlFile() {
        try {
            final String tableName = resultSetMetaData.getTableName(1);
            final String filename = String.format("%s.xml", tableName);
            toXmlFile(filename);
        } catch (final Exception e) {
            log.error(e.toString(), e);
        }
    }

    /**
     * To xml file.
     *
     * buffered writer
     *
     * @param bufferedWriter the buffered writer
     */
    public void toXmlFile(final BufferedWriter bufferedWriter) {
        try {
            bufferedWriter.write(toXmlString());
            bufferedWriter.flush();
        } catch (final Exception e) {
            log.error(e.toString(), e);
        }
    }

    /**
     * To xml file.
     *
     * filename
     *
     * @param filename the filename
     */
    private void toXmlFile(final String filename) {
        try {
            final File file = new File(filename);
            final FileWriter writer = new FileWriter(file);
            final BufferedWriter bufferedWriter = new BufferedWriter(writer);

            toXmlFile(bufferedWriter);

            bufferedWriter.close();
        } catch (IOException e) {
            log.error(e.toString(), e);
        }
    }

    /**
     * To xml string.
     *
     * string
     *
     * @return the string
     */
    public String toXmlString() {
        StringBuilder xml = new StringBuilder();
        if (resultSet != null) {
            if (resultSetMetaData != null) {
                try {
                    xml.append("<TABLE>");
                    xml.append(tableRows());
                    xml.append("</TABLE>\n");
                    return xml.toString();
                } catch (final Exception e) {
                    log.error(e.toString(), e);
                }
            } else {
                log.warn("No metaData for decoration.");
            }
        } else {
            log.warn("No table data to write.");
        }
        return null;
    }

    private String tableRows() throws SQLException {
        final StringBuilder xmlForBody = new StringBuilder();
        while (resultSet.next()) {
            xmlForBody.append(tableRow());
        }
        return xmlForBody.toString();
    }

    private String tableRow() throws SQLException {
        StringBuilder xmlforRow = new StringBuilder();
        xmlforRow.append("\t\t<ROW>\n\t\t");
        for (int colNum = 1; colNum <= resultSetMetaData
            .getColumnCount(); colNum++) {
            final String columnName = resultSetMetaData.getColumnName(colNum);
            final String value = resultSet.getString(colNum);

            if (value != null) {
                xmlforRow
                    .append(String.format("<FIELD NAME='%s'>", columnName));
                xmlforRow.append(value.trim());
                xmlforRow.append("</FIELD>");
            }
        }
        xmlforRow.append("\n\t\t</ROW>\n");
        return xmlforRow.toString();
    }
}
