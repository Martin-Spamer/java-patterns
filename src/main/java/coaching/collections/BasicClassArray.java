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

/**
 * Using a basic Java array to implement an Composite.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class BasicClassArray {

	// Implementing Aggregate using a Class Array
	private AbstractElement[] composite = new AbstractElement[4];

	/**
	 * Constructor.
	 */
	public BasicClassArray() {
		this.composite[0] = new ElementOne();
		this.composite[1] = new ElementTwo();
		this.composite[2] = new ElementThree();
		this.composite[3] = new ElementFour();
	}

	@Override
	public String toString() {
		return String.format("BasicClassArray [composite=%s]", Arrays.toString(this.composite));
	}

}
