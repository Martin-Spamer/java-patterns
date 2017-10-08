/**
 *  @title			ProcessAlice.java
 *  @description	Test process.
 *  @author			martin.spamer
 *  @version		0.1 - first release.
 *	Created			20-Sep-2004 - 09:18:51
 **/

package coaching.thread;

/**
 * ProcessAlice Class.
 */
public class ProcessAlice extends AbstractProcess {

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final AbstractProcess process = new ProcessAlice();
		process.start();
	}
}
