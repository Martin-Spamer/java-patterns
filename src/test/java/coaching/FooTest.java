
package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class FooTest.
 */
public class FooTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(FooTest.class);

    /**
     * Unit test to.
     */
    @Test
    public void test() {
        LOG.info(Thread.currentThread().getContextClassLoader().toString());
        LOG.info(this.getClass().getClassLoader().toString());
    }

}
