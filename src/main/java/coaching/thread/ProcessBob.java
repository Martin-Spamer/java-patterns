/**
 *  @title			ProcessBob.java
 *  @description	Test process.
 *  @author			martin.spamer
 *  @version		0.1 - first release.
 *	Created			20-Sep-2004
 **/

package coaching.thread;

/**
 * ProcessBob Class.
 *
 * @author martin.spamer
 * @version 0.1 - 09:18:51
 */
public class ProcessBob extends AbstractProcess {

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final ProcessBob process = new ProcessBob();
		process.start();
	}
}
