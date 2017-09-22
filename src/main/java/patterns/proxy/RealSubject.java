
package patterns.proxy;

/**
 * RealSubject Class.
 */
class RealSubject extends Subject {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
		log.info("request");
	}

}
