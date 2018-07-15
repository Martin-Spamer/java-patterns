
package coaching.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example class of custom Exception handling.
 *
 * In general, exceptions should be handled as close to the cause as possible.
 */
public final class CustomExceptionHandling {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(CustomExceptionHandling.class);

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
     * Process that propagates the custom exception.
     *
     * @throws CustomException the custom exception
     */
    public void propagateException() throws CustomException {
        creationProcess();
        readProcess();
        updateProcess();
        deleteProcess();
    }

    /**
     * Process that catches the base CustomException.
     */
    public void catchBaseCustomException() {
        try {
            creationProcess();
            readProcess();
            updateProcess();
            deleteProcess();
        } catch (final CustomException e) {
            LOG.error(e.toString(), e);
        }
    }

    /**
     * Process that catch multiple exceptions.
     */
    public void catchMultiExceptions() {
        try {
            creationProcess();
            readProcess();
            updateProcess();
            deleteProcess();
        } catch (
                CustomCreationException |
                    CustomReadException |
                    CustomUpdateException |
                    CustomDeleteException e) {
            LOG.error(e.toString(), e);
        }
    }

    /**
     * Process that catches each type of Exception seperately.
     */
    public void catchEachException() {
        try {
            creationProcess();
            readProcess();
            updateProcess();
            deleteProcess();
        } catch (final CustomCreationException e) {
            LOG.error("Creation error", e);
        } catch (final CustomReadException e) {
            LOG.error("Read error", e);
        } catch (final CustomUpdateException e) {
            LOG.error("Update error", e);
        } catch (final CustomDeleteException e) {
            LOG.error("Delete error", e);
        }
    }

    /**
     * A process that catches with a nested catches.
     */
    public void nestedProcess() {
        try {
            creationProcess();
            try {
                readProcess();
                try {
                    updateProcess();
                    try {
                        deleteProcess();
                    } catch (final CustomException exception) {
                        LOG.error(exception.toString(), exception);
                    }
                } catch (final CustomException exception) {
                    LOG.error(exception.toString(), exception);
                }
            } catch (final CustomException exception) {
                LOG.error(exception.toString(), exception);
            }
        } catch (final CustomException exception) {
            LOG.error(exception.toString(), exception);
        }
    }

    /**
     * A process that will continue when an exception occurs.
     */
    public void failsafeProcess() {

        try {
            creationProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString(), exception);
        }

        try {
            readProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString(), exception);
        }

        try {
            updateProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString(), exception);
        }

        try {
            deleteProcess();
        } catch (final CustomException exception) {
            LOG.error(exception.toString(), exception);
        }
    }

    /**
     * A process that throws and propagates a specialist exception.
     *
     * @throws CustomCreationException
     *             the custom creation exception
     */
    public void creationProcess() throws CustomCreationException {
        throw new CustomCreationException();
    }

    /**
     * A process that throws and propagates a specialist exception.
     *
     * @throws CustomReadException
     *             the custom read exception
     */
    public void readProcess() throws CustomReadException {
        throw new CustomReadException();
    }

    /**
     * A process that throws and propagates a specialist exception.
     *
     * @throws CustomUpdateException
     *             the custom update exception
     */
    public void updateProcess() throws CustomUpdateException {
        throw new CustomUpdateException();
    }

    /**
     * A process that throws and propagates a specialist exception.
     *
     * @throws CustomDeleteException the custom delete exception
     */
    public void deleteProcess() throws CustomDeleteException {
        throw new CustomDeleteException();
    }

}
