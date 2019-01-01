
package coaching.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DaoToXml class.
 */
public final class DaoToXml {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(DaoToXml.class);

    /** Data access object. */
    private final DaoInterface dao = new DynamicDao();

}
