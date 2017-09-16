/**
 *  @title			ProcessCharlie.java
 *  @description	Test process.
 *  @author			martin.spamer
 *  @version		0.1 - first release.
 *	Created			20-Sep-2004
 **/

package coaching.thread;

/**
 * ProcessCharlie Class.
 *
 * @author martin.spamer
 * @version 0.1 - 09:18:51
 */
public class ProcessCharlie extends AbstractProcess {

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final ProcessCharlie process = new ProcessCharlie();
		process.start();
	}
}
