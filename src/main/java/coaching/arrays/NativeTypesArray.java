
package coaching.arrays;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * Example code of arrays of native/primitive types.
 * One of the major downsides of arrays is their fixed size,
 * hence the need for an ARRAY_SIZE constant.
 **/


@Slf4j
public class NativeTypesArray {

    /** The Constant 			ARRAY_SIZE. */
    private static final int ARRAY_SIZE = 10;

    /**
     * iterate the elements of an array for display.
     *
     * @return the long[]
     */
    public static long[] initialiseArray() {
        long[] values;
        values = new long[ARRAY_SIZE];
        values[0] = 0L;

        for (int i = 1; i < ARRAY_SIZE; i++) {
            // assign a value to an element of array
            values[i] = i * i;
            log.info("values[{}] = {}", i, values[i]);
        }
        return values;
    }

    /**
     * Array as string.
     *
     * @return the string
     */
    public static String arrayAsString() {
        long[] initialiseArray = initialiseArray();
        return arrayAsString(initialiseArray);
    }

    /**
     * Array as string.
     *
     * @param initialiseArray the initialise array
     * @return the string
     */
    private static String arrayAsString(final long[] initialiseArray) {
        return null;
    }

    /**
     * Looping.
     *
     * @param matrix the vector
     * @return the string
     */
    private static String matrixAsString(final long[][] matrix) {
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
     * Display matrix, two dimensional array by nested iteration.
     */
    public static void displayMatrix() {
        long[][] matrix = new long[ARRAY_SIZE][ARRAY_SIZE];

        final String deepToString = Arrays.deepToString(matrix);
        log.info("displayEmptyMatrix = {}", deepToString);

        log.info("looping(matrix) = {}", Arrays.toString(matrix));
    }

    /**
     * Looping.
     *
     * @param matrix the matrix
     * @return the string
     */
    private static String looping(final long[][] matrix) {
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

    /**
     * To hex.
     *
     * @param bytes the bytes
     * @return the string
     */
    public static String toHex(final byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            hexChars[2 * i] = "0123456789abcdef".charAt((bytes[i] & 0xf0) >> 4);
            hexChars[2 * i + 1] = "0123456789abcdef".charAt(bytes[i] & 0x0f);
        }
        return new String(hexChars);
    }

}
