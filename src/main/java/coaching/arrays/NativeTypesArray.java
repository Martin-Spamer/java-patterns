
package coaching.arrays;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * Example code of arrays of native/primitive types. One of the major downsides
 * of arrays is their fixed size, hence ARRAY_SIZE.
 **/


@Slf4j
public class NativeTypesArray {

    /** ARRAY_SIZE constant. */
    private static final int ARRAY_SIZE = 10;

    /**
     * iterate the elements of an array for display.
     */
    public void iterateArray() {
        long[] values;
        values = new long[ARRAY_SIZE];
        values[0] = 0L;

        for (int i = 1; i < ARRAY_SIZE; i++) {
            // assign a value to an element of array
            values[i] = i * i;
            log.info("values[{}] = {}", i, values[i]);
        }
    }

    /**
     * Display matrix, two dimensional array by nested iteration.
     */
    public void displayEmptyMatrix() {
        final long[][] matrix = new long[ARRAY_SIZE][ARRAY_SIZE];

        final String deepToString = Arrays.deepToString(matrix);
        log.info("displayEmptyMatrix = {}", deepToString);

        final String content = initialiseMatrix(matrix);
        log.info("looping(matrix) = {}", content);
    }

    /**
     * Display.
     */
    public void displayMatrix() {
        final long[][] matrix = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

        final String deepToString = Arrays.deepToString(matrix);
        log.info("displayMatrix  = {}", deepToString);

        final String content = loopMatrix(matrix);
        log.info("looping(vector) = {}", content);
    }

    /**
     * Looping.
     *
     * @param matrix the vector
     * @return the string
     */
    private String initialiseMatrix(final long[][] matrix) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (int firstIndex = 0; firstIndex < matrix.length; firstIndex++) {
            stringBuffer.append('\n');
            for (int secondIndex = 0; secondIndex < matrix[firstIndex].length; secondIndex++) {
                matrix[firstIndex][secondIndex] = firstIndex * secondIndex;
                stringBuffer.append(matrix[firstIndex][secondIndex]);
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    /**
     * Looping.
     *
     * @param matrix the vector
     * @return the string
     */
    private String loopMatrix(final long[][] matrix) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (final long[] element : matrix) {
            stringBuffer.append('\n');
            for (final long element2 : element) {
                stringBuffer.append(element2);
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

}
