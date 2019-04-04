
package patterns.router;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Input Channel class.
 */
@Slf4j
public abstract class AbstractInputChannel implements InputChannelInterface {

    /*
     * (non-Javadoc)
     * @see patterns.router.InputChannelInterface#receiveMessage()
     */
    @Override
    public Message receiveMessage() {
        log.info("{}.receiveMessage()", this.getClass().getSimpleName());
        return new Message();
    }

}
