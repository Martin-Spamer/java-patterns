
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
