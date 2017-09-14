
package patterns.hopp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RemoteObject Class.
 */
class RemoteObject implements HoppInterface {

	private static final Logger LOG = LoggerFactory.getLogger(RemoteObject.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.hopp.HoppInterface#remoteMethod()
	 */
	@Override
	public void remoteMethod() {
		LOG.info("%s.remoteMethod()", this.getClass().getSimpleName());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.hopp.HoppInterface#localMethod()
	 */
	@Override
	public void localMethod() {
		LOG.info("%s.localMethod()", this.getClass().getSimpleName());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.hopp.HoppInterface#operation()
	 */
	@Override
	public void operation() {
		LOG.info("%s.operation()", this.getClass().getSimpleName());
	}

}
