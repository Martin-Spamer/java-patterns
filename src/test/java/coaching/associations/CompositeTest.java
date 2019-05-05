
package coaching.associations;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class CompositeTest.
 */

@Slf4j
public final class CompositeTest {

    /**
     * Unit Test to composite.
     */
    @Test
    public void testComposite() {
        final Composite composite = new Composite();
        assertNotNull(composite);
        log.info(composite.toString());
    }

}
