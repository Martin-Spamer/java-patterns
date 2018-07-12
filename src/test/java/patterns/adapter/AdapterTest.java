
package patterns.adapter;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void testRequest() {
        final TargetInterface adapter = new Adapter();
        adapter.operation();
    }

}
