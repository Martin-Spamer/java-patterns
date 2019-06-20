
package patterns.hopp;

import lombok.extern.slf4j.Slf4j;

/**
 * Half-Object Part-Protocol class.
 */




/** The Constant 			log. */
@Slf4j
public class LocalHopp implements HoppInterface {

    /** The remote object proxy. */
    public HoppInterface remoteObjectProxy = new RemoteObjectProxy();

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#localMethod()
     */
    @Override
    public void localMethod() {
        log.info("{}.localMethod()", this.getClass().getSimpleName());
        this.remoteObjectProxy.localMethod();
    }

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#remoteMethod()
     */
    @Override
    public void remoteMethod() {
        log.info("{}.remoteMethod()", this.getClass().getSimpleName());
        this.remoteObjectProxy.remoteMethod();
    }
}
