
package patterns.proxy;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Proxy Subject Test class.
 */


@Slf4j
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
