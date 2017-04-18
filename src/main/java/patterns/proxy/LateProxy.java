package patterns.proxy;

/**
 * The Proxy for the Subject Class.
 */
class LateProxy extends Subject {

	private RealSubject realSubject;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
		if (this.realSubject == null) {
			this.realSubject = new RealSubject();
		}
		this.realSubject.request();
	}

}
