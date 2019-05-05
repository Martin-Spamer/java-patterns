
package patterns.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * Terminal Expression Class.
 */




@Slf4j
public class TerminalExpression extends AbstractExpression {

    /**
     * Instantiates a new terminal expression.
     */
    public TerminalExpression() {
        super(true);
    }

    /**
     * Instantiates a new terminal expression.
     *
     * @param result the result
     */
    public TerminalExpression(final boolean result) {
        super(result);
    }

}
