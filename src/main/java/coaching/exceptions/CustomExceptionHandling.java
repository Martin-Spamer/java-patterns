/*
 * ExceptionHandling.java
 *
 * Created on 20 October 2004, 11:11
 */

package coaching.exceptions;

import org.slf4j.*;

/**
 * ExceptionHandling Class.
 */
public class CustomExceptionHandling {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandling.class);

	/**
	 * a Custom Exception. In most cases this all that is needed to implement a
	 * custom exception class. In some cases additional constructors be be
	 * required.
	 */
	private class CustomException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomCreationException Class.
	 */
	private class CustomCreationException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomReadException Class.
	 */
	private class CustomReadException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomUpdateException Class.
	 */
	private class CustomUpdateException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomDeleteException Class.
	 */
	private class CustomDeleteException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 *
	 * @throws CustomException the custom exception
	 */
	public void subProcessA() throws CustomException {
		throw new CustomCreationException();
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 *
	 * custom exception
	 *
	 * @throws CustomException the custom exception
	 */
	public void subProcessB() throws CustomException {
		throw new CustomReadException();
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 *
	 * custom exception
	 *
	 * @throws CustomException the custom exception
	 */
	public void subProcessC() throws CustomException {
		throw new CustomUpdateException();
	}

	/**
	 * sub processes,
	 * and replaces them with a simple generalised exception.
	 *
	 * custom exception
	 *
	 * @throws CustomException the custom exception
	 */
	public void process() throws CustomException {
		try {
			subProcessA();
		} catch (final CustomException exception) {
			LOG.error("{}", exception.toString());
			throw new CustomException();
		}

		try {
			subProcessB();
		} catch (final CustomException exception) {
			LOG.error("{}", exception.toString());
			throw new CustomException();
		}
		try {
			subProcessC();
		} catch (final CustomException exception) {
			LOG.error("{}", exception.toString());
			throw new CustomException();
		}
	}

	/**
	 * main method.
	 *
	 * command line arguments
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final CustomExceptionHandling instance = new CustomExceptionHandling();
		try {
			instance.process();
		} catch (final Exception exception) {
			CustomExceptionHandling.LOG.info(exception.toString());
		}
	}
}
