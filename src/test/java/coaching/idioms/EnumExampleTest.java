
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the EnumExample enum.
 */
public final class EnumExampleTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(EnumExampleTest.class);

    /**
     * Unit Test to enum example.
     */
    @Test
    public void testEnumExample() {
        final EnumExample enumExample = EnumExample.Unknown;
        assertNotNull(enumExample);
    }

    /**
     * Unit Test to from string.
     */
    @Test
    public void testFromString() {
        final EnumExample enumExample = EnumExample.Unknown;
        assertNotNull(enumExample);
        assertEquals("Unknown", enumExample.toString());
    }

}
