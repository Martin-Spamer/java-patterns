
package coaching.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.AssumptionViolatedException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import static org.junit.Assume.assumeNotNull;

/**
 * The Class UnitTest.
 */
public class UnitTest {

    /**
     * The Class ClassUnderTest.
     */
    public class ClassUnderTest {

        /**
         * The Constructor.
         *
         * @param object the object
         */
        public ClassUnderTest(final Object object) {
        }

        /**
         * Do something.
         *
         * @param state the state
         */
        public void doSomething(final Object state) {
        }

        /**
         * Passed.
         *
         * @return the object
         */
        public Object passed() {
            return null;
        }
    }

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final Object state = new Object();
        assumeNotNull(state);

        // When
        final ClassUnderTest classUnderTest = new ClassUnderTest(null);
        classUnderTest.doSomething(state);

        // Then
        final Object expected = null;
        assertThat(classUnderTest.passed(), is(equalTo(expected)));
    }

    /**
     * Unit test to typical pass assume given.
     */
    @Test
    public void testTypicalPassAssumeGiven() {
        // Given
        final Object state = new Object();
        assumeNotNull(state);

        // When
        final ClassUnderTest classUnderTest = new ClassUnderTest(state);
        classUnderTest.doSomething(state);

        // Then
        final Object expected = null;
        assertThat(classUnderTest.passed(), is(equalTo(expected)));
    }

    /**
     * Unit test to typical pass assert given.
     */
    @Test
    public void testTypicalPassAssertGiven() {
        // Given
        final Object state = new Object();
        assertNotNull(state);

        // When
        final ClassUnderTest classUnderTest = new ClassUnderTest(state);
        classUnderTest.doSomething(state);

        // Then
        final Object expected = null;
        assertThat(classUnderTest.passed(), is(equalTo(expected)));
    }

    /**
     * Unit test to typical fail assume given.
     */
    @Test(expected = AssumptionViolatedException.class)
    public void testTypicalFailAssumeGiven() {
        // Given
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
