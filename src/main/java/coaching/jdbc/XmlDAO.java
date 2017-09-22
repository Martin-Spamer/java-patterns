

package coaching.jdbc;

import java.sql.*;

import javax.xml.parsers.*;

import org.slf4j.*;
import org.w3c.dom.*;

/**
 * A JDBC example to access a PointBase Database. Faster Reader with XML Support
 * output support.
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
class XmlDAO {

	private static final Logger LOG = LoggerFactory.getLogger(XmlDAO.class);

	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String URL = "jdbc:pointbase:server://localhost/sample";
	private static final String USER = "PBPUBLIC";
	private static final String PASSWORD = "PBPUBLIC";
	private static final String SQL = "SELECT * from customers";

	/**
	 * Instantiates a new xml DAO.
	 */
	public XmlDAO() {
		this(URL, USER, PASSWORD);
	}

	/**
	 * Constructor.
	 *
	 * @param url the url
	 * @param user the user id
	 * @param password the pass word
	 */
	public XmlDAO(final String url, final String user, final String password) {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (final ClassNotFoundException e) {
			LOG.error("{}", e.toString());
		}
	}

	/**
	 * Execute.
	 */
	protected void execute() {
		try {
			final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			read(connection);
		} catch (final SQLException e) {
			LOG.error("{}", e.toString());
		}
	}

	/**
	 * database.
	 *
	 * @param connection the connection
	 */
	public void read(final Connection connection) {
		try {
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(SQL);
			final Document document = toXmlDocument(resultSet);
			final String xmlString = toXmlString(resultSet);
		} catch (final Exception e) {
			LOG.error("{}", e.toString());
		}
	}

	/**
	 * data as XML.
	 *
	 * @param resultSet the result set
	 * @return the document
	 */
	public Document toXmlDocument(final ResultSet resultSet) {
		Document document = null;

		try {
			final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();

			final ResultSetMetaData metaData = resultSet.getMetaData();
			final int colCount = metaData.getColumnCount();

			final Element results = document.createElement("TABLE");
			document.appendChild(results);

			while (resultSet.next()) {
				final Element row = document.createElement("ROW");
				results.appendChild(row);

				for (int i = 1; i <= colCount; i++) {
					final String columnName = metaData.getColumnName(i);
					final Object value = resultSet.getObject(i);

					if (value != null) {
						final Element node = document.createElement(columnName);
						node.appendChild(document.createTextNode(value.toString()));
						row.appendChild(node);
					}
				}
			}
		} catch (final Exception e) {
			LOG.error("{}", e.toString());
		}

		return document;
	}

	/**
	 * data as an XML encoded string.
	 *
	 * @param resultSet the result set
	 * @return the string
	 */
	public String toXmlString(final ResultSet resultSet) {
		final StringBuffer xml = new StringBuffer();

		try {
			final ResultSetMetaData metaData = resultSet.getMetaData();
			final int colCount = metaData.getColumnCount();

			while (resultSet.next()) {
				xml.append("<TABLE>\n");

				for (int i = 1; i <= colCount; i++) {
					xml.append("<ROW>\n");
					final String columnLabel = metaData.getColumnName(i);
					final Object value = resultSet.getObject(i);
					final String columnAsXml = columnValue(columnLabel, value);
					xml.append(columnAsXml);
				}
				xml.append("</ROW>\n");
			}
			xml.append("</TABLE>\n");
			resultSet.close();
		} catch (final Exception e) {
			LOG.error("{}", e.toString());
		}
		return xml.toString();
	}

	/**
	 * Column value.
	 *
	 * @param columnName the column name
	 * @param value the value
	 * @return the string
	 */
	protected String columnValue(final String columnName, final Object value) {
		return String.format("<%s>%s</%s>", columnName, value, columnName);
	}
}
