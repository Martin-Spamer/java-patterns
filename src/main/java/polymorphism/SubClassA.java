
package polymorphism;

/**
 * The Class SubClassA.
 */
class SubClassA extends SuperClass {

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
