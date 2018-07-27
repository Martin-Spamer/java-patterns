
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the ThreadTemplate.
 */
public final class ThreadTemplateTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ThreadTemplateTest.class);

    /**
     * Unit test to thread template.
     */
    @Test
    public void testThreadTemplate() {
        final ThreadTemplate threadTemplate = new ThreadTemplate();
        assertNotNull(threadTemplate);
        LOG.info(threadTemplate.toString());
    }

}
