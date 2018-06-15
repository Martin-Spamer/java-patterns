
package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The Class LiskovSubstitutionPrincipleTest.
 */
public class LiskovSubstitutionPrincipleTest {

    /**
     * Test liskov substitution principle.
     */
    @Test
    public void testLiskovSubstitutionPrinciple() {
        final LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
        assertNotNull("Value cannot be null", lsp);
    }

}
