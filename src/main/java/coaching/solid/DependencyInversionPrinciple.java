/**
 *  @title       DependencyInversionPrinciple.java
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
 * DependencyInversionPrinciple Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:07:53
 */
public class DependencyInversionPrinciple {

	private static final Logger LOG = LoggerFactory.getLogger(DependencyInversionPrinciple.class);

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final DependencyInversionPrinciple dip = new DependencyInversionPrinciple();
		assertNotNull(dip);
	}
}
