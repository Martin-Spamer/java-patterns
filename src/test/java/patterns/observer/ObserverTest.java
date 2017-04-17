package patterns.observer;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void testUpdate() {
		final Subject subject = new Subject();
		final Observer observer = new Observer();
		subject.attach(observer);
		subject.setStatus(true);
	}

}
