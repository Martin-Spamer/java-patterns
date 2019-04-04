
package patterns.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * An abstract Expression Class.
 */
@Slf4j
public abstract class AbstractExpression {

    /** The result. */
    private boolean result;

    /**
     * Instantiates a new abstract expression.
     */
    public AbstractExpression() {
        super();
    }

    /**
     * Instantiates a new abstract expression.
     *
     * @param result the result
     */
    public AbstractExpression(final boolean result) {
        super();
        this.result = result;
    }

    /**
     * Interpret.
     *
     * @param context the context
     * @return true, if successful, otherwise false., otherwise false.
     */
    public boolean interpret(final Context context) {
        return result;
    }

}
