/**
 *  @title			AggregateClassArray
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004
 *
 **/

package coaching.collections;

import java.util.Arrays;

import org.slf4j.*;

/**
 * Using a basic Java array to implement an example UML Aggregation.
 * @author martin.spamer
 * @version 0.1 Created 23-Sep-2004 - 11:15:47
 **/
public class AggregateClassArray {

	private static final Logger LOG = LoggerFactory.getLogger(AggregateClassArray.class);

	// Implementing Aggregate using a Class Array
	private final AbstractElement[] aggregate = new AbstractElement[4];

	/**
	 * Instantiates a new aggregate class array.
	 */
	public AggregateClassArray() {
		LOG.info("PolymorphicList");
	}

	/**
	 * aggregate.
	 */
	public void execute() {
		this.aggregate[0] = new ElementAlice();
		this.aggregate[1] = new ElementBob();
		this.aggregate[2] = new ElementCharlie();
		this.aggregate[3] = new ElementDan();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("AggregateClassArray [aggregate=%s]", Arrays.toString(this.aggregate));
	}

}
