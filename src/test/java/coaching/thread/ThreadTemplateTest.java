
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.application.ApplicationException;

/**
 * Unit test class for ThreadTemplate.
 */
public class ThreadTemplateTest {

    /**
     * The Class TestThread.
     */
    public class TestThread extends ThreadTemplate {

        /*
         * (non-Javadoc)
         * @see coaching.thread.ThreadTemplate#execute()
         */
        @Override
        protected void execute() throws ApplicationException {
            this.log.info("execute");
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
