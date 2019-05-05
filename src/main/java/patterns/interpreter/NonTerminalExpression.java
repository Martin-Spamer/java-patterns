
package patterns.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * Non Terminal Expression Class.
 */




@Slf4j
public class NonTerminalExpression extends AbstractExpression {

    /**
     * Instantiates a new non terminal expression.
     */
    public NonTerminalExpression() {
        super();
    }

    /**
     * Instantiates a new non terminal expression.
     *
     * @param result the result
     */
    public NonTerminalExpression(final boolean result) {
        super(result);
    }

}
