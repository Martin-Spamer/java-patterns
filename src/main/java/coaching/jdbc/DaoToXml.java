
package coaching.jdbc;

import lombok.extern.slf4j.Slf4j;

/**
 * DaoToXml class.
 */
@Slf4j
public final class DaoToXml {

    /** Data access object. */
    private final DaoInterface dao = new DynamicDao();

}
