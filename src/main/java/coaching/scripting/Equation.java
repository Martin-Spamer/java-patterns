
package coaching.scripting;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Equation {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    private final ScriptEngineManager manager = new ScriptEngineManager();
    private final ScriptEngine engine = this.manager.getEngineByName("js");

    public Integer solve(final String expression) throws Exception {
        Integer result = (Integer) this.engine.eval(expression);
        return result;
    }

}
