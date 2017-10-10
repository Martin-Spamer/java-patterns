
package patterns.proxy;

/**
 * RealSubject Class.
 */
public class RealSubject extends Subject {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.proxy.Subject#request()
	 */
	@Override
	public void request() {
		this.log.info("request");
	}

}
