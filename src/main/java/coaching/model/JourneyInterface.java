


package coaching.model;

/**
 * Journey Interface.
 */
public interface JourneyInterface {

	/**
	 * set the destination of the journey.
	 *
	 * @param destination the new
	 *            destination
	 * @return this as fluent interface.
	 */
	public JourneyInterface setDestination(String destination);

	/**
	 * get the destination of the journey.
	 *
	 * @return the destination
	 */
	public String getDestination();

}
