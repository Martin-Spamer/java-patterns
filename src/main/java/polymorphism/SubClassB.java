package polymorphism;

class SubClassB extends SuperClass {
	@Override
	public void doProcess() {
		log.info(this.getClass().getSimpleName());
	}
}