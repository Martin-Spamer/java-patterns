
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.thread.ThreadTemplate.ApplicationException;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for ThreadTemplate.
 */


/** The Constant 			log. */
@Slf4j
public class ThreadTemplateTest {

    /**
 * The TestThread.
     */
    public class TestThread extends ThreadTemplate {
        /*
         * (non-Javadoc)
         * @see coaching.thread.ThreadTemplate#execute()
         */
        @Override
        protected void execute() throws ApplicationException {
            log.info("execute");
        }
    }

    /**
     * Unit test to thread template.
     *
     * @throws ApplicationException the application exception
     */
    @Test
    public void testThreadTemplate() throws ApplicationException {
        final ThreadTemplate threadTemplate = new ThreadTemplate();
        assertNotNull(threadTemplate);
        threadTemplate.start();
        threadTemplate.stop();
    }

    /**
     * Unit test to test thread.
     *
     * @throws ApplicationException the application exception
     */
    @Test
    public void testTestThread() throws ApplicationException {
        final ThreadTemplate threadTemplate = new TestThread();
        assertNotNull(threadTemplate);
        threadTemplate.start();
        threadTemplate.stop();
    }

}
