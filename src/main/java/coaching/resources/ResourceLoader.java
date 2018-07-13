
package coaching.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * Resource Loader class.
 *
 * Load the resource file from the resources.
 * <code>
 * Class.getResourceAsStream ("resource.properties");
 * Class.getResourceAsStream ("/some/pkg/resource.properties");
 * ClassLoader.getResourceAsStream ("some/pkg/resource.properties");
 * ResourceBundle.getBundle ("some.pkg.resource");
 * </code>
 */
public final class ResourceLoader {

    /**
     * Gets the file.
     *
     * @param resourceFilename the resource filename
     * @return the file
     * @throws FileNotFoundException the file not found exception
     */
    public static File getFile(final String resourceFilename) throws FileNotFoundException {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource(resourceFilename);
        if (resource == null) {
            String message = String.format("Resource file %s not found", resourceFilename);
            throw new FileNotFoundException(message);
        } else {
            return new File(resource.toExternalForm());
        }
    }

    /**
     * Gets the file.
     *
     * @param resourceUrl the resource url
     * @return the file
     * @throws FileNotFoundException the file not found exception
     */
    public static File getFile(final URL resourceUrl) throws FileNotFoundException {
        String file = resourceUrl.getFile();
        if (file == null) {
            String message = String.format("Resource file %s not found", resourceUrl);
            throw new FileNotFoundException(message);
        } else {
            return new File(file);
        }
    }

    /**
     * Gets the file.
     *
     * @param resourceUri the resource uri
     * @return the file
     * @throws FileNotFoundException the file not found exception
     */
    public static File getFile(final URI resourceUri) throws FileNotFoundException {
        String path = resourceUri.normalize().getPath();
        if (path == null) {
            String message = String.format("Resource file %s not found", resourceUri);
            throw new FileNotFoundException(message);
        } else {
            return new File(path);
        }
    }

    /**
     * Gets the stream.
     *
     * @param resourceFilename the resource filename
     * @return the stream
     * @throws FileNotFoundException the file not found exception
     */
    public static InputStream getStream(final String resourceFilename) throws FileNotFoundException {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream(resourceFilename);
        if (resourceAsStream == null) {
            String message = String.format("Resource file %s not found", resourceFilename);
            throw new FileNotFoundException(message);
        } else {
            return resourceAsStream;
        }
    }

    /**
     * Gets the stream.
     *
     * @param resourceUrl the resource url
     * @return the stream
     * @throws FileNotFoundException the file not found exception
     */
    public static InputStream getStream(final URL resourceUrl) throws FileNotFoundException {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String file = resourceUrl.getFile();
        InputStream resourceAsStream = classLoader.getResourceAsStream(file);
        if (resourceAsStream == null) {
            String message = String.format("Resource file %s not found", resourceUrl);
            throw new FileNotFoundException(message);
        } else {
            return resourceAsStream;
        }
    }

    /**
     * Gets the stream.
     *
     * @param resourceUri the resource uri
     * @return the stream
     * @throws FileNotFoundException the file not found exception
     */
    public static InputStream getStream(final URI resourceUri) throws FileNotFoundException {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = resourceUri.normalize().getPath();
        InputStream resourceAsStream = classLoader.getResourceAsStream(path);
        if (resourceAsStream == null) {
            String message = String.format("Resource file %s not found", resourceUri);
            throw new FileNotFoundException(message);
        } else {
            return resourceAsStream;
        }
    }
}
