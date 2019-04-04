
package patterns.adapter;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class AdapterTest.
 */
@Slf4j
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
