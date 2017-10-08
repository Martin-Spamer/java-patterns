/**
 *  @title			ObjectTypesArray.java
 *  @description	Example code of arrays of objects.
 *  @author      	martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004 - 11:25:50
 **/

package coaching.arrays;

import org.slf4j.*;

/**
 * Example code of arrays of objects.
 **/
public class ObjectTypesArray {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private static final int ARRAY_SIZE = 10;

	/**
	 * iterate the elements of an array for display.
	 */
	public void iterateArray() {
		// Declare a reference to an array of longs.
		Long[] values;

		/**
		 * initialise the space for an array of longs
		 */
		values = new Long[ARRAY_SIZE];

		// fill in some value
		// arrays index from zero
		values[0] = 0L;

		for (int i = 1; i < ARRAY_SIZE; i++) {
			// assign a value to an element of array
			values[i] = Long.valueOf(i * 100);
			this.log.info("{}){}", i, values[i]);
		}
	}

	/**
	 * Display matrix, two dimensional array by nested iteration.
	 */
	public void displayMatrix() {
		// declare a reference to an matrix of longs
		Long[][] matrix;

		/**
		 * reference to an Allocation of space for an array of longs
		 */
		matrix = new Long[ARRAY_SIZE][ARRAY_SIZE];

		final StringBuffer stringBuffer = new StringBuffer();
		for (int x = 0; x < ARRAY_SIZE; x++) {
			for (int y = 0; y < ARRAY_SIZE; y++) {
				// * matrix
				matrix[x][y] = Long.valueOf(x * y);

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
		 * array with static data
		 */
		final Long[][] vector = {
		        {
		                0L, 1L, 2L
				}, {
				        3L, 4L, 5L
				}, {
				        6L, 7L, 8L
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
