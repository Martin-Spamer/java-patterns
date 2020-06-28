
package coaching.net;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the WebCrawler class.
 */

@Slf4j
public final class WebCrawlerTest {

    @Ignore
    @Test
    public void testWebCrawler() {
        final WebCrawler webCrawler = new WebCrawler();
        assertNotNull(webCrawler);
        log.info(webCrawler.toString());
    }

    /**
     * Unit test to execute.
     */
    @Ignore
    @Test
    public void testExecute() {
        final WebCrawler webCrawler = new WebCrawler();
        assertNotNull(webCrawler);
        webCrawler.execute();
        log.info(webCrawler.toString());
    }

}
