
package patterns.hopp;

import lombok.extern.slf4j.Slf4j;

/**
 * RemoteObjectProxy Class.
 */




/** The Constant 			log. */
@Slf4j
public class RemoteObjectProxy implements HoppInterface {

    /** The remote object. */
    private final HoppInterface remoteObject = new RemoteObject();

    /**
     * Remote method proxy.
     */
    public void remoteMethodProxy() {
        log.info("{}.remoteMethodProxy()", this.getClass().getSimpleName());
        this.remoteObject.remoteMethod();
    }

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#remoteMethod()
     */
    @Override
    public void remoteMethod() {
        log.info("{}.remoteMethod()", this.getClass().getSimpleName());
        this.remoteObject.remoteMethod();
    }

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#localMethod()
     */
    @Override
    public void localMethod() {
        log.info("{}.localMethod()", this.getClass().getSimpleName());
        this.remoteObject.localMethod();
    }

}
