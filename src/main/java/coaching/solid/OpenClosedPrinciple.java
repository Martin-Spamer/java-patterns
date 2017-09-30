/**
 *  @title       OpenClosedPrinciple.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      13-Jan-2005
 *
 **/

package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.slf4j.*;

/**
 * OpenClosedPrinciple Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:11:08
 */
public class OpenClosedPrinciple {

	private static final Logger LOG = LoggerFactory.getLogger(OpenClosedPrinciple.class);

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final OpenClosedPrinciple ocp = new OpenClosedPrinciple();
		assertNotNull("Value cannot be null", ocp);
	}
}
