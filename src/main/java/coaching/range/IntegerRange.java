
package coaching.range;

/**
 * The Class IntegerRange.
 */
public class IntegerRange {

    /** The start. */
    private final Integer start;
    
    /** The end. */
    private final Integer end;
    
    /** The step. */
    private final Integer step;

    /**
     * Factory method for range of start number to end number in steps of one.
     *
     * @param start the start
     * @param end the end
     * @return the range
     */
    public static Range of(final Integer start, final Integer end) {
        return new Range(start, end);
    }

    /**
     * Factory method for range of start number to end number in steps.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     * @return the range
     */
    public static Range of(final Integer start, final Integer end, final Integer step) {
        return new Range(start, end, step);
    }

    /**
     * Instantiates a new integer range.
     *
     * @param start the start
     * @param stop the stop
     */
    public IntegerRange(final Integer start, final Integer stop) {
        super();
        this.start = start;
        this.end = stop;
        this.step = new Integer(1);
    }

    /**
     * Instantiates a new integer range.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     */
    public IntegerRange(final Integer start, final Integer end, final Integer step) {
        super();
        this.start = start;
        this.end = end;
        this.step = step;
    }

    /**
     * Includes.
     *
     * @param number the number
     * @return true, if successful
     */
    public boolean includes(final Integer number) {
        return this.start <= number && number <= this.end;
    }

    /**
     * Excludes.
     *
     * @param number the number
     * @return true, if successful
     */
    public boolean excludes(final Integer number) {
        return this.start > number || number > this.end;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s .. %s]", this.getClass().getName(), this.start, this.end);
    }

}
