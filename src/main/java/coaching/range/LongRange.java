
package coaching.range;

public class LongRange {

    /** The start of the range. */
    private final long start;

    /** The end of the range */
    private final long end;

    /** The steps in the range. */
    private final long step;

    /**
     * The range as an array of real numbers.
     *
     * @param start the start
     * @param end the end
     * @return the range as an int[]
     */
    public static long[] asArray(final long start, final long end) {
        return asArray(start, end, 1L);
    }

    /**
     * The range as an array of real numbers.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     * @return the range as an int[]
     */
    public static long[] asArray(final long start, final long end, final long step) {
        return new LongRange(start, end, step).asArray();
    }

    /**
     * Factory method for range of start number to end number in steps of one.
     *
     * @param start the start
     * @param end the end
     * @return the range
     */
    public static LongRange of(final long start, final long end) {
        return new LongRange(start, end);
    }

    /**
     * Factory method for range of start number to end number in steps.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     * @return the range
     */
    public static LongRange of(final long start, final long end, final long step) {
        return new LongRange(start, end, step);
    }

    /**
     * Instantiates a new range.
     *
     * @param start the start
     * @param end the end
     */
    protected LongRange(final long start, final long end) {
        this.start = start;
        this.end = end;
        this.step = 1L;
    }

    /**
     * Instantiates a new range.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     */
    protected LongRange(final long start, final long end, final long step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    /**
     * Confirms the range includes the number.
     *
     * @param number the number to be confirmed.
     * @return true, if successful, otherwise false.
     */
    public boolean includes(final long number) {
        return this.start <= number && number <= this.end;
    }

    /**
     * Confirms the range includes the range.
     *
     * @param range the range
     * @return true, if successful, otherwise false.
     */
    public boolean includes(final LongRange range) {
        return this.start <= range.start && range.end <= this.end;
    }

    /**
     * Excludes.
     *
     * @param number the i
     * @return true, if successful, otherwise false.
     */
    public boolean excludes(final long number) {
        return this.start > number || number > this.end;
    }

    /**
     * The range as an array of real numbers.
     *
     * @param start the start
     * @param end the end
     * @return the range as an int[]
     */
    public long[] asArray() {
        int size = (int) (this.end - this.start);
        long[] range = new long[size + 1];
        for (long i = this.start; i <= size; i += this.step) {
            range[(int) (i - this.start)] = i;
        }
        return range;
    }

    /**
     * Confirms the ranges are equal.
     *
     * @param range the range
     * @return true, if successful, otherwise false.
     */
    public boolean equal(final LongRange range) {
        return this.start == range.start && range.end == this.end && range.step == this.step;
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
