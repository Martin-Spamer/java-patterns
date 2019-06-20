
package patterns.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * RealSubject Class.
 */




/** The Constant 			log. */
@Slf4j
public final class RealSubject extends AbstractSubject {

    /*
     * (non-Javadoc)
     * @see patterns.gof.structural.proxy.Subject#request()
     */
    @Override
    public void request() {
        log.info("request");
    }

}
