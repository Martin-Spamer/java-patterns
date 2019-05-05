
package patterns.state;

import lombok.extern.slf4j.Slf4j;

/**
 * The StateBob class.
 */




@Slf4j
class StateBob extends AbstractState {

    /*
     * (non-Javadoc)
     * @see patterns.gof.behavioural.state.State#handle()
     */
    @Override
    public void handle() {
        log.info("handle()");
    }

}
