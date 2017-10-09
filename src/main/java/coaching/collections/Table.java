
package coaching.collections;

import java.util.LinkedHashMap;

import org.slf4j.*;

/**
 * Table class.
 */
public class Table {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private final LinkedHashMap<String, TableRow> rows = new LinkedHashMap<String, TableRow>();

}
