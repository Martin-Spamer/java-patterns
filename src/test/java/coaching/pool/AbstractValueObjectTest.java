
package coaching.pool;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for AbstractValueObject.
 */
@Slf4j
public class AbstractValueObjectTest {

    /**
     * The Class ValueObject.
     */

    public class ValueObject extends AbstractValueObject {
    }

    /**
     * Unit test to abstract value object.
     */
    @Test
    public void testAbstractValueObject() {
        assertNotNull(new ValueObject());
    }

}
