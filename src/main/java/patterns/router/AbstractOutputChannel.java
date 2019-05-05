
package patterns.router;

import lombok.extern.slf4j.Slf4j;

/**
 * An abstract OutputChannel class.
 */




@Slf4j
public abstract class AbstractOutputChannel implements OutputChannelInterface {

    /*
     * (non-Javadoc)
     * @see patterns.router.OutputChannelInterface#sendMessage(patterns.router.
     * Message)
     */
    @Override
    public void sendMessage(final Message message) {
        log.info("{}.sendMessage({})", this.getClass().getSimpleName(), message);
    }

}
