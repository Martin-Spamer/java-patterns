
package coaching.associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * class CompositeTest.
 */
public final class CompositeTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CompositeTest.class);

    /**
     * Unit Test to composite.
     */
    @Test
    public void testComposite() {
        final Composite composite = new Composite();
        assertNotNull(composite);
        LOG.info(composite.toString());
    }

}
