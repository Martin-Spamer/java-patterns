
package coaching.xml;

import java.io.File;
import java.sql.*;

import javax.xml.parsers.*;

import org.slf4j.*;
import org.w3c.dom.*;

/**
 * XmlToJdbc Class.
 */
class XmlToJdbc {
	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";
	private static final String CUSTOMER_TBL_XML = "CUSTOMER_TBL.xml";
	private static final String USERNAME = "pbpublic";
	private static final String PASSWORD = "pbpublic";

	private static final Logger LOG = LoggerFactory.getLogger(XmlToJdbc.class);
	private String url = null;
	private String username = null;
	private String password = null;
	private String filename;
	private final String driver;
	private final String table;
	private Connection connection = null;
	private Statement statement = null;

	/**
	 * Instantiates a new xml to jdbc.
	 */
	public XmlToJdbc() {
		super();
		this.filename = CUSTOMER_TBL_XML;
		this.driver = JDBC_DRIVER;
		this.url = JDBC_URL;
		this.username = USERNAME;
		this.password = PASSWORD;
		this.table = "CUSTOMER_TBL";
	}

	/**
	 * Process.
	 *
	 * @throws Exception the exception
	 */
	public void process() throws Exception {
		LOG.info("process");
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
			this.connection = DriverManager.getConnection(url, user, password);
			this.statement = this.connection.createStatement();

			this.filename = filename;
			final File configFile = new File(filename);
			final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = builderFactory.newDocumentBuilder();
			final Document mainAppConfig = builder.parse(configFile);

			processTable(table, mainAppConfig);
		} catch (final Exception exception) {
			LOG.error(exception.toString());
		}
	}

	/**
	 * Process table.
	 *
	 * @param table the table
	 * @param mainAppConfig the main app config
	 */
	protected void processTable(final String table, final Document mainAppConfig) {
		// * root Document Element
		final Element tableElement = mainAppConfig.getDocumentElement();

		if (tableElement.getNodeName().equals("TABLE")) {
			// get a list of rows
			final NodeList rowList = tableElement.getElementsByTagName("ROW");

			// * list of rows
			for (int rowNo = 0; rowNo < rowList.getLength(); rowNo++) {
				final String temp = rowList.item(rowNo).toString();
				processRow(table, rowList, rowNo, temp);
			}
		}
	}

	/**
	 * Process row.
	 *
	 * @param table the table
	 * @param rowList the row list
	 * @param rowNo the row no
	 * @param temp the temp
	 */
	protected void processRow(final String table, final NodeList rowList, final int rowNo, final String temp) {
		LOG.info("{}", temp);

		try {
			// * first row element by index.
			final Element rowElement = (Element) rowList.item(rowNo);

			// * fields
			final NodeList fieldList = rowElement.getElementsByTagName("FIELD");

			final char columnSeperator = ' ';
			final String fieldNames = fieldNames(fieldList, columnSeperator);
			final String dataValues = dataValues(fieldList, columnSeperator);

			insertRow(table, fieldNames, dataValues);

		} catch (final Exception exception) {
			LOG.info("Failed with " + exception.getMessage());
		}
	}

	/**
	 * Field names.
	 *
	 * @param fieldList the field list
	 * @param columnSeperator the column seperator
	 * @return the string
	 */
	protected String fieldNames(final NodeList fieldList, char columnSeperator) {
		final StringBuffer fieldNames = new StringBuffer();

		for (int fieldNo = 0; fieldNo < fieldList.getLength(); fieldNo++) {
			LOG.info(fieldList.item(fieldNo).toString());
			final Element fieldElement = (Element) fieldList.item(fieldNo);
			fieldNames.append(columnSeperator + fieldElement.getAttribute("NAME"));
			columnSeperator = ',';
		}
		return fieldNames.toString();
	}

	/**
	 * Data values.
	 *
	 * @param fieldList the field list
	 * @param columnSeperator the column seperator
	 * @return the string
	 */
	protected String dataValues(final NodeList fieldList, char columnSeperator) {
		final StringBuffer dataValues = new StringBuffer();

		for (int fieldNo = 0; fieldNo < fieldList.getLength(); fieldNo++) {
			LOG.info(fieldList.item(fieldNo).toString());
			final Element fieldElement = (Element) fieldList.item(fieldNo);
			dataValues.append(columnSeperator + "\'" + fieldElement.getChildNodes().item(0).getNodeValue() + "\'");
			columnSeperator = ',';
		}
		return dataValues.toString();
	}

	/**
	 * Insert row.
	 *
	 * @param table the table
	 * @param fieldNames the field names
	 * @param dataValues the data values
	 */
	protected void insertRow(final String table, final String fieldNames, final String dataValues) {
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
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		try {
			final XmlToJdbc instance = new XmlToJdbc();
			instance.process();
		} catch (final Exception exception) {
			LOG.error(exception.toString());
		}
	}
}
