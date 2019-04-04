
package patterns.router;

import lombok.extern.slf4j.Slf4j;

/**
 * Route a Message, from the input channel to the output channel.
 */
@Slf4j
public final class Route implements InputChannelInterface, OutputChannelInterface {

    /** The output channel. */
    private OutputChannelInterface outputChannel = null;

    /** The input channel. */
    private InputChannelInterface inputChannel = null;

    /**
     * Instantiates a new route.
     *
     * @param outputChannel the output channel
     * @param inputChannel the input channel
     */
    public Route(final OutputChannelInterface outputChannel, final InputChannelInterface inputChannel) {
        super();
        this.outputChannel = outputChannel;
        this.inputChannel = inputChannel;
    }

    /*
     * (non-Javadoc)
     * @see patterns.router.OutputChannelInterface#sendMessage(patterns.router.
     * Message)
     */
    @Override
    public void sendMessage(final Message message) {
        log.info("sendMessage{}", message);
        this.outputChannel.sendMessage(message);
    }

    /*
     * (non-Javadoc)
     * @see patterns.router.InputChannelInterface#receiveMessage()
     */
    @Override
    public Message receiveMessage() {
        log.info("receiveMessage{}");
        return this.inputChannel.receiveMessage();
    }

}
