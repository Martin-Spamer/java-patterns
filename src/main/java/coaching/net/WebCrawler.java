/*
 * WebCrawler.java
 *
 * Created on 07 September 2005, 12:31
 */

package coaching.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.StringTokenizer;

import coaching.thread.ThreadTemplate;
import lombok.extern.slf4j.Slf4j;

/**
 * A class to crawl a web site.
 */
@Slf4j
public final class WebCrawler extends ThreadTemplate {

    private static final int BUFFER_SIZE = 1024;
    private static final String BASE_URL = "http://127.0.0.1:8080";
    public static final int SEARCH_LIMIT = 4;
    public static final String SEARCH = "Search";
    public static final String STOP = "Stop";
    public static final String DISALLOW = "Disallow:";
    protected String[] args;

    public WebCrawler() {
        super();
    }

    public WebCrawler(final String[] args) {
        super();
        this.args = args;
    }

    /*
     * (non-Javadoc)
     * @see coaching.net.ThreadTemplate#execute()
     */
    @Override
    public void execute() {
        try {
            final URL url = new URL(BASE_URL);
            if (isHttp(url)) {
                crawlSite(url);
            }
        } catch (final Exception e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Checks if is http.
     *
     * @param url the url
     * @return true, if checks if is http
     */
    private boolean isHttp(final URL url) {
        return url.getProtocol().compareTo("http") == 0;
    }

    /**
     * Crawl site from the baseURL of site.
     *
     * @param baseUrl the base url
     */
    protected void crawlSite(final URL baseUrl) {
        try {
            // form URL for any ROBOTS.TXT file
            final String robotsTxtFile = String.format("%s/robots.txt", baseUrl);
            final URL robotsUrl = new URL(robotsTxtFile);
            final StringBuilder robotTxtContent = new StringBuilder();
            final StringBuilder robotTxtContentBuffer = new StringBuilder();

            try {
                final byte[] buffer = new byte[1024];
                final InputStream robotsTxtInputStream = robotsUrl.openStream();
                int bufferContentSize = 0;
                do {
                    bufferContentSize = robotsTxtInputStream.read(buffer);
                    if (bufferContentSize != -1) {
                        final String str = new String(buffer, 0, bufferContentSize);
                        robotTxtContent.append(str);
                        robotTxtContentBuffer.append(Arrays.toString(buffer));
                    }
                } while (bufferContentSize != -1);

                robotsTxtInputStream.close();
            } catch (final IOException ioException) {
                log.error("{}", ioException);
            }

            safeCrawlSite(baseUrl, robotTxtContent.toString());

        } catch (final MalformedURLException malformedURLException) {
            log.error("{}", malformedURLException);
        }
    }

    /**
     * Safe crawl site.
     *
     * base url robot txt content
     *
     * @param baseUrl the base url
     * @param robotTxtContent the robot txt content
     */
    protected void safeCrawlSite(final URL baseUrl, final String robotTxtContent) {

        // search ROBOTS.TXT for "Disallow:" commands.
        final String baseFile = baseUrl.getFile();

        int index = 0;
        while ((index = robotTxtContent.indexOf(DISALLOW, index)) != -1) {
            index += DISALLOW.length();
            final String disallowStatement = robotTxtContent.substring(index);
            final StringTokenizer st = new StringTokenizer(disallowStatement);

            if (!st.hasMoreTokens()) {
                break;
            }

            final String disallowedPath = st.nextToken();

            // * URL starts with a disallowed path, it is not safe
            if (baseFile.indexOf(disallowedPath) == 0) {
                return;
            } else {
                // do stuff
                slowCrawlUrl(baseUrl);
            }
        }
    }

    /**
     * Slow crawl url.
     *
     * base url
     *
     * @param baseUrl the base url
     */
    protected void slowCrawlUrl(final URL baseUrl) {
        try {
            // * URL
            final URLConnection urlConnection = baseUrl.openConnection();
            urlConnection.setAllowUserInteraction(false);

            final InputStream urlStream = baseUrl.openStream();
            final String mimeType = URLConnection.guessContentTypeFromStream(urlStream);

            if (mimeType != null) {
                if (mimeType.compareTo("text/html") == 0) {
                    final StringBuilder responseContent = new StringBuilder();
                    final StringBuilder responseContentBuffer = new StringBuilder();

                    final InputStream inputStream = baseUrl.openStream();
                    final byte[] buffer = new byte[BUFFER_SIZE];
                    int bufferContentSize = 0;
                    do {
                        bufferContentSize = inputStream.read(buffer);
                        if (bufferContentSize != -1) {
                            final String strBuffer = new String(buffer, 0, bufferContentSize);
                            responseContent.append(strBuffer);
                            responseContentBuffer.append(Arrays.toString(buffer));
                        }
                    } while (bufferContentSize != -1);

                    inputStream.close();

                }
            }
        } catch (final Exception e) {
            log.error("slowCrawlUrl", e);
        }
    }

    /**
     * main method.
     *
     * arguments
     *
     * @param args the args
     */
    public static void main(final String args[]) {
        new WebCrawler(args).start();
    }

}
