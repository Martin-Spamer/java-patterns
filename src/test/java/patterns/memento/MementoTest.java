
package patterns.memento;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The MementoTest class.
 */


@Slf4j
public final class MementoTest {

    /**
     * Unit Test to memento typical usage.
     */
    @Test
    public void testTypicalMemento() {
        final String state = UUID.randomUUID().toString();
        final Memento memento = new Memento(state);
        assertNotNull(memento);
        assertEquals(state, memento.getState());
        log.info(memento.toString());
    }

    /**
     * Unit Test to memento.
     */
    @Test
    public void testMemento() {
        final Memento memento = new Memento();
        assertNotNull(memento);
        log.info(memento.toString());
    }

    /**
     * Unit Test to memento.
     */
    @Test
    public void testMementoNull() {
        final Memento memento = new Memento(null);
        assertNotNull(memento);
        log.info(memento.toString());
    }

}
