
package patterns.bridge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * BridgeTest class.
 */
@Slf4j
public final class BridgeTest {

    /**
     * Unit Test to operation.
     */
    @Test
    public void testOperation() {
        final RefinedAbstraction instance = new RefinedAbstraction(new Implementor());
        assertNotNull(instance);
        log.info(instance.toString());
    }

}
