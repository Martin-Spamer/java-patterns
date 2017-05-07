/**
 *  @title       BasicArray.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      23-Sep-2004
 *
 **/

package javamentor.samples.collections;

/**
 * Using a basic Java array to implement an Composite. Lifetime of parts is
 * constraint bound by lifetime of parent.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class CompositeClassArray {
	// Implementing Composite using a Class Array
	BasicElement[] composite = { new FirstElement(), new SecondElement(), new ThirdElement(), new FourthElement() };

	/**
	 * Constructor
	 */
	public CompositeClassArray() {
	}

	/**
	 * execute replaces the contents of the aggregate
	 */
	public void execute() {
	}

	/**
	 * a main test class.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final CompositeClassArray basicClassArray = new CompositeClassArray();
		basicClassArray.execute();
	}

}
