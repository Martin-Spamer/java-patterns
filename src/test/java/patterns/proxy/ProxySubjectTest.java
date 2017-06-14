
package patterns.proxy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The ProxySubjectTest Class.
 */
public class ProxySubjectTest {

	private static final Logger LOG = LoggerFactory.getLogger(ProxySubjectTest.class);

	/**
	 * Unit Test to request.
	 */
	@Test
	public void testRequest() {
		final SubjectProxy proxySubject = new SubjectProxy();
		assertNotNull(proxySubject);
		proxySubject.request();
	}

}
