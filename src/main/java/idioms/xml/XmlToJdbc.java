/**
 * This file is part of Automated Testing Framework for Java (atf4j).
 *
 * Atf4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Atf4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with atf4j.  If not, see http://www.gnu.org/licenses/.
 */

package idioms.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * The XmlToJdbc Class.
 */
class XmlToJdbc {
	private static final Logger LOG = LoggerFactory.getLogger(XmlToJdbc.class);
	private final File inputFile = null;
	private final BufferedReader bufferedReader = null;
	private String url = null;
	private String username = null;
	private String password = null;
	private String filename;
	private String driver;
	private String table;
	private Connection connection = null;
	private Statement statement = null;
	private String[] args;

	public XmlToJdbc() {
		super();
		this.filename = "CUSTOMER_TBL.xml";
		this.driver = "com.pointbase.jdbc.jdbcUniversalDriver";
		this.url = "jdbc:pointbase://localhost:9092/sample";
		this.username = "pbpublic";
		this.password = "pbpublic";
		this.table = "CUSTOMER_TBL";
	}

	public XmlToJdbc(final String[] args) {
		this.args = args;
	}

	public void process() throws Exception {
		process(this.filename, this.driver, this.url, this.username, this.password, this.table);
	}

	/**
	 * Process.
	 *
	 * @param filename the filename
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @param table the table
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws NullPointerException the null pointer exception
	 */
	public void process(final String filename,
	        final String driver,
	        final String url,
	        final String user,
	        final String password,
	        final String table) throws Exception {
		try {
			// JDBC Driver
			Class.forName(driver);
			this.connection = DriverManager.getConnection(url, user, password);
			this.statement = this.connection.createStatement();

			final java.io.File configFile = new File(filename);
			final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = builderFactory.newDocumentBuilder();
			final Document mainAppConfig = builder.parse(configFile);

			// Get the root Document Element
			final Element tableElement = mainAppConfig.getDocumentElement();

			if (tableElement.getNodeName().equals("TABLE")) {
				// get a list of rows
				final NodeList rowList = tableElement.getElementsByTagName("ROW");

				// iterate the list of rows
				for (int rowNo = 0; rowNo < rowList.getLength(); rowNo++) {
					final String temp = rowList.item(rowNo).toString();
					LOG.info("{}", temp);

					try {
						final StringBuffer fieldNames = new StringBuffer();
						final StringBuffer dataValues = new StringBuffer();

						// get the first row element by index.
						final Element rowElement = (Element) rowList.item(rowNo);

						// get a list of the fields
						final NodeList fieldList = rowElement.getElementsByTagName("FIELD");

						char columnSeperator = ' ';
						// iterate the list of fields
						for (int fieldNo = 0; fieldNo < fieldList.getLength(); fieldNo++) {
							LOG.info(fieldList.item(fieldNo).toString());
							final Element fieldElement = (Element) fieldList.item(fieldNo);
							fieldNames.append(columnSeperator + fieldElement.getAttribute("NAME"));
							dataValues.append(columnSeperator + "\'"
							        + fieldElement.getChildNodes().item(0).getNodeValue() + "\'");
							columnSeperator = ',';
						}

						// sql = insert into %table (%field%,...) from
						// (%value%,...)
						final StringBuffer sql = new StringBuffer();
						sql.append(String.format("insert into %s", table));
						sql.append(String.format(" (%s)", fieldNames.toString()));
						sql.append(String.format(" VALUES (%s)", dataValues.toString()));

						LOG.error(sql.toString());
						try {
							if (this.statement.execute(sql.toString())) {
								LOG.info("ok" + this.statement.getResultSet().toString());
								// put in processed log.
							} else {
								if (this.statement.getUpdateCount() == 1) {
									LOG.info("ok" + this.statement.getResultSet().toString());
									// put in processed log.
								} else {
									LOG.info("failed " + this.statement.getWarnings());
									// put in exceptions log.
								}
							}
						} catch (final Exception exception) {
							LOG.info("Failed with " + exception.getMessage());
						}
					} catch (final Exception exception) {
						LOG.info("Failed with " + exception.getMessage());
					}
				}
			}
			this.bufferedReader.close();
		} catch (final Exception exception) {
			LOG.error(exception.toString());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#finalize()
	 */
	@Override
	public void finalize() {
		try {
			this.statement.close();
			this.connection.close();
		} catch (final SQLException exception) {
			LOG.info("{}", exception);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		try {
			final XmlToJdbc instance = new XmlToJdbc(args);
			instance.process();
		} catch (final Exception exception) {
			LOG.error(exception.toString());
		}
	}
}
