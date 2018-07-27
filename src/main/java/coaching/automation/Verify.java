
package coaching.automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.tuples.Box;

/**
 * Verification class.
 */
public final class Verify {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(Verify.class);

    /** The boxed. */
    private Box<?> boxed;

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
        final Verify instance = Verify.create();
        instance.that(new Throwable(), actual);
        return instance;
    }

    /**
     * That.
     *
     * @param actual the actual
     * @return the verify
     */
    public static Verify that(final int actual) {
        final Verify instance = Verify.create();
        Box<Integer> boxed = new Box<>(actual);
        instance.that(new Throwable(), boxed);
        return instance;
    }

    /**
     * That.
     *
     * @param actual the actual
     * @return the verify
     */
    public static Verify that(final long actual) {
        final Verify instance = Verify.create();
        Box<Long> boxed = new Box<>(actual);
        instance.that(new Throwable(), boxed);
        return instance;
    }

    /**
     * That.
     *
     * @param caller the caller
     * @param boxed the boxed
     */
    private Verify that(final Throwable caller, final Box<?> boxed) {
        final StackTraceElement directCaller = caller.getStackTrace()[1];
        assertNotNull(directCaller);
        LOG.info("{}", boxed);
        LOG.info("{}", entryPoint(directCaller));
        this.boxed = boxed;
        return this;
    }

    /**
     * Verify that something.
     *
     * @param caller the caller
     * @param actual the actual
     * @return the verify
     */
    public Verify that(final Throwable caller, final boolean actual) {
        final StackTraceElement directCaller = caller.getStackTrace()[1];
        assertNotNull(directCaller);
        LOG.info("{}", actual);
        LOG.info("{}", entryPoint(directCaller));
        this.actual = actual;
        return this;
    }

    private String entryPoint(final StackTraceElement directCaller) {
        return String
                .format("(%s:%s)",
                        directCaller.getFileName(),
                        directCaller.getLineNumber());
    }

    /**
     * Checks if is true.
     *
     * @return true, if is
     *         true
     */
    public boolean isTrue() {
        return actual;
    }

    /**
     * Checks if is false.
     *
     * @return true, if is
     *         false
     */
    public boolean isFalse() {
        return actual == false;
    }

    /**
     * Equal to.
     *
     * @param i the i
     * @return true, if successful
     */
    public boolean equalTo(final int i) {
        return boxed.equals(i);
    }

    /**
     * Equal to.
     *
     * @param l the l
     * @return true, if successful
     */
    public boolean equalTo(final long l) {
        return boxed.equals(l);
    }

}
