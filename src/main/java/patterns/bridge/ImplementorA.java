package patterns.bridge;

public class ImplementorA extends Implementor {

	@Override
	public void operation() {
		this.log.info("{}", this.getClass().getSimpleName());
	}

}
