
package coaching.scripting;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Equation.
 */
public class Equation {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The manager. */
    private final ScriptEngineManager manager = new ScriptEngineManager();

    /** The engine. */
    private final ScriptEngine engine = manager.getEngineByName("js");

    /**
     * Solve.
     *
     * @param expression the expression
     * @return the integer
     * @throws Exception the exception
     */
    public Integer solve(final String expression) throws Exception {
        final Integer result = (Integer) engine.eval(expression);
        return result;
    }

}
