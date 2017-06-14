
package patterns.observer;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The ObserverTest Class.
 */
public class ObserverTest {

	private static final Logger LOG = LoggerFactory.getLogger(ObserverTest.class);

	/**
	 * Unit Test to update.
	 */
	@Test
	public void testUpdate() {
		LOG.info("{}.testUpdate", this.getClass().getSimpleName());
		final Subject subject = new Subject();
		final Observer observer = new Observer();
		subject.attachObserver(observer);
		subject.setStatus(true);
		subject.detachObserver(observer);
	}
}
