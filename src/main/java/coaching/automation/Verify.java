
package coaching.automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The Class Verify.
 */
public final class Verify {

    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory.getLogger(Verify.class);
    
    /** The actual. */
    private boolean actual;

    /**
     * Instantiates a new verify.
     */
    private Verify() {
        super();
    }

    /**
     * Factory method to create a new instance of Verify.
     *
     * @return new instance of Verify
     */
    private static Verify create() {
        return new Verify();
    }

    /**
     * That.
     *
     * @param actual the actual
     * @return the verify
     */
    public static Verify that(final boolean actual) {
        final Throwable t = new Throwable();
        final Verify instance = Verify.create();
        instance.that(t, actual);
        return instance;
    }

    /**
     * That.
     *
     * @param caller the caller
     * @param actual the actual
     * @return the verify
     */
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

    /**
     * Checks if is true.
     *
     * @return true, if is
     * 			true
     */
    public boolean isTrue() {
        return actual;
    }

    /**
     * Checks if is false.
     *
     * @return true, if is
     * 			false
     */
    public boolean isFalse() {
        return actual == false;
    }

}
