
package coaching.range;

import java.util.Iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class IterableRange.
 */


@Slf4j
public class IterableRange implements Iterable<Object> {

    /** The start. */
    private final int start;

    /** The stop. */
    private final int stop;

    /** The step. */
    private final int step;

    /**
     * As array.
     *
     * @param start the start
     * @param end the end
     * @return the int[]
     */
    public static int[] asArray(final int start, final int end) {
        return asArray(start, end, 1);
    }

    /**
     * As array.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     * @return the int[]
     */
    public static int[] asArray(final int start, final int end, final int step) {
        int size = end - start;
        int[] range = new int[size + 1];
        for (int i = start; i <= size; i += step) {
            range[i - start] = i;
        }
        return range;
    }

    /**
     * Of.
     *
     * @param start the start
     * @param end the end
     * @return the iterable range
     */
    public static IterableRange of(final int start, final int end) {
        return new IterableRange(start, end);
    }

    /**
     * Of.
     *
     * @param start the start
     * @param end the end
     * @param step the step
     * @return the iterable range
     */
    public static IterableRange of(final int start, final int end, final int step) {
        return new IterableRange(start, end, step);
    }

    /**
     * Instantiates a new iterable range.
     *
     * @param start the start
     * @param stop the stop
     */
    public IterableRange(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
        this.step = 1;
    }

    /**
     * Instantiates a new iterable range.
     *
     * @param start the start
     * @param stop the stop
     * @param step the step
     */
    public IterableRange(final int start, final int stop, final int step) {
        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    /**
     * Includes.
     *
     * @param i the i
     * @return true, if successful
     */
    public boolean includes(final int i) {
        return this.start <= i && i <= this.stop;
    }

    /**
     * Excludes.
     *
     * @param i the i
     * @return true, if successful
     */
    public boolean excludes(final int i) {
        return this.start > i || i > this.stop;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int current;

            @Override
            public boolean hasNext() {
                return this.current + IterableRange.this.step <= IterableRange.this.stop;
            }

            @Override
            public Object next() {
                return null;
            }

            // @Override
            // public int next() {
            // return this.current += IterableRange.this.step;
            // }
        };
    }

    /**
     * Range.
     *
     * @param start the start
     * @param stop the stop
     * @param step the step
     * @return the iterable
     */
    public static Iterable range(final int start, final int stop, final int step) {
        if (step <= 0) {
            throw new IllegalArgumentException("step must be greate than zero!");
        }

        return new Iterable() {
            @Override
            public Iterator iterator() {
                return new Iterator() {
                    private int counter = start;

                    @Override
                    public boolean hasNext() {
                        return this.counter < stop;
                    }

                    @Override
                    public Integer next() {
                        try {
                            return this.counter;
                        } finally {
                            this.counter += step;
                        }
                    }
                };
            }
        };
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s .. %s]", this.getClass().getName(), this.start, this.stop);
    }

}
