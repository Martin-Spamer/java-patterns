


package patterns.proxy;

/**
 * LateProxy Class.
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
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
