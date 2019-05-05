
package coaching.pool;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for AbstractValueObject.
 */
public class AbstractValueObjectTest {

    /**
     * The ValueObject.
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
