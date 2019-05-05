
package coaching.thread;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for RunnableClass.
 */


@Slf4j
public class RunnableClassTest {

    /**
     * Unit test to runnable class.
     */
    @Test
    public void testRunnableClass() {
        new Thread(new RunnableClass()).start();
    }

}
