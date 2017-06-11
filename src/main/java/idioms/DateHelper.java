package idioms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateHelper {

	private static final Logger LOG = LoggerFactory.getLogger(DateHelper.class);
	private static final String ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_FORMAT);

	public static Calendar now() {
		final Calendar now = Calendar.getInstance();
		return now;
	}

	public static Calendar yesterday() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		return calendar;
	}

	public static Calendar tomorrow() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, +1);
		return calendar;
	}

	public static Calendar lastWeek() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.WEEK_OF_YEAR, -1);
		return calendar;
	}

	public static Calendar nextWeek() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.WEEK_OF_YEAR, +1);
		return calendar;
	}

	public static Calendar lastMonth() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		return calendar;
	}

	public static Calendar nextMonth() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, +1);
		return calendar;
	}

	public static Calendar lastYear() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -1);
		return calendar;
	}

	public static Calendar nextYear() {
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, +1);
		return calendar;
	}

	/** Transform Calendar to ISO 8601 string. */
	public static String fromCalendar(final Calendar calendar) {
		final Date date = calendar.getTime();
		return simpleDateFormat.format(date);
	}

	/** Transform ISO 8601 string to Calendar. */
	public static Calendar toCalendar(final String iso8601string) throws ParseException {
		final Date date = simpleDateFormat.parse(iso8601string);
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
}
