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

/**
 * Using a basic Java array to implement a Composite.
 * The Lifetime of parts is constraint bound by lifetime of parent.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class CompositeClassArray {

	// Implementing Composite using a Class Array
	private AbstractElement[] composite = { new ElementOne(), new ElementTwo(), new ElementThree(), new ElementFour() };

	/**
	 * Instantiates a new composite class array.
	 *
	 * @param composite the composite
	 */
	public CompositeClassArray(final AbstractElement[] composite) {
		super();
		this.composite = composite;
	}

	@Override
	public String toString() {
		return String.format("CompositeClassArray [composite=%s]", Arrays.toString(this.composite));
	}

}
