
package patterns.proxy;

/**
 * The Proxy for the Subject Class.
 */
class SubjectProxy extends Subject {

	private final RealSubject realSubject = new RealSubject();

	/**
	 * Instantiates a new proxy subject.
	 */
	public SubjectProxy() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
		realSubject.request();
	}
}