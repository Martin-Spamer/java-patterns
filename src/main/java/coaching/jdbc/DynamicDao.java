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

import lombok.extern.slf4j.Slf4j;

/**
 * A dynamic data access object.
 */


@Slf4j
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
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#createRow()
     */
    @Override
    public CrudInterface createRow() {
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#readRow()
     */
    @Override
    public CrudInterface readRow() {
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#updateRow()
     */
    @Override
    public CrudInterface updateRow() {
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.AbstractDao#deleteRow()
     */
    @Override
    public CrudInterface deleteRow() {
        return this;
    }

}
