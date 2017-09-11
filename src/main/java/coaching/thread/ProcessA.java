/**
 *  @title       ProcessA.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      20-Sep-2004
 *
 **/

package coaching.thread;

/**
 * ProcessA Class.
 *
 * @author martin.spamer
 * @version 0.1 - 09:18:51
 */
public class ProcessA extends AbstractApplicationProcess {

	/**
	 * main method.
	 *
	 * arguments
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		final ProcessA processA = new ProcessA();
		processA.start();
	}
}
