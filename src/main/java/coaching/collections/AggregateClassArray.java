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

/**
 * Using a basic Java array to implement an example UML Aggregation.
 * @author martin.spamer
 * @version 0.1 Created 23-Sep-2004 - 11:15:47
 **/
public class AggregateClassArray {

	// Implementing Aggregate using a Class Array
	private final AbstractElement[] aggregate = new AbstractElement[4];

	/**
	 * aggregate.
	 */
	public void execute() {
		aggregate[0] = new ElementOne();
		aggregate[1] = new ElementTwo();
		aggregate[2] = new ElementThree();
		aggregate[3] = new ElementFour();
	}

	@Override
	public String toString() {
		return String.format("AggregateClassArray [aggregate=%s]", Arrays.toString(aggregate));
	}

}
