/**
 *  @title       BasicArray.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      23-Sep-2004
 *
 **/

package coaching.collections;

import java.util.Arrays;

import org.slf4j.*;

/**
 * Using a basic Java array to implement a Composite.
 * The Lifetime of parts is constraint bound by lifetime of parent.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class CompositeClassArray {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeClassArray.class);

	// Implementing Composite using a Class Array
	private AbstractElement[] composite = { new ElementAlice(), new ElementBob(), new ElementCharlie(),
	        new ElementDan() };

	/**
	 * Instantiates a new composite class array.
	 */
	public CompositeClassArray() {
		LOG.info("PolymorphicList");
	}

	/**
	 * Instantiates a new composite class array.
	 *
	 * @param composite the composite
	 */
	public CompositeClassArray(final AbstractElement[] composite) {
		super();
		this.composite = composite;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("CompositeClassArray [composite=%s]", Arrays.toString(this.composite));
	}

}
