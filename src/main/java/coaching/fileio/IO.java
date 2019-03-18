
package coaching.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class IO {

    public static String from(final String filename) throws IOException {
        FileReader in = new FileReader(filename);
        return from(in);
    }

    public static String from(final FileReader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        return from(reader);
    }

    public static String from(final BufferedReader reader) throws IOException {
        String line = null;
        StringBuffer fileContents = new StringBuffer();

        try {
            while ((line = reader.readLine()) != null) {
                fileContents.append(line);
                fileContents.append(System.lineSeparator());
            }
            return fileContents.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static String from(final InputStream stream) throws IOException {
        Reader reader = null;
        StringBuffer fileContents = new StringBuffer();

        try {
            reader = new BufferedReader(new InputStreamReader(stream));
            char[] buffer = new char[8192];
            int read;
            while ((read = reader.read(buffer, 0, buffer.length)) > 0) {
                fileContents.append(buffer, 0, read);
            }
            return fileContents.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }

        }
    }

    public static String scanLinesFrom(final String pathname) throws IOException {
        File file = new File(pathname);
        return scanLinesFrom(file);
    }

    public static String scanLinesFrom(final File file) throws FileNotFoundException {
        StringBuilder fileContents = new StringBuilder((int) file.length());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine());
                fileContents.append(System.lineSeparator());
            }
            return fileContents.toString();
        }
    }

    public static String scan(final String filename) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(filename);
            return scanner.useDelimiter("\\Z").next();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static String load(final String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        final String EoL = System.getProperty("line.separator");
        Charset charset = Charset.defaultCharset();
        Path path = Paths.get(filename);
        List<String> lines;
        lines = Files.readAllLines(path, charset);
        for (String line : lines) {
            sb.append(line).append(EoL);
        }
        return sb.toString();
    }

}
