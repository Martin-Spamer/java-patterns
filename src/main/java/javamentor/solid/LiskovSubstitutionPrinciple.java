/**
 *  @title       LiskovSubstitutionPrinciple.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      13-Jan-2005
 *
 **/
package javamentor.solid;

import static org.junit.Assert.assertNotNull;

/**
 * LiskovSubstitutionPrinciple Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:08:34
 */
public class LiskovSubstitutionPrinciple {

	/**
	 * LiskovSubstitutionPrinciple Constructor.
	 */
	public LiskovSubstitutionPrinciple() {
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
		final LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
		assertNotNull(lsp);

	}
}
