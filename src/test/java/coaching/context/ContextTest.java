
package coaching.context;

import java.util.Properties;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The abstract ContextTest class.
 */



@Slf4j
public final class ContextTest {

    /**
     * TestContext Class.
     */
    public final class TestContext extends AbstractContext {

        /**
         * Default Constructor.
         */
        private TestContext() {
            super();
            log.info("TestContext()");
        }

        /**
         * Default Constructor.
         *
         * @param properties the properties
         */
        private TestContext(final Properties properties) {
            super(properties);
            log.info("TestContext({})", properties);
        }
    }

    /**
     * Test abstract context.
     */
    @Test
    public void testAbstractContext() {
        final TestContext testContext = new TestContext();
        assertNotNull(testContext);
        log.info("{}", testContext);
    }

    /**
     * Test abstract context properties.
     */
    @Test
    public void testAbstractContextProperties() {
        final TestContext testContext = new TestContext(new Properties());
        assertNotNull(testContext);
        log.info("{}", testContext);
    }

    /**
     * Test set properties.
     */
    @Test
    public void testSetProperties() {
        final TestContext testContext = new TestContext();
        assertNotNull(testContext);
        testContext.setProperties(new Properties());
        log.info("{}", testContext);
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
        assertEquals("value", testContext.getProperty("missing", "value"));
        log.info("{}", testContext);
    }

}
