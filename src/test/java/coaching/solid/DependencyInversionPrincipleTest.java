
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit Test for the Dependency Inversion Principle example class.
 */
@Slf4j
public final class DependencyInversionPrincipleTest {

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
