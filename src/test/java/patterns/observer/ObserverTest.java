
package patterns.observer;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Observer Test class.
 */


/** The Constant 			log. */
@Slf4j
public final class ObserverTest {

    /**
     * Unit Test to update.
     */
    @Test
    public void testUpdate() {
        log.info("{}.testUpdate", this.getClass().getSimpleName());
        final Subject subject = new Subject();
        assertNotNull(subject);
        final Observer observer = new Observer();
        assertNotNull(observer);

        subject.attachObserver(observer);
        subject.setStatus(true);
        subject.detachObserver(observer);
    }
}
