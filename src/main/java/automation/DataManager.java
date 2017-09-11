
package automation;

/**
 * Data Manager Class.
 */
public class DataManager {

	/**
	 * return data with characteristic.
	 *
	 * authorised
	 * data
	 *
	 * @param characteristic the characteristic
	 * @return the data
	 */
	public static DataMock getData(final Characteristic characteristic) {
		return new DataMock();
	}

}
