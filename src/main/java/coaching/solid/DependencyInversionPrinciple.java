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

/**
 * DependencyInversionPrinciple Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:07:53
 */
public class DependencyInversionPrinciple {

	/**
	 * DependencyInversionPrinciple Constructor.
	 */
	public DependencyInversionPrinciple() {
		super();
	}

	/**
	 * main method.
	 *
	 * arguments
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		final DependencyInversionPrinciple dip = new DependencyInversionPrinciple();
		assertNotNull(dip);
	}
}
