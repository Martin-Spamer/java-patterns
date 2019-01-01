/**
 * This file is part of Automated Testing Framework for Java (atf4j).
 *
 * Atf4j is free software: you can redistribute it and/or modify
 * GNU General Public License as published by
 * License, or
 * (at your option) any later version.
 *
 * hope that it will be useful,
 * implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * GNU General Public License
 * along with atf4j.  If not, see http://www.gnu.org/licenses/.
 */

package coaching.jdbc;

import java.sql.SQLException;
import java.util.List;

import coaching.csv.CsvRecord;

/**
 * A dynamic data access object.
 */
public final class DynamicDao extends AbstractDao {

    /**
     * Default Constructor.
     */
    public DynamicDao() {
        super();
    }

    /**
     * Process.
     */
    public void process() {
        try {
            super.query("select * from sqlite_master");
        } catch (final SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#setDriver(java.lang.String)
     */
    @Override
    public DaoInterface setDriver(final String driver) throws ClassNotFoundException {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#setUrl(java.lang.String)
     */
    @Override
    public DaoInterface setUrl(final String url) {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#setUsername(java.lang.String)
     */
    @Override
    public DaoInterface setUsername(final String username) {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#setPassword(java.lang.String)
     */
    @Override
    public DaoInterface setPassword(final String password) {
        return null;
    }

    /**
     * Insert rows.
     *
     * @param rowList the row list
     */
    public void insertRows(final List<CsvRecord> rowList) {
    }
}
