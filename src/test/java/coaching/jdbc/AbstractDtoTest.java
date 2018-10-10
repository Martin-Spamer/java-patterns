
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test the AbstractDto class.
 */
public final class AbstractDtoTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractDtoTest.class);

    /**
     * The Mock data transfer objects.
     */
    public final class MockDto extends AbstractDto {
    }

    /**
     * Unit test to abstract dto.
     */
    @Test
    public void testAbstractDto() {
        final MockDto dto = new MockDto();
        assertNotNull(dto);
        dto.addField("id=1");
        dto.addField("name=martin");
        dto.addField("data=foobar");
        LOG.info("{}", dto);
        assertEquals("1", dto.getField("id"));
        assertEquals("martin", dto.getField("name"));
        assertEquals("foobar", dto.getField("data"));
    }

}
