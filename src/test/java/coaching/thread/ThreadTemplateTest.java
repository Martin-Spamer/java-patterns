
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.application.ApplicationException;

public class ThreadTemplateTest {

    public class TestThread extends ThreadTemplate {
        @Override
        protected void execute() throws ApplicationException {
            log.info("execute");
        }
    }

    @Test
    public void testThreadTemplate() throws ApplicationException {
        ThreadTemplate threadTemplate = new ThreadTemplate();
        assertNotNull(threadTemplate);
        threadTemplate.start();
    }

    @Test
    public void testTestThread() throws ApplicationException {
        ThreadTemplate threadTemplate = new TestThread();
        assertNotNull(threadTemplate);
        threadTemplate.start();
    }

}
