
package patterns.command;

import coaching.context.ContextInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Command class from GOF Command Pattern.
 */





@Slf4j
public abstract class AbstractCommand implements CommandInterface {

    /** The context. */
    private final ContextInterface context = CommandContext.getInstance();

    /** The result. */
    protected ResultInterface result = null;

    /**
     * Execute.
     *
     * @return the result interface
     */
    public ResultInterface execute() {
        log.debug("{}.execute", this.getClass().getSimpleName());
        result = new Result(Result.PASS);
        return result;
    }

    /*
     * (non-Javadoc)
     * @see patterns.command.CommandInterface#execute(patterns.command.
     * ParametersInterface)
     */
    @Override
    public ResultInterface execute(final ParametersInterface commandParameters) {
        log.debug("{}.execute", this.getClass().getSimpleName());
        log.debug("context={}", context);
        commandParameters.setParameter("result", "pass");
        result = new Result(Result.PASS);
        return result;
    }

    /**
     * Undo.
     *
     * @return the result interface
     */
    public ResultInterface undo() {
        log.debug("{}.undo", this.getClass().getSimpleName());
        result = new Result(Result.FAIL);
        return result;
    }

    /*
     * (non-Javadoc)
     * @see patterns.command.CommandInterface#undo(patterns.command.
     * ParametersInterface)
     */
    @Override
    public ResultInterface undo(final ParametersInterface commandParameters) {
        log.debug("{}.undo", this.getClass().getSimpleName());
        commandParameters.setParameter("result", "pass");
        result = new Result(Result.FAIL);
        return result;
    }

    /*
     * (non-Javadoc)
     * @see patterns.command.AbstractCommand#result()
     */
    @Override
    public Boolean getResult() {
        return result.isPass();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [context=%s, result=%s]", this.getClass().getSimpleName(), context, result);
    }
}
