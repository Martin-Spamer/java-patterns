package polymorphism;

/**
 * a class to provide a none integer switch using the command patterns
 * [GOF:233].
 *
 * @version v0.01
 */
public final class ConcreteSwitch extends AbstractSwitch<String, Object>  {

	protected final class Pass {
	}

	protected final class Fail {
	}
	
	/**
	 * Creates a new instance of Switch.
	 */
	public ConcreteSwitch() {
		add("Pass",new Pass());
		add("CaseB",new Fail());
		
	}
}
