
package patterns.proxy;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Proxy Subject Test class.
 */
public final class ProxySubjectTest {

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
