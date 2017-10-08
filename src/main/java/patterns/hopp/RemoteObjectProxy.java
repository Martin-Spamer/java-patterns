


package patterns.hopp;

import org.slf4j.*;

/**
 * RemoteObjectProxy Class.
 */
class RemoteObjectProxy implements HoppInterface {

	private static final Logger LOG = LoggerFactory.getLogger(RemoteObjectProxy.class);
	private RemoteObject remoteObject;

	/**
	 * Remote method proxy.
	 */
	public void remoteMethodProxy() {
		LOG.info("%s.remoteMethodProxy()", this.getClass().getSimpleName());
		remoteObject.operation();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.hopp.HoppInterface#remoteMethod()
	 */
	@Override
	public void remoteMethod() {
		LOG.info("%s.remoteMethod()", this.getClass().getSimpleName());
		remoteObject.remoteMethod();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.hopp.HoppInterface#localMethod()
	 */
	@Override
	public void localMethod() {
		LOG.info("%s.localMethod()", this.getClass().getSimpleName());
		remoteObject.localMethod();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.hopp.HoppInterface#operation()
	 */
	@Override
	public void operation() {
		LOG.info("%s.operation()", this.getClass().getSimpleName());
		remoteObject.operation();
	}

}
