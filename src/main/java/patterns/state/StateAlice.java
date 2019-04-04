
package patterns.state;

import lombok.extern.slf4j.Slf4j;

/**
 * The StateAlice class.
 */
@Slf4j
class StateAlice extends AbstractState {

    /*
     * (non-Javadoc)
     * @see patterns.gof.behavioural.state.State#handle()
     */
    @Override
    public void handle() {
        log.info("handle()");
    }

}
