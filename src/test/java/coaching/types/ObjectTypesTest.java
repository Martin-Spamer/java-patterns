
package coaching.types;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The ObjectTypesTest class.
 */
public final class ObjectTypesTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(ObjectTypesTest.class);

    /**
     * Unit Test to display.
     */
    @Test
    public void testDisplay() {
        final ObjectTypes objectTypes = new ObjectTypes();
        assertNotNull(objectTypes);
        objectTypes.display();
    }

}
