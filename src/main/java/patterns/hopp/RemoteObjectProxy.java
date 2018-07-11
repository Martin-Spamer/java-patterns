
package patterns.hopp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RemoteObjectProxy Class.
 */
class RemoteObjectProxy implements HoppInterface {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(RemoteObjectProxy.class);

    /** The remote object. */
    private final HoppInterface remoteObject = new RemoteObject();

    /**
     * Remote method proxy.
     */
    public void remoteMethodProxy() {
        LOG.info("{}.remoteMethodProxy()", this.getClass().getSimpleName());
        remoteObject.remoteMethod();
    }

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#remoteMethod()
     */
    @Override
    public void remoteMethod() {
        LOG.info("{}.remoteMethod()", this.getClass().getSimpleName());
        remoteObject.remoteMethod();
    }

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#localMethod()
     */
    @Override
    public void localMethod() {
        LOG.info("{}.localMethod()", this.getClass().getSimpleName());
        remoteObject.localMethod();
    }

}
