/**
 *  @title			AggregateClassArray
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004
 *
 **/

package javamentor.collections;

/**
 * Using a basic Java array to implement an Aggregate association.
 * @author martin.spamer
 * @version 0.1 Created 23-Sep-2004 - 11:15:47
 **/
public class AggregateClassArray {

	// Implementing Aggregate using a Class Array
	AbstractElement[] aggregate = new AbstractElement[4];

	/**
	 *
	 * execute replaces the contents of the aggregate
	 */
	public void execute() {
		aggregate[0] = new ElementOne();
		aggregate[1] = new ElementTwo();
		aggregate[2] = new ElementThree();
		aggregate[3] = new ElementFour();
	}

}
