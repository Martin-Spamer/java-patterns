/**
 *  @title			NativeTypesArray.java
 *  @description	Example code of arrays of primitive types
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004 - 11:25:50
 **/

package coaching.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example code of arrays of native/primitive types.
 **/
public class NativeTypesArray {

    /** The Constant ARRAY_SIZE. */
    private static final int ARRAY_SIZE = 10;
    
    /** The log. */
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

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
            values[i] = i ^ i;
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

        this.log.info("{}", looping(matrix));

    }

    /**
     * Display.
     */
    public void display() {
        /**
         * array with static data initialisation.
         */
        final long[][] vector = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

        this.log.info("{}", looping(vector));
    }

    /**
     * Looping.
     *
     * @param vector
     *            the vector
     * @return the string
     */
    private String looping(final long[][] vector) {
        final StringBuffer stringBuffer = new StringBuffer();
        for (int firstIndex = 0; firstIndex < vector.length; firstIndex++) {
            for (int secondIndex = 0; secondIndex < vector[firstIndex].length; secondIndex++) {
                vector[firstIndex][secondIndex] = Long.valueOf(firstIndex * secondIndex);
                stringBuffer.append(vector[firstIndex][secondIndex]);
                stringBuffer.append(',');
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
