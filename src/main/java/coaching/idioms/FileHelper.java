
package coaching.idioms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * FileHelper class.
 */
public final class FileHelper {

    /**
     * Instantiates a new file helper.
     */
    private FileHelper() {
        throw new UnsupportedOperationException("Do not instantiate this class, use staticly.");
    }

    /**
     * Loads file into a string.
     *
     * @param filename the filename
     * @return the string
     * @throws FileNotFoundException the file not found exception
     */
    public static String getAsString(final String filename) throws FileNotFoundException {
        return new Scanner(new File(filename)).useDelimiter("\\A").next();
    }

}
