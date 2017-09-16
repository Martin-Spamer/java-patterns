package coaching.xml;

import java.io.*;
import java.sql.*;

import javax.xml.parsers.*;

import org.slf4j.*;
import org.w3c.dom.*;

/**
 * XmlToJdbc Class.
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

	/**
	 * Instantiates a new xml to jdbc.
	 */
	public XmlToJdbc() {
		super();
		filename = "CUSTOMER_TBL.xml";
		driver = "com.pointbase.jdbc.jdbcUniversalDriver";
		url = "jdbc:pointbase://localhost:9092/sample";
		username = "pbpublic";
		password = "pbpublic";
		table = "CUSTOMER_TBL";
	}

	/**
	 * Instantiates a new xml to jdbc.
	 *
	 * args
	 *
	 * @param args the args
	 */
	public XmlToJdbc(final String[] args) {
		this.args = args;
	}

	/**
	 * Process.
	 *
	 * exception
	 *
	 * @throws Exception the exception
	 */
	public void process() throws Exception {
		process(filename, driver, url, username, password, table);
	}

	/**
	 * Process.
	 *
	 * filename
	 * driver
	 * url
	 * user
	 * password
	 * table
	 * exception
	 * null pointer exception
	 *
	 * @param filename the filename
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @param table the table
	 * @throws Exception the exception
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
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			final java.io.File configFile = new File(filename);
			final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = builderFactory.newDocumentBuilder();
			final Document mainAppConfig = builder.parse(configFile);

			// * root Document Element
			final Element tableElement = mainAppConfig.getDocumentElement();

			if (tableElement.getNodeName().equals("TABLE")) {
				// get a list of rows
				final NodeList rowList = tableElement.getElementsByTagName("ROW");

				// * list of rows
				for (int rowNo = 0; rowNo < rowList.getLength(); rowNo++) {
					final String temp = rowList.item(rowNo).toString();
					LOG.info("{}", temp);

					try {
						final StringBuffer fieldNames = new StringBuffer();
						final StringBuffer dataValues = new StringBuffer();

						// * first row element by index.
						final Element rowElement = (Element) rowList.item(rowNo);

						// * fields
						final NodeList fieldList = rowElement.getElementsByTagName("FIELD");

						char columnSeperator = ' ';
						// * list of fields
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
							if (statement.execute(sql.toString())) {
								LOG.info("ok" + statement.getResultSet().toString());
								// put in processed log.
							} else {
								if (statement.getUpdateCount() == 1) {
									LOG.info("ok" + statement.getResultSet().toString());
									// put in processed log.
								} else {
									LOG.info("failed " + statement.getWarnings());
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
			bufferedReader.close();
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
			statement.close();
			connection.close();
		} catch (final SQLException exception) {
			LOG.info("{}", exception);
		}
	}

	/**
	 * main method.
	 *
	 * arguments
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
