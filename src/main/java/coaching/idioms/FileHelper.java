
package coaching.idioms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class FileHelper {

    private FileHelper() {
        throw new UnsupportedOperationException(
                "Do not instantiate this class, use staticly.");
    }

    /**
     * Loads filename into a string.
     *
     * @param filename the filename
     * @return the string
     * @throws FileNotFoundException the file not found exception
     */
    public static String getAsString(final String filename)
            throws FileNotFoundException {
        final File file = new File(filename);
        return new Scanner(file).useDelimiter("\\A").next();
    }

}
