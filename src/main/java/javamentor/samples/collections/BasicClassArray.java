/**
 *  @title			BasicArray.java
 *  @description	Using a basic Java array to implement an Composite.
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004
 *
 **/

package javamentor.samples.collections;

/**
 * Using a basic Java array to implement an Composite.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class BasicClassArray {
	// Implementing Aggregate using a Class Array
	BasicElement[] aggregate = new BasicElement[4];

	/**
	 * Constructor
	 */
	public BasicClassArray() {
	}

	/**
	 * execute replaces the contents of the aggregate
	 */
	public void execute() {
		this.aggregate[0] = new FirstElement();
		this.aggregate[1] = new SecondElement();
		this.aggregate[2] = new ThirdElement();
		this.aggregate[3] = new FourthElement();
	}

	/**
	 * a main test class.
	 * @param args
	 */
	public static void main(String[] args) {
		final BasicClassArray basicClassArray = new BasicClassArray();
		basicClassArray.execute();
	}

}
