package patterns.worker;

/**
 * The Queue Interface.
 */
public interface QueueInterface {

	/**
	 * Put.
	 *
	 * @param object the object
	 */
	public QueueInterface put(Object object);

	/**
	 * Take.
	 */
	public Object take();

}
