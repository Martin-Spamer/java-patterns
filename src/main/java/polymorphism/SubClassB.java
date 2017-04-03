
package polymorphism;

/**
 * The Class SubClassB.
 */
class SubClassB extends SuperClass {

	/*
	 * (non-Javadoc)
	 * 
	 * @see polymorphism.SuperClass#doProcess()
	 */
	@Override
	public void doProcess() {
		log.info(this.getClass().getSimpleName());
	}
}