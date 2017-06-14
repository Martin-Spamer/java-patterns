
package javamentor.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * A JDBC example to access a PointBase Database. Faster Reader with XML Support
 * output support.
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
class XmlDAO {
	private String url = null;
	private String userId = null;
	private String password = null;
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData resultSetMetaData = null;

	/**
	 * Constructor.
	 *
	 * url
	 * user id
	 * pass word
	 *
	 * @param url the url
	 * @param userId the user id
	 * @param passWord the pass word
	 */
	public XmlDAO(String url, String userId, String passWord) {
		this.url = url;
		this.userId = userId;
		password = passWord;
		try {
			connection = DriverManager.getConnection(url, userId, passWord);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * database connection.
	 */
	@Override
	public void finalize() {
		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * database.
	 *
	 * sql
	 *
	 * @param sql the sql
	 */
	public void read(String sql) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			resultSetMetaData = resultSet.getMetaData();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * data as an XML encoded string.
	 * data.
	 *
	 * @return the string
	 */
	public String toXmlString() {
		final StringBuffer xml = new StringBuffer();

		try {
			final int colCount = resultSetMetaData.getColumnCount();
			xml.append("<TABLE>\n");

			while (resultSet.next()) {
				xml.append("<ROW>\n");

				for (int i = 1; i <= colCount; i++) {
					final String columnName = resultSetMetaData.getColumnName(i);
					final Object value = resultSet.getObject(i);
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
			e.printStackTrace();
		}

		return xml.toString();
	}

	/**
	 * data as XML.
	 *
	 * data.
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

			final int colCount = resultSetMetaData.getColumnCount();

			while (resultSet.next()) {
				final Element row = document.createElement("ROW");
				results.appendChild(row);

				for (int i = 1; i <= colCount; i++) {
					final String columnName = resultSetMetaData.getColumnName(i);
					final Object value = resultSet.getObject(i);

					if (value != null) {
						final Element node = document.createElement(columnName);
						node.appendChild(document.createTextNode(value.toString()));
						row.appendChild(node);
					}
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}

		return document;
	}

	/**
	 * main entry point.
	 *
	 * arguments
	 * exception
	 *
	 * @param argv the arguments
	 * @throws Exception the exception
	 */
	public static void main(String argv[]) throws Exception {
		try {
			Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");
			final String url = "jdbc:pointbase:server://localhost/sample";
			final String userId = "PBPUBLIC";
			final String passWord = "PBPUBLIC";

			final XmlDAO dao = new XmlDAO(url, userId, passWord);

			String sql = "select * from TNRG_COSTING";
			dao.read(sql);
			final String xml = dao.toXmlString();
			System.out.println(xml);

			sql = "SELECT * from customer_tbl where CUSTOMER_NUM=777";
			dao.read(sql);
			final Document document = dao.toXmlDocument();
			System.out.println(((Node) document).toString());
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
