/**
 *  @title			AggregateClassArray
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004
 *
 **/

package coaching.collections;

/**
 * Using a basic Java array to implement an example UML Aggregation.
 * @author martin.spamer
 * @version 0.1 Created 23-Sep-2004 - 11:15:47
 **/
public class AggregateClassArray {

	// Implementing Aggregate using a Class Array
	private AbstractElement[] aggregate = new AbstractElement[4];

	/**
	 * aggregate.
	 */
	public void execute() {
		this.aggregate[0] = new ElementOne();
		this.aggregate[1] = new ElementTwo();
		this.aggregate[2] = new ElementThree();
		this.aggregate[3] = new ElementFour();
	}

}
