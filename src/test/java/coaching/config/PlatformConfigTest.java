
package coaching.config;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PlatformConfigTest {

    @Test
    public void test() {
        final PlatformConfig config = new PlatformConfig(
                this.getClass().getSimpleName());
        assertNotNull(config);
    }

}
