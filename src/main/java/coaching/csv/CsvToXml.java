
package coaching.csv;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public final class CsvToXml {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(CsvToXml.class);

    /** CSV file. */
    private final CsvFile csv = new CsvFile();
    private final Document doc = null;

    public CsvToXml() {
        super();
    }

    public void process(final String resourceName, final String tableName) {
        this.csv.read(resourceName);
        List<CsvRecord> rowList = this.csv.getRowList();
    }

}
