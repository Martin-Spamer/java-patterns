
package coaching.csv;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractCsvSource {

    protected final CsvFile csvFile;

    protected AbstractCsvSource() {
        this.csvFile = new CsvFile();
    }

    protected AbstractCsvSource(final String csvFilename) {
        this.csvFile = new CsvFile(csvFilename);
    }

    @Override
    public String toString() {
        return String.format("%s [csvFile=%s]", this.getClass().getSimpleName(), this.csvFile);
    }

    public void toLog() {
        log.debug(toString());
    }
}
