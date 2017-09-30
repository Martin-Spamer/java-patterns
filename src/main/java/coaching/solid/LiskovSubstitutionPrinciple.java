/**
 *  @title       LiskovSubstitutionPrinciple.java
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
 * LiskovSubstitutionPrinciple Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:08:34
 */
public class LiskovSubstitutionPrinciple {

	private static final Logger LOG = LoggerFactory.getLogger(LiskovSubstitutionPrinciple.class);

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
		assertNotNull("Value cannot be null", lsp);
	}
}
