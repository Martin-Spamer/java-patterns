package patterns.command;

@SuppressWarnings("serial")
public class MissingCommandException extends Exception {

	public MissingCommandException(String message) {
		super(message);
	}

}
