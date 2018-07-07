
package coaching.jdbc;

public class JdbcToCsv extends AbstractDataAccessObject {

    private String tableName;
    private String filename;

    public JdbcToCsv() {
        super();
    }

    public JdbcToCsv(final String driverClassName) {
        super(driverClassName);
    }

    public JdbcToCsv setTableName(final String tableName) {
        this.tableName = tableName;
        return this;
    }

    public JdbcToCsv setFilename(final String filename) {
        this.filename = filename;
        return this;
    }

}
