
package coaching.range;

import lombok.extern.slf4j.Slf4j;

/**
 * A Range class.
 */


@Slf4j
public class Range {

    /** The start of the range. */
    private final int start;

    /** The end of the range. */
    private final int end;

    /** The steps in the range. */
    private final int step;

    /**
     * The range as an array of real numbers.
     *
     *
     * @param start the start
     * @param end the end
     * @return the range as an int[]
     */
    public static int[] asArray(final int start, final int end) {
        return asArray(start, end, 1);
    }

    /**
     * The range as an array of real numbers.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     * @return the range as an int[]
     */
    public static int[] asArray(final int start, final int end, final int step) {
        return new Range(start, end, step).asArray();
    }

    /**
     * Factory method for range of start number to end number in steps of one.
     *
     * @param start the start
     * @param end the end
     * @return the range
     */
    public static Range of(final int start, final int end) {
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
    public static Range of(final int start, final int end, final int step) {
        return new Range(start, end, step);
    }

    /**
     * Instantiates a new range.
     *
     * @param start the start
     * @param end the end
     */
    protected Range(final int start, final int end) {
        this.start = start;
        this.end = end;
        this.step = 1;
    }

    /**
     * Instantiates a new range.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     */
    protected Range(final int start, final int end, final int step) {
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
    public boolean includes(final int number) {
        return this.start <= number && number <= this.end;
    }

    /**
     * Confirms the range includes the range.
     *
     * @param range the range
     * @return true, if successful, otherwise false.
     */
    public boolean includes(final Range range) {
        return this.start <= range.start && range.end <= this.end;
    }

    /**
     * Excludes.
     *
     * @param i the i
     * @return true, if successful, otherwise false.
     */
    public boolean excludes(final int i) {
        return this.start > i || i > this.end;
    }

    /**
     * The range as an array of real numbers.
     *
     * @return the range as an int[]
     */
    public int[] asArray() {
        int size = this.end - this.start;
        int[] range = new int[size + 1];
        for (int i = this.start; i <= size; i += this.step) {
            range[i - this.start] = i;
        }
        return range;
    }

    /**
     * Confirms the ranges are equal.
     *
     * @param range the range
     * @return true, if successful, otherwise false.
     */
    public boolean equal(final Range range) {
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
