
package coaching.thread;

import org.junit.Test;

public class RunnableClassTest {

    @Test
    public void testRunnableClass() {
        new Thread(new RunnableClass()).start();
    }

}
