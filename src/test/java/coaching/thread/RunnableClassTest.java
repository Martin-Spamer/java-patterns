
package coaching.thread;

import org.junit.Test;

/**
 * Unit test class for RunnableClass.
 */
public class RunnableClassTest {

    /**
     * Unit test to runnable class.
     */
    @Test
    public void testRunnableClass() {
        new Thread(new RunnableClass()).start();
    }

}
