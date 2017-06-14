
package patterns.worker;

/**
 * QueueInterface Interface.
 */
public interface QueueInterface {

	/**
	 * Put.
	 *
	 * object
	 * queue interface
	 *
	 * @param object the object
	 * @return the queue interface
	 */
	public QueueInterface put(Object object);

	/**
	 * Take.
	 *
	 * object
	 *
	 * @return the object
	 */
	public Object take();

}
