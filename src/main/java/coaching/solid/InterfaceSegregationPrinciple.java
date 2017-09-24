/**
 *  @title       InterfaceSegregationPrinciple.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      13-Jan-2005
 *
 **/

package coaching.solid;

import static org.junit.Assert.assertNotNull;

/**
 * InterfaceSegregationPrinciple Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:21:40
 */
public class InterfaceSegregationPrinciple implements ExampleInterface {

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final InterfaceSegregationPrinciple isp = new InterfaceSegregationPrinciple();
		assertNotNull(isp);
	}
}
