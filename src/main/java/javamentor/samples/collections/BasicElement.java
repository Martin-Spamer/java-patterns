/**
 *  @title       BasicElement.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      23-Sep-2004
 *
 **/

package javamentor.samples.collections;

/**
 * The BasicElement Class.
 */
public abstract class BasicElement {

	/**
	 * Constructor instantiates a new basic element.
	 */
	public BasicElement() {
		System.out.println("new " + this.getClass().getName());
	}

	/**
	 * execute
	 */
	public void execute() {
		System.out.println(this.getClass().getName() + ".execute");
	}
}
