
package coaching.scripting;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * The Equation.
 */
public class Equation {

    /** The log. */

    /** The manager. */
    private final ScriptEngineManager manager = new ScriptEngineManager();

    /** The engine. */
    private final ScriptEngine engine = this.manager.getEngineByName("js");

    /**
     * Solve.
     *
     * @param expression the expression
     * @return the integer
     * @throws Exception the exception
     */
    public Integer solve(final String expression) throws Exception {
        final Integer result = (Integer) this.engine.eval(expression);
        return result;
    }

}
