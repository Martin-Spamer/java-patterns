
package coaching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test class for Box.
 */
public class BoxTest {

    /**
     * The Class Box.
     *
     * @param <V> the value type
     */
    public class Box<V> {

        /** The v. */
        protected V v;

        /**
         * Instantiates a new box.
         *
         * @param v the v
         */
        public Box(final V v) {
            this.v = v;
        }

        /**
         * Unbox.
         *
         * @return the v
         */
        public V unbox() {
            return this.v;
        }
    }

    /**
     * Unit test to something.
     */
    @Test
    public void testSomething() {
        assertEquals(2, new Box<Integer>(1).unbox() + 1);
    }
}
