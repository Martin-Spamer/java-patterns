package patterns.facade;

class ConcreteFacade implements FacadeInterface {

	public SubSystemOne subSystemOne;
	public SubSystemTwo subSystemTwo;
	public SubSystemThree subSystemThree;
	public ConcreteFacade concreteFacade;

	public void operation() {
		// TODO method stub
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
