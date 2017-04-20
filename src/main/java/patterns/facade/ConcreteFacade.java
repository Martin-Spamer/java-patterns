package patterns.facade;

public final class ConcreteFacade implements FacadeInterface {

	private SubSystemOne subSystemOne;
	private SubSystemTwo subSystemTwo;
	private SubSystemThree subSystemThree;
	private ConcreteFacade concreteFacade;

	@Override
	public void operation() {
	}

	public void subSystemOneOperation() {
		new SubSystemOne().operation();
	}

	public void subSystemTwoOperation() {
		new SubSystemTwo().operation();
	}

	public void subSystemThreeOperation() {
		new SubSystemThree().operation();
	}

}
