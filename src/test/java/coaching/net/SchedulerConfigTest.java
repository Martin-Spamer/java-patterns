
package coaching.net;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SchedulerConfigTest {

    @Test
    public void testSchedulerConfig() {
        SchedulerConfig config = new SchedulerConfig();
        assertNotNull(config);
    }

}
