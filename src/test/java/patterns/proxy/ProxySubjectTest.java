
package patterns.proxy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Proxy Subject Test Class.
 */
public class ProxySubjectTest {

	/**
	 * Unit Test to request.
	 */
	@Test
	public void testRequest() {
		final SubjectProxy proxySubject = new SubjectProxy();
		assertNotNull("Value cannot be null", proxySubject);
		proxySubject.request();
	}
}
