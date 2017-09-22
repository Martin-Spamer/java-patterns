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
	public class CustomException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomCreationException Class.
	 */
	public class CustomCreationException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomReadException Class.
	 */
	public class CustomReadException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomUpdateException Class.
	 */
	public class CustomUpdateException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * CustomDeleteException Class.
	 */
	public class CustomDeleteException extends CustomException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 *
	 * @throws CustomCreationException the custom creation exception
	 */
	public void subProcessA() throws CustomCreationException {
		throw new CustomCreationException();
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 * 
	 * custom exception
	 *
	 * @throws CustomReadException the custom read exception
	 */
	public void subProcessB() throws CustomReadException {
		throw new CustomReadException();
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 * 
	 * custom exception
	 *
	 * @throws CustomUpdateException the custom update exception
	 */
	public void subProcessC() throws CustomUpdateException {
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
		}

		try {
			subProcessB();
		} catch (final CustomException exception) {
			LOG.error("{}", exception.toString());
		}
		try {
			subProcessC();
		} catch (final CustomException exception) {
			LOG.error("{}", exception.toString());
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
