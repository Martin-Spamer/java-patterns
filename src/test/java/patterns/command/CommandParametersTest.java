
package patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test example of an abstract parameters class for command classes.
 */


/** The Constant 			log. */
@Slf4j
public final class CommandParametersTest {

    /**
     * MockCommandParameters Class to test abstract Parameters class.
     */
    public final class MockCommandParameters extends AbstractCommandParameters {
        /**
         * Instantiates a new mock command parameters.
         */
        public MockCommandParameters() {
            super();
        }

        /**
         * Instantiates a new mock command parameters.
         *
         * @param key the key
         * @param value the value
         */
        public MockCommandParameters(final String key, final String value) {
            super(key, value);
        }
    }

    /**
     * Unit Test to abstract parameters.
     */
    @Test
    public void testCommandParameters() {
        log.info("testCommandParameters");
        final ParametersInterface commandParameters = new MockCommandParameters();
        assertNotNull(commandParameters);
        final String string = commandParameters.toString();
        log.debug("{}", string);
    }

    /**
     * Unit Test to get string.
     */
    @Test
    public void testSetGetParameter() {
        log.info("testInvokerConditionalCommand");
        final ParametersInterface commandParameters = new MockCommandParameters();
        assertNotNull(commandParameters);
        commandParameters.setParameter("key", "value");
        assertEquals("value", commandParameters.valueFor("key"));
        log.debug("{}", commandParameters.toString());
    }

    /**
     * Unit Test to abstract parameters string string.
     */
    @Test
    public void testAbstractParametersStringString() {
        log.info("testInvokerConditionalCommand");
        final ParametersInterface commandParameters = new MockCommandParameters("key", "value");
        assertNotNull(commandParameters);
        assertEquals("value", commandParameters.valueFor("key"));
        log.debug("{}", commandParameters.toString());
    }

}
