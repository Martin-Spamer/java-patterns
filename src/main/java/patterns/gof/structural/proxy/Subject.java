
package patterns.gof.structural.proxy;

/**
 * The Class Subject.
 */
abstract class Subject {

	/** The my client. */
	public ProxyTest myClient;

	/**
	 * Request.
	 */
	abstract public void request();
}