
package coaching.automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class Verify {

    private static final Verify INSTANCE = new Verify();

    private static Verify getInstance() {
        return INSTANCE;
    }

    public static void verifyThat() {
        final Throwable t = new Throwable();
        Verify.getInstance().verifyThat(t);
    }

    public void verifyThat(final Throwable caller) {
        final StackTraceElement directCaller = caller.getStackTrace()[1];
        assertNotNull(directCaller);
        final Logger logger = LoggerFactory.getLogger(directCaller.getClassName());
        assertNotNull(logger);
        logger.info("({}:)", directCaller.getClassName(), directCaller.getLineNumber());
    }

}
