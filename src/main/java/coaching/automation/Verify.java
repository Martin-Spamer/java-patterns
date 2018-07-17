
package coaching.automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public final class Verify {

    private static final Logger LOG = LoggerFactory.getLogger(Verify.class);
    private boolean actual;

    private Verify() {
        super();
    }

    private static Verify create() {
        return new Verify();
    }

    public static Verify that(final boolean actual) {
        final Throwable t = new Throwable();
        final Verify instance = Verify.create();
        instance.that(t, actual);
        return instance;
    }

    public Verify that(final Throwable caller, final boolean actual) {
        final StackTraceElement directCaller = caller.getStackTrace()[1];
        assertNotNull(directCaller);
        final Logger callerLog = LoggerFactory
            .getLogger(directCaller.getClassName());
        assertNotNull(callerLog);
        callerLog
            .info("({}:{})",
                    directCaller.getClassName(),
                    directCaller.getLineNumber());
        this.actual = actual;
        return this;
    }

    public boolean isTrue() {
        return actual;
    }

    public boolean isFalse() {
        return actual == false;
    }

}
