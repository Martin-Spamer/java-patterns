/**
 *  @title       PrimativeArray.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      23-Sep-2004
 *
 **/

package javamentor.types;

/**
 * Example code of arrays of primitive types.
 * @author martin.spamer
 * @version 0.1 - 11:25:50
 **/
public class ObjectTypesArray {

	/**
	 * Main program entry point.
	 */
	public void display() {
		final int ARRAY_SIZE = 10;

		// Declare a reference to an array of longs.
		Long[] values;

		/**
		 * reference to an Allocation of space for an array of longs
		 */
		values = new Long[ARRAY_SIZE];

		// fill in some value
		// arrays index from zero
		values[0] = 0l;

		for (int i = 1; i < ARRAY_SIZE; i++) {
			// assign a value to an element of array
			values[i] = new Long(i * 100);
			System.out.println(i + "=" + values[i]);
		}

		// declare a reference to an matric of longs
		Long[][] matrix;

		/**
		 * reference to an Allocation of space for an array of longs
		 */
		matrix = new Long[ARRAY_SIZE][ARRAY_SIZE];

		for (int x = 0; x < ARRAY_SIZE; x++) {
			for (int y = 0; y < ARRAY_SIZE; y++) {
				// * matrix
				matrix[x][y] = new Long(x * y);
				System.out.print(matrix[x][y] + ",");
			}
			System.out.print("\n");
		}

		/**
		 * array with static data
		 */
		final Long[][] vector = new Long[3][3];
		for (int firstIndex = 0; firstIndex < 3; firstIndex++) {
			for (int secondIndex = 0; secondIndex < 3; secondIndex++) {
				vector[firstIndex][secondIndex] = new Long(firstIndex * secondIndex);
				System.out.print(vector[firstIndex][secondIndex]);
			}
			System.out.print("\n");
		}
	}

	/**
	 * main method.
	 *
	 * arguments
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		final ObjectTypesArray types = new ObjectTypesArray();
		types.display();
	}

}
