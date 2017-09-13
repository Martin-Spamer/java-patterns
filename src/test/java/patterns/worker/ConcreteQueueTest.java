package patterns.worker;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConcreteQueueTest {

	@Test
	public void testConcreteQueue() {
		final ConcreteQueue concreteQueue = new ConcreteQueue();
		assertNotNull(concreteQueue);
		concreteQueue.put(new String());
		final Object take = concreteQueue.take();
		assertNotNull(take);
	}

}
