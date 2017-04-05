
package polymorphism;

/**
 * The CommandB Class.
 */
class CommandB extends AbstractCommand {

	/*
	 * (non-Javadoc)
	 *
	 * @see polymorphism.SuperClass#doProcess()
	 */
	@Override
	public boolean doProcess() {
		log.info(this.getClass().getSimpleName());
		return true;
	}
}