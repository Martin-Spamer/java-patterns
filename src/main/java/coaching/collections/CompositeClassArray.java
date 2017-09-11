/**
 *  @title       BasicArray.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      23-Sep-2004
 *
 **/

package coaching.collections;

/**
 * Using a basic Java array to implement an Composite. Lifetime of parts is
 * constraint bound by lifetime of parent.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class CompositeClassArray {

	// Implementing Composite using a Class Array
	AbstractElement[] composite = { new ElementOne(), new ElementTwo(), new ElementThree(), new ElementFour() };

	/**
	 * Instantiates a new composite class array.
	 *
	 * composite
	 *
	 * @param composite the composite
	 */
	public CompositeClassArray(AbstractElement[] composite) {
		super();
		this.composite = composite;
	}
}
