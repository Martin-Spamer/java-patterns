
package patterns.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * LateProxy Class.
 */
@Slf4j
public final class LateProxy extends AbstractSubject {

    /** The real subject. */
    private RealSubject realSubject;

    /*
     * (non-Javadoc)
     * @see patterns.gof.structural.proxy.Subject#request()
     */
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }

}
