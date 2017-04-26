package patterns.memento;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MementoTest {

	private static final Logger LOG = LoggerFactory.getLogger(MementoTest.class);

	@Test
	public void testMemento() {
		final Memento memento = new Memento(null);
		assertNotNull(memento);
		LOG.info("{}", memento);
	}

}
