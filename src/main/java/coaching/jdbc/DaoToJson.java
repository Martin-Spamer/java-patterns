
package coaching.jdbc;

/**
 * JdbcToCsv class.
 */
public final class DaoToJson {

    /** Data access object. */
    private final DaoInterface dao = new DynamicDao();
    private final String json = "";

    /**
     * Process.
     *
     * @param resourceName the resource name
     */
    public void process(final String resourceName) {
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [dao=%s, json=%s]", this.getClass().getSimpleName(), this.dao, this.json);
    }

}
