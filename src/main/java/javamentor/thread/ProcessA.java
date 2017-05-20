/**
 *  @title       ProcessA.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      20-Sep-2004
 *
 **/

package javamentor.thread;

/**
 *
 * @author martin.spamer
 * @version 0.1 - 09:18:51
 **/
public class ProcessA extends AbstractApplicationProcess {
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final ProcessA processA = new ProcessA();
		processA.start();
	}
}
