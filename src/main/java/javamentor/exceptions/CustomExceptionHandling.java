/*
 * ExceptionHandling.java
 *
 * Created on 20 October 2004, 11:11
 */

package javamentor.exceptions;

/**
 * ExceptionHandling Class.
 */
public class CustomExceptionHandling {
	/**
	 * a Custom Exception. In most cases this all that is needed to implement a
	 * custom exception class. In some cases additional constructors be be
	 * required.
	 */
	private class CustomException extends Exception {
	}

	/**
	 * CustomCreationException Class.
	 */
	private class CustomCreationException extends CustomException {
	}

	/**
	 * CustomReadException Class.
	 */
	private class CustomReadException extends CustomException {
	}

	/**
	 * CustomUpdateException Class.
	 */
	private class CustomUpdateException extends CustomException {
	}

	/**
	 * CustomDeleteException Class.
	 */
	private class CustomDeleteException extends CustomException {
	}

	/**
	 * A SubProcess Throws a specialist exception.
	 *
	 * custom exception
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
			exception.printStackTrace();
			throw new CustomException();
		}

		try {
			subProcessB();
		} catch (final CustomException exception) {
			exception.printStackTrace();
			throw new CustomException();
		}
		try {
			subProcessC();
		} catch (final CustomException exception) {
			exception.printStackTrace();
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
	public static void main(String[] args) {
		final CustomExceptionHandling instance = new CustomExceptionHandling();
		try {
			instance.process();
		} catch (final Exception exception) {
			System.out.println(exception.toString());
		}
	}
}
