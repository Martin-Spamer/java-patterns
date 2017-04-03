/**
 * VehicleInterface.
 * Created on 06-Jul-2004
 */
package associations;

/**
 * The Interface Vehicle.
 */
public interface Vehicle {

	/**
	 * Sets the driver.
	 *
	 * @param driver the new driver
	 */
	void setDriver(Driver driver);

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	Driver getDriver();

	/**
	 * Travel.
	 *
	 * @param destination the destination
	 */
	void travel(String destination);

}
