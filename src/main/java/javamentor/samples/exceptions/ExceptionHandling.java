/*
 * ExceptionHandling.java
 *
 * Created on 20 October 2004, 11:11
 */

package javamentor.samples.exceptions;

/**
 * The ExceptionHandling Class.
 */
public class ExceptionHandling {
	/**
	 * a Custom Exception. In most cases this all that is needed to implement a
	 * custom exception class. In some cases additional constructors be be
	 * required.
	 */
	private class CustomException extends Exception {
	}

	private class CustomCreationException extends CustomException {
	}

	private class CustomReadException extends CustomException {
	}

	private class CustomUpdateException extends CustomException {
	}

	private class CustomDeleteException extends CustomException {
	}

	/**
	 * A SubProcess Throws a specialist exception
	 */
	public void subProcessA() throws CustomException {
		throw new CustomCreationException();
	}

	/**
	 * A SubProcess Throws a specialist exception
	 */
	public void subProcessB() throws CustomException {
		throw new CustomReadException();
	}

	/**
	 * A SubProcess Throws a specialist exception
	 */
	public void subProcessC() throws CustomException {
		throw new CustomUpdateException();
	}

	/**
	 * A Main Process catches the specialist exceptions from the sub processes,
	 * and replaces them with a simple generalised exception.
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
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		final ExceptionHandling instance = new ExceptionHandling();
		try {
			instance.process();
		} catch (final Exception exception) {
			System.out.println(exception.toString());
		}
	}
}
