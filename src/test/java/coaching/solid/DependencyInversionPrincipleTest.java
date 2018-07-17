
package coaching.solid;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test for the Dependency Inversion Principle example class.
 */
public final class DependencyInversionPrincipleTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(DependencyInversionPrincipleTest.class);

    /**
     * Unit Test to demonstrate the dependency inversion principle with java
     * example.
     */
    @Test
    public void testDependencyInversionPrinciple() {
        final DependencyInversionPrinciple dip = new DependencyInversionPrinciple();
        assertNotNull(dip);
    }

}
