
package patterns.gof.structural.proxy;

/**
 * The Subject Class.
 */
abstract class Subject {

	/** The my client. */
	public ProxyTest myClient;

	/**
	 * Request.
	 */
	abstract public void request();
}