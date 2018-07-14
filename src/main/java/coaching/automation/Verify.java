
package coaching.automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class Verify {

    private static Verify INSTANCE;

    private static Verify getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Verify();
        }
        return INSTANCE;
    }

    public static void verifyThat() {
        Throwable t = new Throwable();
        Verify.getInstance().verifyThat(t);
    }

    public void verifyThat(final Throwable caller) {
        StackTraceElement directCaller = caller.getStackTrace()[1];
        assertNotNull(directCaller);
        Logger logger = LoggerFactory.getLogger(directCaller.getClassName());
        assertNotNull(logger);
        logger.info("({}:)", directCaller.getClassName(), directCaller.getLineNumber());
    }

}
