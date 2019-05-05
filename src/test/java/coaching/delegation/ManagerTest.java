
package coaching.delegation;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Manager Test.
 */


@Slf4j
public final class ManagerTest {

    /**
     * Test delegation.
     */
    @Test
    public void testDelegation() {
        log.info("testDelegation");
        final Manager manager = new Manager();
        assertNotNull(manager);

        final Worker worker = new Worker();
        assertNotNull(manager);

        assertNotNull(manager.setWorker(worker));
        assertNotNull(manager.doProcess());
    }

}
