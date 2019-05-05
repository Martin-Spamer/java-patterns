
package coaching.types;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The ObjectTypesTest class.
 */


@Slf4j
public final class ObjectTypesTest {

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
