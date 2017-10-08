/**
 *  @title			ProcessBob.java
 *  @description	Test process.
 *  @author			martin.spamer
 *  @version		0.1 - first release.
 *	Created			20-Sep-2004 - 09:18:51
 **/

package coaching.thread;

/**
 * ProcessBob Class.
 */
public class ProcessBob extends AbstractProcess {

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final AbstractProcess process = new ProcessBob();
		process.start();
	}

}
