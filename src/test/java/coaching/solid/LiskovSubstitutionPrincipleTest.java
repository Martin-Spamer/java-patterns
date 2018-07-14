
package coaching.solid;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test for the Liskov Substitution Principle (LSP) example class.
 */
public final class LiskovSubstitutionPrincipleTest {

    private static final Logger LOG = LoggerFactory.getLogger(LiskovSubstitutionPrincipleTest.class);

    /**
     * Unit Test for the Liskov substitution principle example class..
     */
    @Test
    public void testLiskovSubstitutionPrinciple() {
        final LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
        assertNotNull(lsp);
    }

}
