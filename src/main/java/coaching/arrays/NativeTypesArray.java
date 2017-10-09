/**
 *  @title			NativeTypesArray.java
 *  @description	Example code of arrays of primitive types
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004 - 11:25:50
 **/

package coaching.arrays;

import org.slf4j.*;

/**
 * Example code of arrays of native/primitive types.
 **/
public class NativeTypesArray {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private static final int ARRAY_SIZE = 10;

	/**
	 * iterate the elements of an array for display.
	 */
	public void iterateArray() {

		// Declare a reference to an array of longs.
		long[] values;

		/**
		 * reference to an Allocation of space for an array of longs
		 */
		values = new long[ARRAY_SIZE];

		// fill in some value
		// arrays index from zero
		values[0] = 0L;

		for (int i = 1; i < ARRAY_SIZE; i++) {
			// assign a value to an element of array
			values[i] = i * 100;
			this.log.info(i + "=" + values[i]);
		}
	}

	/**
	 * Display matrix, two dimensional array by nested iteration.
	 */
	public void displayMatrix() {

		// declare a reference to an matric of longs
		long[][] matrix;

		/**
		 * reference to an Allocation of space for an array of longs
		 */
		matrix = new long[ARRAY_SIZE][ARRAY_SIZE];

		final StringBuffer stringBuffer = new StringBuffer();
		for (int x = 0; x < ARRAY_SIZE; x++) {
			for (int y = 0; y < ARRAY_SIZE; y++) {
				// * matrix
				matrix[x][y] = x * y;

				stringBuffer.append(matrix[x][y]);
				stringBuffer.append(",");
			}
			stringBuffer.append("\n");
		}

		this.log.info("{}", stringBuffer.toString());

	}

	/**
	 * Display.
	 */
	public void display() {
		/**
		 * array with static data initialisation.
		 */
		final long[][] vector = {
		        {
		                0, 1, 2
				}, {
				        3, 4, 5
				}, {
				        6, 7, 8
				}
		};

		final StringBuffer stringBuffer = new StringBuffer();
		for (int firstIndex = 0; firstIndex < vector.length; firstIndex++) {
			for (int secondIndex = 0; secondIndex < vector[firstIndex].length; secondIndex++) {
				vector[firstIndex][secondIndex] = Long.valueOf(firstIndex * secondIndex);
				stringBuffer.append(vector[firstIndex][secondIndex]);
				stringBuffer.append(",");
			}
			stringBuffer.append("\n");
		}
		this.log.info("{}", stringBuffer.toString());
	}

}
