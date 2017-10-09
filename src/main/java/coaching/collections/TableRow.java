
package coaching.collections;

import java.util.LinkedHashMap;

import org.slf4j.*;

/**
 * Table Row class.
 */
public class TableRow {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private final LinkedHashMap<String, TableCell> cols = new LinkedHashMap<String, TableCell>();

}
