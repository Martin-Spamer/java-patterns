


package patterns.proxy;

/**
 * SubjectProxy Class.
 */
class SubjectProxy extends Subject {

	private final RealSubject realSubject = new RealSubject();

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