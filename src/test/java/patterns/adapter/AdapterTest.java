
package patterns.adapter;

import org.junit.Test;

/**
 * The Class AdapterTest.
 */
public final class AdapterTest {

    /**
     * Unit test to request.
     */
    @Test
    public void testRequest() {
        final TargetInterface adapter = new Adapter();
        adapter.operation();
    }

}
