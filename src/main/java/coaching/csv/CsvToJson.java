
package coaching.csv;

/**
 * Class to convert a CSV file to JSON.
 */
public final class CsvToJson extends AbstractCsvSource {

    // private final Gson gson = new Gson();
    // private Json json;

    public static CsvToXml open(final String sourceFilename) {
        return new CsvToXml(sourceFilename);
    }

    public CsvToJson() {
        super();
    }

    public CsvToJson(final String csvFilename) {
        super(csvFilename);
    }

}
