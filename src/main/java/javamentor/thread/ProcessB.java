/**
 *  @title       ProcessB.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      20-Sep-2004
 *
 **/

package javamentor.thread;

/**
 * ProcessB Class.
 *
 * @author martin.spamer
 * @version 0.1 - 09:18:51
 */
public class ProcessB extends AbstractApplicationProcess {

	/**
	 * main method.
	 *
	 * arguments
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		final ProcessB processB = new ProcessB();
		processB.start();
	}
}
