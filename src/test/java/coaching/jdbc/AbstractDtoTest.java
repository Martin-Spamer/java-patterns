
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit test the AbstractDto class.
 */
public final class AbstractDtoTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractDtoTest.class);

    /**
     * A Mock data transfer objects.
     * To use it simple extend the <code>AbstractDto</code>.
     * e.g.<code>Customer extends AbstractDto</code>
     */
    public final class MockDto extends AbstractDto {
    }

    /**
     * Unit test typical usage of the AbstractDto class.
     */
    @Test
    public void testAbstractDto() {
        final MockDto dto = new MockDto();
        assertNotNull(dto);
        dto.addField("id=1");
        dto.addField("name=Alice");
        dto.addField("role=sender");

        assertTrue(dto.containsKey("id"));
        assertFalse(dto.containsKey("data"));

        assertEquals("1", dto.getField("id"));
        assertEquals("Alice", dto.getField("name"));
        assertEquals("sender", dto.getField("role"));

        LOG.info("dto : {}", dto);
    }

}
