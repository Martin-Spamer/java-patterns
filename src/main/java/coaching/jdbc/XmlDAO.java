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
	private static final String URL = "jdbc:pointbase:server://localhost/sample";
	private static final String USER_ID = "PBPUBLIC";
	private static final String PASSWORD = "PBPUBLIC";
	private String url = null;
	private String userId = null;
	private String password = null;
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData resultSetMetaData = null;

	public XmlDAO() {
		this(URL, USER_ID, PASSWORD);
	}

	/**
	 * Constructor.
	 *
	 * @param url the url
	 * @param userId the user id
	 * @param password the pass word
	 */
	public XmlDAO(final String url, final String userId, final String password) {
		this.url = url;
		this.userId = userId;
		this.password = password;
		try {
			Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");
			this.connection = DriverManager.getConnection(url, userId, password);
		} catch (final ClassNotFoundException e) {
			LOG.error("{}", e.toString());
		} catch (final SQLException e) {
			LOG.error("{}", e.toString());
		}
	}

	public void execute() {
		try {
			Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");
			final String url = "jdbc:pointbase:server://localhost/sample";
			final String userId = "PBPUBLIC";
			final String passWord = "PBPUBLIC";

			final XmlDAO dao = new XmlDAO(url, userId, passWord);

			String sql = "select * from TNRG_COSTING";
			dao.read(sql);
			final String xml = dao.toXmlString();
			LOG.info(xml);

			sql = "SELECT * from customer_tbl where CUSTOMER_NUM=777";
			dao.read(sql);
			final Document document = dao.toXmlDocument();
			LOG.info(((Node) document).toString());
		} catch (final Exception e) {
			LOG.error("{}", e.toString());
		}
	}

	/**
	 * database.
	 *
	 * @param sql the sql
	 */
	public void read(final String sql) {
		try {
			this.statement = this.connection.createStatement();
			this.resultSet = this.statement.executeQuery(sql);
			this.resultSetMetaData = this.resultSet.getMetaData();
		} catch (final Exception e) {
			LOG.error("{}", e.toString());
		}
	}

	/**
	 * data as an XML encoded string.
	 *
	 * @return the string
	 */
	public String toXmlString() {
		final StringBuffer xml = new StringBuffer();

		try {
			final int colCount = this.resultSetMetaData.getColumnCount();
			xml.append("<TABLE>\n");

			while (this.resultSet.next()) {
				xml.append("<ROW>\n");

				for (int i = 1; i <= colCount; i++) {
					final String columnName = this.resultSetMetaData.getColumnName(i);
					final Object value = this.resultSet.getObject(i);
					xml.append("<" + columnName + ">");

					if (value != null) {
						xml.append(value.toString().trim());
					}
					xml.append("</" + columnName + ">\n");
				}
				xml.append("</ROW>\n");
			}

			xml.append("</TABLE>\n");
		} catch (final Exception e) {
			LOG.error("{}", e.toString());
		}

		return xml.toString();
	}

	/**
	 * data as XML.
	 *
	 * @return the document
	 */
	public Document toXmlDocument() {
		Document document = null;

		try {
			final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();

			final Element results = document.createElement("TABLE");
			document.appendChild(results);

			final int colCount = this.resultSetMetaData.getColumnCount();

			while (this.resultSet.next()) {
				final Element row = document.createElement("ROW");
				results.appendChild(row);

				for (int i = 1; i <= colCount; i++) {
					final String columnName = this.resultSetMetaData.getColumnName(i);
					final Object value = this.resultSet.getObject(i);

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
	 * database connection.
	 */
	@Override
	public void finalize() {
		try {
			this.resultSet.close();
			this.statement.close();
			this.connection.close();
		} catch (final SQLException e) {
			LOG.error("{}", e.toString());
		}
	}
}
