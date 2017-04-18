package patterns.proxy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProxySubjectTest {

	@Test
	public void testRequest() {
		final SubjectProxy proxySubject = new SubjectProxy();
		assertNotNull(proxySubject);
		proxySubject.request();
	}

}
