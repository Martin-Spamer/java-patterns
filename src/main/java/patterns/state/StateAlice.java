
package patterns.state;

/**
 * StateA Class.
 */
class StateAlice extends AbstractState {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.state.State#handle()
	 */
	@Override
	public void handle() {
		log.info("handle()");
	}

}
