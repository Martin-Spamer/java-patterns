/**
 *  @title			BasicArray.java
 *  @description	Using a basic Java array to implement an Composite.
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004
 *
 **/

package coaching.collections;

import java.util.Arrays;

import org.slf4j.*;

/**
 * Using a basic Java array to implement an Composite.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class BasicClassArray {

	private static final Logger LOG = LoggerFactory.getLogger(BasicClassArray.class);

	// Implementing Aggregate using a Class Array
	private final AbstractElement[] composite = new AbstractElement[4];

	/**
	 * Constructor.
	 */
	public BasicClassArray() {
		LOG.info("BasicClassArray");

		this.composite[0] = new ElementAlice();
		this.composite[1] = new ElementBob();
		this.composite[2] = new ElementCharlie();
		this.composite[3] = new ElementDan();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("BasicClassArray [composite=%s]", Arrays.toString(this.composite));
	}

}
