
package coaching.fileio;

import java.io.File;

import lombok.extern.slf4j.Slf4j;

/**
 * CurrentWorkingDirectory Class.
 */



@Slf4j
public final class CurrentWorkingDirectory {

    /**
     * Instantiates a new current working directory.
     */
    public CurrentWorkingDirectory() {
        mark(this);
    }

    /**
     * Mark.
     *
     * @param that the that
     * @return the string
     */
    private String mark(final Object that) {
        String absolutePath = null;
        try {
            final String className = that.getClass().getSimpleName();
            final String fileName = String.format("./target/%s.CurrentWorkingDirectory", className);
            final File file = new File(fileName);
            try {
                file.createNewFile();
                absolutePath = file.getAbsolutePath();
                log.info(absolutePath);
            } catch (final Exception e) {
                log.error(e.getLocalizedMessage(), e);
            }
        } catch (final Exception e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return absolutePath;
    }
}
