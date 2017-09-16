package patterns.proxy;

/**
 * SubjectProxy Class.
 */
class SubjectProxy extends Subject {

	private final RealSubject realSubject = new RealSubject();

	/**
	 * Instantiates a new subject proxy.
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