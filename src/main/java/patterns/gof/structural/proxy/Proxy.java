
package patterns.gof.structural.proxy;

/**
 * The Proxy Class.
 */
class Proxy extends Subject {

	/** The my real subject. */
	public RealSubject myRealSubject;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
	}
}