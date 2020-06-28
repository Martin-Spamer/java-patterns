
package coaching.csv;

import org.w3c.dom.Document;

import lombok.extern.slf4j.Slf4j;

/**
 * Class to convert a CSV file to XML.
 */
@Slf4j
public final class CsvToXml extends AbstractCsvSource {

    private final Document doc = null;

    public static CsvToXml open(final String sourceFilename) {
        return new CsvToXml(sourceFilename);
    }

    public CsvToXml() {
        super();
    }

    public CsvToXml(final String csvFilename) {
        super(csvFilename);
    }

    public CsvToXml write(final String destinationFilename) {
        return this;
    }

}
