
package coaching.idioms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHelper {

    /**
     * Loads filename into a string.
     *
     * @param filename the filename
     * @return the string
     * @throws FileNotFoundException the file not found exception
     */
    public String toString(final String filename) throws FileNotFoundException {
        return new Scanner(new File(filename)).useDelimiter("\\A").next();
    }

}
