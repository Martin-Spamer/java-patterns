
package coaching.range;

import java.util.Iterator;

public class IterableRange implements Iterable {

    private final int start;
    private final int stop;
    private final int step;

    public static int[] asArray(final int start, final int end) {
        return asArray(start, end, 1);
    }

    public static int[] asArray(final int start, final int end, final int step) {
        int size = end - start;
        int[] range = new int[size + 1];
        for (int i = start; i <= size; i += step) {
            range[i - start] = i;
        }
        return range;
    }

    public static IterableRange of(final int start, final int end) {
        return new IterableRange(start, end);
    }

    public static IterableRange of(final int start, final int end, final int step) {
        return new IterableRange(start, end, step);
    }

    public IterableRange(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
        this.step = 1;
    }

    public IterableRange(final int start, final int stop, final int step) {
        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    public boolean includes(final int i) {
        return this.start <= i && i <= this.stop;
    }

    public boolean excludes(final int i) {
        return this.start > i || i > this.stop;
    }

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
