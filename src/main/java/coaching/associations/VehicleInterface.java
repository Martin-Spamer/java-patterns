/**
 * VehicleInterface.
 * Created on 06-Jul-2004
 */
package coaching.associations;

/**
 * VehicleInterface Interface.
 */
public interface VehicleInterface {

	/**
	 * driver.
	 *
	 * @param driver the new
	 * 			driver
	 */
	public void setDriver(Driver driver);

	/**
	 * driver.
	 *
	 * @return the driver
	 */
	public Driver getDriver();

	/**
	 * Travel destination.
	 *
	 * @param destination the destination
	 */
	public void travel(String destination);

}
