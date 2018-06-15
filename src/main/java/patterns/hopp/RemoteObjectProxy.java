
package patterns.hopp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RemoteObjectProxy Class.
 */
class RemoteObjectProxy implements HoppInterface {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(RemoteObjectProxy.class);
    
    /** The remote object. */
    private RemoteObject remoteObject;

    /**
     * Remote method proxy.
     */
    public void remoteMethodProxy() {
        LOG.info("%s.remoteMethodProxy()", this.getClass().getSimpleName());
        this.remoteObject.operation();
    }

    /*
     * (non-Javadoc)
     *
     * @see patterns.hopp.HoppInterface#remoteMethod()
     */
    @Override
    public void remoteMethod() {
        LOG.info("%s.remoteMethod()", this.getClass().getSimpleName());
        this.remoteObject.remoteMethod();
    }

    /*
     * (non-Javadoc)
     *
     * @see patterns.hopp.HoppInterface#localMethod()
     */
    @Override
    public void localMethod() {
        LOG.info("%s.localMethod()", this.getClass().getSimpleName());
        this.remoteObject.localMethod();
    }

    /*
     * (non-Javadoc)
     *
     * @see patterns.hopp.HoppInterface#operation()
     */
    @Override
    public void operation() {
        LOG.info("%s.operation()", this.getClass().getSimpleName());
        this.remoteObject.operation();
    }

}
