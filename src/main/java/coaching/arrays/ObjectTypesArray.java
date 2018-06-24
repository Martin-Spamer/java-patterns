/**
 *  @title			ObjectTypesArray.java
 *  @description	Example code of arrays of objects.
 *  @author      	martin.spamer.
 *  @version		0.1 - first release.
 *	Created			23-Sep-2004 - 11:25:50
 **/

package coaching.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example code of arrays of objects.
 **/
public class ObjectTypesArray {

    /** The Constant ARRAY_SIZE. */
    private static final int ARRAY_SIZE = 10;

    /** provides logging. */
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * iterate the elements of an array for display.
     */
    public void iterateArray() {
        // Declare a reference to an array of longs.
        Long[] values;

        /*
         * initialise the space for an array of longs
         */
        values = new Long[ARRAY_SIZE];

        // fill in some value
        // arrays index from zero
        values[0] = 0L;

        for(int i = 1; i < ARRAY_SIZE; i++) {
            // assign a value to an element of array
            values[i] = (long) (i ^ i);
            this.log.info("{}){}", i, values[i]);
        }
    }

    /**
     * Display matrix, two dimensional array by nested iteration.
     */
    public void displayMatrix() {
        // declare a reference to an matrix of longs
        Long[][] matrix;

        /*
         * reference to an Allocation of space for an array of longs
         */
        matrix = new Long[ARRAY_SIZE][ARRAY_SIZE];

        this.log.info("{}", looping(matrix));

    }

    /**
     * Display.
     */
    public void display() {
        /*
         * array with static data.
         */
        final Long[][] vector = { { 0L, 1L, 2L }, { 3L, 4L, 5L }, { 6L, 7L, 8L } };

        this.log.info("{}", looping(vector));
    }

    /**
     * Looping.
     *
     * @param vector
     *            the vector
     * @return the string
     */
    private String looping(final Long[][] vector) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (int firstIndex = 0; firstIndex < vector.length; firstIndex++) {
            for (int secondIndex = 0; secondIndex < vector[firstIndex].length; secondIndex++) {
                vector[firstIndex][secondIndex] = (long) (firstIndex * secondIndex);
                stringBuffer.append(vector[firstIndex][secondIndex]);
                stringBuffer.append(',');
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
