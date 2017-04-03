
package patterns.ajp.system.worker;

/**
 * The Interface Queue.
 */
public interface Queue {

	/**
	 * Put.
	 *
	 * @param object the object
	 */
	public void put(Object object);

	/**
	 * Take.
	 */
	public void take();
}