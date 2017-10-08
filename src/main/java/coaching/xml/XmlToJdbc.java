


package coaching.xml;

import java.io.File;

import javax.xml.parsers.*;

import org.w3c.dom.*;

/**
 * XmlToJdbc Class.
 */
public class XmlToJdbc extends MySqlDao {

	/**
	 * Instantiates a new xml to jdbc.
	 */
	public XmlToJdbc() {
		super();
	}

	/**
	 * Process.
	 *
	 * @throws Exception the exception
	 */
	public void process() throws Exception {
		log.info("process");
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
			final File configFile = new File(filename);
			final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = builderFactory.newDocumentBuilder();
			final Document mainAppConfig = builder.parse(configFile);

			processTable(table, mainAppConfig);

		} catch (final Exception exception) {
			log.error("Failed with {} ", exception);
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
			log.error("Failed with {} ", exception);
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
			log.info("{}", fieldList.item(fieldNo));
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
			log.info("{}", fieldList.item(fieldNo));
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

		log.info("{}", sql.toString());
		super.sql(sql.toString());
	}
}
