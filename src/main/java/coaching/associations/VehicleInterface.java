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
	 * new driver
	 *
	 * @param driver the new
	 * 			driver
	 */
	void setDriver(Driver driver);

	/**
	 * driver.
	 *
	 * driver
	 *
	 * @return the driver
	 */
	Driver getDriver();

	/**
	 * Travel.
	 *
	 * destination
	 *
	 * @param destination the destination
	 */
	void travel(String destination);

}
