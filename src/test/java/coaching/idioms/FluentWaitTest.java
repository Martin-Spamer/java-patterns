
package coaching.idioms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * Fluent Wait Test class.
 */



@Slf4j
public final class FluentWaitTest {

    /**
     * class PassCondition.
     */
    public final class PassCondition extends Condition {

        /**
         * Instantiates a new pass condition.
         */
        public PassCondition() {
            super(true);
        }
    }

    /**
     * class FailCondition.
     */
    public final class FailCondition extends Condition {

        /**
         * Instantiates a new fail condition.
         */
        public FailCondition() {
            super(false);
        }
    }

    /**
     * Unit Test to fluent wait.
     */
    @Test
    public void testFluentWaitDefault() {
        log.info("testFluentWaitDefault = {}", System.currentTimeMillis());
        final FluentWait wait = new FluentWait();
        final ConditionInterface<Boolean> pass = new PassCondition();
        assertTrue(wait.until(pass));
        log.debug("end = {}", System.currentTimeMillis());
    }

    /**
     * Unit Test to fluent wait.
     */
    @Test
    public void testFluentWaitWithOverrides() {
        log.info("testFluentWaitDefault = {}", System.currentTimeMillis());
        final FluentWait wait = new FluentWait();

        assertEquals(wait, wait.setTimeOut(1000));
        assertEquals(1000, wait.setTimeOut());
        log.debug("after interval = {}", System.currentTimeMillis());

        assertEquals(wait, wait.setInterval(100));
        assertEquals(1000, wait.setTimeOut());
        log.debug("after interval = {}", System.currentTimeMillis());

        final ConditionInterface<Boolean> pass = new PassCondition();
        assertTrue(wait.until(pass));
        log.debug("end = {}", System.currentTimeMillis());
    }

    /**
     * Unit Test to wait until condition true.
     */
    @Test
    public void testWaitUntilConditionTrue() {
        log.info("testFluentWaitDefault = {}", System.currentTimeMillis());
        final FluentWait wait = new FluentWait();
        assertTrue(wait.until(new PassCondition()));
        log.debug("end = {}", System.currentTimeMillis());
    }

    /**
     * Unit Test to wait until condition false.
     */
    @Test
    public void testWaitUntilConditionFalse() {
        log.info("testFluentWaitDefault = {}", System.currentTimeMillis());
        final FluentWait wait = new FluentWait();
        // wait.until(new Condition(false));
        assertFalse(wait.until(new FailCondition()));
        log.debug("end = {}", System.currentTimeMillis());
    }
}
