
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit Test for the Liskov Substitution Principle (LSP) example class.
 */
@Slf4j
public final class LiskovSubstitutionPrincipleTest {

    /**
     * Unit Test for the Liskov substitution principle example class..
     */
    @Test
    public void testLiskovSubstitutionPrinciple() {
        final LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
        assertNotNull(lsp);
    }

}
