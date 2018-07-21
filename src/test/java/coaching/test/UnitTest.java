
package coaching.test;

import org.junit.AssumptionViolatedException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeNotNull;

/**
 * Unit test for the UnitTest class.
 */
public final class UnitTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(UnitTest.class);

    /**
     * Unit test class for ClassUnder.
     */
    public final class ClassUnderTest {
        
        /**
         * Instantiates a new class under test.
         */
        public ClassUnderTest() {
            super();
            LOG.debug("ClassUnderTest() : {}", this);
        }

        /**
         * Instantiates a new class under test.
         *
         * @param object the object
         */
        public ClassUnderTest(final Object object) {
            super();
            LOG.debug("ClassUnderTest({object}) : {}", object, this);
            doSomething(object);
        }

        /**
         * Do something.
         *
         * @param state the state
         * @return the class under test
         */
        public ClassUnderTest doSomething(final Object state) {
            if (state == null) {
                return (ClassUnderTest) failed();
            } else {
                return (ClassUnderTest) passed();
            }
        }

        /**
         * Failed.
         *
         * @return the object
         */
        public Object failed() {
            return null;
        }

        /**
         * Passed.
         *
         * @return the object
         */
        public Object passed() {
            return this;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return String.format("%s []", this.getClass().getSimpleName());
        }
    }

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalGivenWhenThenPasses() {
        // Given we have some state
        final Object state = new Object();
        assumeNotNull(state);

        // When the class under test does its thing.
        final ClassUnderTest classUnderTest = new ClassUnderTest(null);
        classUnderTest.doSomething(state);

        // Then the expected result is something
        assertEquals(classUnderTest, classUnderTest.passed());
    }

    /**
     * Unit test to typical pass assume given.
     */
    @Test
    public void testTypicalAssumeGivenPasses() {
        // Given should use assumptions not assertions.
        final Object state = new Object();
        assumeNotNull(state);

        // When can use assertions
        final ClassUnderTest classUnderTest = new ClassUnderTest(state);
        assertEquals(classUnderTest, classUnderTest.doSomething(state));

        // Then should use assertions
        // Then the expected result is something
        assertEquals(classUnderTest, classUnderTest.passed());
    }

    /**
     * Unit test to typical pass assume given.
     */
    @Test
    public void testTypicalAssumeGivenFails() {
        // Given should use assumptions not assertions.
        final Object state = null;
        assumeNotNull(state);

        // When the class under test does its thing.
        final ClassUnderTest classUnderTest = new ClassUnderTest(null);
        classUnderTest.doSomething(state);

        // Then the expected result is something
        assertEquals(classUnderTest, classUnderTest.passed());
    }

    /**
     * Unit test to typical fail assume given.
     */
    @Test(expected = AssumptionViolatedException.class)
    public void testTypicalFailAssumeGiven() {
        // Given assumptions fails
        final Object state = null;
        assumeNotNull(state);
        // When
        // Then
    }

    /**
     * Unit test to typical fail assert given.
     */
    @Test(expected = AssertionError.class)
    public void testTypicalFailAssertGiven() {
        // Given
        final Object state = null;
        assertNotNull(state);
        // When
        // Then
    }

}
