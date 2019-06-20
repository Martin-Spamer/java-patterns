
package coaching.fileio;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class CurrentWorkingDirectoryTest.
 */


/** The Constant 			log. */
@Slf4j
public final class CurrentWorkingDirectoryTest {

    /**
     * Unit Test to current working directory.
     */
    @Test
    public void testCurrentWorkingDirectory() {
        log.info("testCurrentWorkingDirectory");
        final CurrentWorkingDirectory cwd = new CurrentWorkingDirectory();
        assertNotNull(cwd);
    }

}
