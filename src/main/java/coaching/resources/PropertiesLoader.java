
package coaching.resources;

/**
 * Property Loader class.
 *
 * Loads a properties file by name from the classpath.
 *
 * The resource must be a file with .properties extension.
 *
 * The name is assumed to be absolute and can use either "/" or "." for package
 * segment separation with an
 * optional leading "/" and
 * The ".properties" suffix optional.
 * The following names refer to the same resource:
 * some.pkg.Resource
 * some.pkg.Resource.properties
 * some/pkg/Resource
 * some/pkg/Resource.properties
 * /some/pkg/Resource
 * /some/pkg/Resource.properties
 */
public class PropertiesLoader extends ResourceLoader {

    /**
     * Constructor.
     */
    public PropertiesLoader() {
        super();
    }

    /**
     * Constructor.
     *
     * @param propertyFileName the property file name
     */
    public PropertiesLoader(final String propertyFileName) {
        super(propertyFileName);
    }

}
