
package coaching.idioms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the EnumExample enum.
 */


@Slf4j
public final class EnumExampleTest {

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
