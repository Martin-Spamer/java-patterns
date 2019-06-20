
package coaching.resources;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import static org.junit.Assert.fail;

import lombok.extern.slf4j.Slf4j;

/**
 * Resource Loader class.
 *
 * Load the resource file from the resources. <code>
 * Class.getResourceAsStream ("resource.properties");
 * Class.getResourceAsStream ("/some/pkg/resource.properties");
 * ClassLoader.getResourceAsStream ("some/pkg/resource.properties");
 * ResourceBundle.getBundle ("some.pkg.resource");
 * </code>
 */


/** The Constant 			log. */
@Slf4j
public final class ResourceLoader {

    /**
     * Instantiates a new resource loader.
     */
    private ResourceLoader() {
        fail("Use static methods");
    }

    /**
     * Gets the stream.
     *
     * @param resourceName the resource filename
     * @return the stream
     */
    public static InputStream getStream(final String resourceName) {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        final InputStream resourceAsStream = classLoader.getResourceAsStream(resourceName);
        if (resourceAsStream == null) {
            final String message = makeMsg(resourceName);
            log.error("{}", message);
            throw new ResourceNotLoadedException(message);
        } else {
            return resourceAsStream;
        }
    }

    /**
     * Gets the stream.
     *
     * @param resourceUrl the resource url
     * @return the stream
     */
    public static InputStream getStream(final URL resourceUrl) {
        return getStream(resourceUrl.getFile());
    }

    /**
     * Gets the stream.
     *
     * @param resourceUri the resource uri
     * @return the stream
     */
    public static InputStream getStream(final URI resourceUri) {
        final String path = resourceUri.normalize().getPath();
        return getStream(path);
    }

    /**
     * Make msg.
     *
     * @param resourceName the resource filename
     * @return the string
     */
    private static String makeMsg(final String resourceName) {
        return String.format("Resource file %s not found", resourceName);
    }

}
