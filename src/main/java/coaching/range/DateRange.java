
package coaching.range;

import java.util.Date;

public class DateRange {

    private final Date start;
    private final Date stop;

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

    public boolean includes(final Date date) {
        return this.start.getTime() <= date.getTime() && date.getTime() <= this.stop.getTime();
    }

}
