
package coaching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoxTest {

    public class Box<V> {
        protected V v;

        public Box(final V v) {
            this.v = v;
        }

        public V unbox() {
            return this.v;
        }
    }

    @Test
    public void testSomething() {
        assertEquals(2, new Box<Integer>(1).unbox() + 1);
    }
}
