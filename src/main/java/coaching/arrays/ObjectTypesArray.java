
package coaching.arrays;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * Example code of arrays of objects.
 * One of the major downsides of arrays is their fixed size,
 * hence the need for an ARRAY_SIZE constant.
 **/

/** The Constant 			log. */
@Slf4j
public class ObjectTypesArray {

    /** The Constant 			ARRAY_SIZE. */
    private static final int ARRAY_SIZE = 10;

    /**
     * iterate the elements of an array for display.
     *
     * @return the long[]
     */
    public static Long[] initialiseArray() {
        Long[] values;
        values = new Long[ARRAY_SIZE];
        values[0] = 0L;

        for (int i = 1; i < ARRAY_SIZE; i++) {
            // assign a value to an element of array using autoboxing.
            // Equivalent to new Long(i*i);
            values[i] = (long) (i * i);
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
        Long[] initialiseArray = initialiseArray();
        return arrayAsString(initialiseArray);
    }

    /**
     * Array as string.
     *
     * @param initialiseArray the initialise array
     * @return the string
     */
    private static String arrayAsString(final Long[] initialiseArray) {
        return null;
    }

    /**
     * Matrix as string.
     *
     * @param matrix the matrix
     * @return the string
     */
    private static String matrixAsString(final Long[][] matrix) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (int firstIndex = 0; firstIndex < matrix.length; firstIndex++) {
            stringBuffer.append('\n');
            for (int secondIndex = 0; secondIndex < matrix[firstIndex].length; secondIndex++) {
                matrix[firstIndex][secondIndex] = (long) firstIndex * secondIndex;
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
        Long[][] matrix = new Long[ARRAY_SIZE][ARRAY_SIZE];

        final String deepToString = Arrays.deepToString(matrix);
        log.info("displayEmptyMatrix = {}", deepToString);

        log.info(Arrays.toString(matrix));
    }

    /**
     * Looping.
     *
     * @param matrix the vector
     * @return the string
     */
    private static String looping(final Long[][] matrix) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (int firstIndex = 0; firstIndex < matrix.length; firstIndex++) {
            stringBuffer.append('\n');
            for (int secondIndex = 0; secondIndex < matrix[firstIndex].length; secondIndex++) {
                matrix[firstIndex][secondIndex] = (long) (firstIndex * secondIndex);
                stringBuffer.append(matrix[firstIndex][secondIndex]);
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
    public static String toHex(final Byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            hexChars[2 * i] = "0123456789abcdef".charAt((bytes[i] & 0xf0) >> 4);
            hexChars[2 * i + 1] = "0123456789abcdef".charAt(bytes[i] & 0x0f);
        }
        return new String(hexChars);
    }

}
