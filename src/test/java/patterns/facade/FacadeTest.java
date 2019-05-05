
package patterns.facade;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class FacadeTest.
 */


@Slf4j
public final class FacadeTest {

    /**
     * Unit Test to concrete facade operation.
     */
    @Test
    public void testConcreteFacadeOperation() {
        ConcreteFacade object = new ConcreteFacade();
        assertNotNull(object);
        object.operation();
    }

}
