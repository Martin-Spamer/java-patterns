package polymorphism;

class SubClassA extends SuperClass {
	@Override
	public void doProcess() {
		log.info(this.getClass().getSimpleName());
	}
}
