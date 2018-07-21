
package coaching.context;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The Class AbstractContextTest.
 */
public final class AbstractContextTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(AbstractContextTest.class);

    /**
     * The Class TestContext.
     */
    public final class TestContext extends AbstractContext {

        /**
         * Default Constructor.
         */
        private TestContext() {
            super();
        }

        /**
         * Default Constructor.
         *
         * @param properties the properties
         */
        private TestContext(final Properties properties) {
            super(properties);
        }
    }

    /**
     * Test abstract context.
     */
    @Test
    public void testAbstractContext() {
        final TestContext testContext = new TestContext();
        assertNotNull(testContext);
    }

    /**
     * Test abstract context properties.
     */
    @Test
    public void testAbstractContextProperties() {
        final TestContext testContext = new TestContext(new Properties());
        assertNotNull(testContext);
    }

    /**
     * Test set properties.
     */
    @Test
    public void testSetProperties() {
        final TestContext testContext = new TestContext();
        assertNotNull(testContext);
        testContext.setProperties(new Properties());
    }

    /**
     * Test set get property.
     */
    @Test
    public void testSetGetProperty() {
        final TestContext testContext = new TestContext();
        assertNotNull(testContext);
        final String key = "key";
        final String value = "value";
        testContext.setProperty(key, value);
        assertEquals(value, testContext.getProperty(key));
    }

}
