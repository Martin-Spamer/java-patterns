
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class ThreadTemplateTest {

    private static final Logger LOG = LoggerFactory.getLogger(ThreadTemplateTest.class);

    @Test
    public void testThreadTemplate() {
        ThreadTemplate threadTemplate = new ThreadTemplate();
        assertNotNull(threadTemplate);
        LOG.info(threadTemplate.toString());
    }

}
