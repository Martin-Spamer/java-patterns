
package coaching.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ExceptionHandling Class.
 */
public class CustomExceptionHandling {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandling.class);

    /**
     * a Custom Exception. In most cases this all that is needed to implement a
     * custom exception class. In some cases additional constructors be be
     * required.
     */
    public class CustomException extends Exception {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;
    }

    /**
     * CustomCreationException Class.
     */
    public class CustomCreationException extends CustomException {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;
    }

    /**
     * CustomReadException Class.
     */
    public class CustomReadException extends CustomException {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;
    }

    /**
     * CustomUpdateException Class.
     */
    public class CustomUpdateException extends CustomException {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;
    }

    /**
     * CustomDeleteException Class.
     */
    public class CustomDeleteException extends CustomException {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;
    }

    /**
     * A SubProcess Throws a specialist exception.
     *
     * @throws CustomCreationException
     *             the custom creation exception
     */
    public void creationProcess() throws CustomCreationException {
        throw new CustomCreationException();
    }

    /**
     * A SubProcess Throws a specialist exception.
     *
     * @throws CustomReadException
     *             the custom read exception
     */
    public void readProcess() throws CustomReadException {
        throw new CustomReadException();
    }

    /**
     * A SubProcess Throws a specialist exception.
     *
     * @throws CustomUpdateException
     *             the custom update exception
     */
    public void updateProcess() throws CustomUpdateException {
        throw new CustomUpdateException();
    }

    /**
     * sub processes, and replaces them with a simple generalised exception.
     *
     */
    public void process() {
        try {
            creationProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString());
        }

        try {
            readProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString());
        }

        try {
            updateProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString());
        }
    }
}
