
package patterns.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class ContextTest.
 */
@Slf4j
public final class ContextTest {

    /**
     * Unit Test to context.
     */
    @Test
    public void testContext() {
        assertNotNull(new Context());
    }

}
