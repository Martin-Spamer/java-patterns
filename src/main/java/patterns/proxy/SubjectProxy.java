

package patterns.proxy;

/**
 * SubjectProxy Class.
 */
public final class SubjectProxy extends AbstractSubject {

	private final RealSubject realSubject = new RealSubject();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
		this.realSubject.request();
	}
}
