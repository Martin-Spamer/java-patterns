
package patterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Result of Command execution.
 */




@Slf4j
public final class Result implements ResultInterface {

    /** The Constant PASS. */
    public static final Boolean PASS = true;

    /** The Constant FAIL. */
    public static final Boolean FAIL = false;

    /** The value. */
    private Boolean value = false;

    /**
     * Instantiates a new result.
     */
    public Result() {
        value = PASS;
    }

    /**
     * Instantiates a new result.
     *
     * result
     *
     * @param result the result
     */
    public Result(final Boolean result) {
        value = result;
    }

    /*
     * (non-Javadoc)
     * @see
     * patterns.command.ResultInterface#result(patterns.command.ResultInterface)
     */
    @Override
    public boolean isPass() {
        return value;
    }

    /*
     * (non-Javadoc)
     * @see
     * patterns.command.ResultInterface#and(patterns.command.ResultInterface)
     */
    @Override
    public boolean and(final ResultInterface newResult) {
        value &= newResult.isPass();
        return value;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [result=%s]", this.getClass().getSimpleName(), value);
    }

}
