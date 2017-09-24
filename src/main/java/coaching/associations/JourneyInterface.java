

package coaching.associations;

/**
 * Journey Interface.
 */
public interface JourneyInterface {

	/**
	 * set the destination of the journey.
	 *
	 * @param destination the new
	 *            destination
	 * @return the journey interface
	 */
	public JourneyInterface setDestination(String destination);

	/**
	 * get the destination of the journey.
	 *
	 * @return the destination
	 */
	public String getDestination();

}
