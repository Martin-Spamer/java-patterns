
package coaching.csv;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * The Class CsvToXml.
 */
public final class CsvToXml {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvToXml.class);

    /** CSV file. */
    private final CsvFile csv = new CsvFile();

    /** The doc. */
    private final Document doc = null;

    /**
     * Instantiates a new csv to xml.
     */
    public CsvToXml() {
        super();
    }

    /**
     * Process.
     *
     * @param resourceName the resource name
     * @param tableName the table name
     */
    public void process(final String resourceName, final String tableName) {
        this.csv.read(resourceName);
        List<CsvRecord> rowList = this.csv.getRowList();
    }

}
