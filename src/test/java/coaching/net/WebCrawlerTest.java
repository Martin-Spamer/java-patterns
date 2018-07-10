
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class WebCrawlerTest {

    private static final Logger LOG = LoggerFactory.getLogger(WebCrawlerTest.class);

    @Test
    public void testWebCrawler() {
        WebCrawler webCrawler = new WebCrawler();
        assertNotNull(webCrawler);
        LOG.info(webCrawler.toString());
    }

    @Test
    public void testExecute() {
        WebCrawler webCrawler = new WebCrawler();
        assertNotNull(webCrawler);
        webCrawler.execute();
        LOG.info(webCrawler.toString());
    }

}
