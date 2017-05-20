/**
 *  @title			BasicArray.java
 *  @description	Using a basic Java array to implement an Composite.
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004
 *
 **/

package javamentor.collections;

/**
 * Using a basic Java array to implement an Composite.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class BasicClassArray {
	// Implementing Aggregate using a Class Array
	AbstractElement[] composite = new AbstractElement[4];

	/**
	 * Constructor
	 */
	public BasicClassArray() {
		composite[0] = new ElementOne();
		composite[1] = new ElementTwo();
		composite[2] = new ElementThree();
		composite[3] = new ElementFour();
	}

}
