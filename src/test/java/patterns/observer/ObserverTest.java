package patterns.observer;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * Observer Test Class.
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
		assertNotNull(subject);
		final Observer observer = new Observer();
		assertNotNull(observer);

		subject.attachObserver(observer);
		subject.setStatus(true);
		subject.detachObserver(observer);
	}
}
