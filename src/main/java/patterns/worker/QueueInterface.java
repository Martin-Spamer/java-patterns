
package patterns.worker;

/**
 * The QueueInterface Interface.
 */
public interface QueueInterface {

	/**
	 * Put.
	 *
	 * @param object the object
	 * @return the queue interface
	 */
	public QueueInterface put(Object object);

	/**
	 * Take.
	 *
	 * @return the object
	 */
	public Object take();

}
