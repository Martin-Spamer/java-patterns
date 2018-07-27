
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the WebCrawler class.
 */
public final class WebCrawlerTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(WebCrawlerTest.class);

    /**
     * Unit test to web crawler.
     */
    @Test
    public void testWebCrawler() {
        final WebCrawler webCrawler = new WebCrawler();
        assertNotNull(webCrawler);
        LOG.info(webCrawler.toString());
    }

    /**
     * Unit test to execute.
     */
    @Test
    public void testExecute() {
        final WebCrawler webCrawler = new WebCrawler();
        assertNotNull(webCrawler);
        webCrawler.execute();
        LOG.info(webCrawler.toString());
    }

}
