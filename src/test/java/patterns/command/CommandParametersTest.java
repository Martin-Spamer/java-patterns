
package patterns.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for abstract parameters Class for commands.
 */
public class CommandParametersTest {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * MockCommandParameters Class to test abstract Parameters class.
     */
    public class MockCommandParameters extends AbstractCommandParameters {

        /**
         * Instantiates a new mock command parameters.
         */
        public MockCommandParameters() {
            super();
        }

        /**
         * Instantiates a new mock command parameters.
         *
         * @param key
         *            the key
         * @param value
         *            the value
         */
        public MockCommandParameters(final String key, final String value) {
            super(key, value);
        }
    }

    /**
     * Unit Test to abstract parameters.
     */
    @Test
    public void testAbstractParameters() {
        final ParametersInterface commandParameters = new MockCommandParameters();
        assertNotNull("Value cannot be null", commandParameters);
        this.log.info("{}", commandParameters.toString());
    }

    /**
     * Unit Test to abstract parameters string string.
     */
    @Test
    public void testAbstractParametersStringString() {
        final ParametersInterface commandParameters = new MockCommandParameters("key", "value");
        assertNotNull("Value cannot be null", commandParameters);
        this.log.info("{}", commandParameters.toString());
        assertEquals("value", commandParameters.valueFor("key"));
    }

    /**
     * Unit Test to get string.
     */
    @Test
    public void testGetString() {
        final ParametersInterface commandParameters = new MockCommandParameters();
        assertNotNull("Value cannot be null", commandParameters);
        commandParameters.setParameter("key", "value");
        this.log.info("{}", commandParameters.toString());
        assertEquals("value", commandParameters.valueFor("key"));
    }

}
