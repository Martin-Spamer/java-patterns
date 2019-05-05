
package coaching.range;

import java.util.Date;

/**
 * The DateRange.
 */
public class DateRange {

    /** The start. */
    private final Date start;

    /** The stop. */
    private final Date stop;

    /**
     * Instantiates a new date range.
     *
     * @param start the start
     * @param stop the stop
     */
    public DateRange(final Date start, final Date stop) {
        super();
        this.start = start;
        this.stop = stop;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s .. %s]", this.getClass().getName(), this.start, this.stop);
    }

    /**
     * Includes.
     *
     * @param date the date
     * @return true, if successful
     */
    public boolean includes(final Date date) {
        return this.start.getTime() <= date.getTime() && date.getTime() <= this.stop.getTime();
    }

}
