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
	public void put(Object object);

	/**
	 * Take.
	 */
	public void take();

}
