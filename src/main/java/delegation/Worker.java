
package delegation;

/**
 * The Worker Class.
 */
class Worker implements ProcessInterface {

	/*
	 * (non-Javadoc)
	 *
	 * @see delegation.ProcessInterface#doProcess()
	 */
	public Worker doProcess() {
		System.out.println("do work");
		return this;
	}
}
