/**
 * @title			CompositeClassArray.java
 * @description	implement a UML Composite using object array.
 * @author			martin.spamer.
 * @version		0.1 - first release.
 * Created			23-Sep-2004
 **/

package coaching.associations;

import java.util.Arrays;

import org.slf4j.*;

/**
 * Using a basic Java array to implement a UML Composite.
 *
 * The Lifetime of parts is constraint bound by lifetime of parent.
 **/
public class CompositeClassArray {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeClassArray.class);

	// Implementing Composite using a Class Array
	private final AbstractAssociatedClass[] composite = {
	        new Alice(), new Bob(), new Charlie(), new Dan()
	};

	/**
	 * Instantiates a new composite class array.
	 */
	public CompositeClassArray() {
		super();
		LOG.info("CompositeClassArray");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("CompositeClassArray [composite=%s]", Arrays.toString(composite));
	}

}
