
package patterns.memento;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The MementoTest Class.
 */
public class MementoTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(MementoTest.class);

    /**
     * Unit Test to memento.
     */
    @Test
    public void testMemento() {
        final Memento memento = new Memento(null);
        assertNotNull("Value cannot be null", memento);
        LOG.info("{}", memento);
    }

}
