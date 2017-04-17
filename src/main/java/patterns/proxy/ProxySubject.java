package patterns.proxy;

/**
 * The Proxy for the Subject Class.
 */
class ProxySubject extends Subject {

	public RealSubject myRealSubject;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
		this.myRealSubject.request();
	}
}