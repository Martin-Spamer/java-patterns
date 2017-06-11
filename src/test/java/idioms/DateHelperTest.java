package idioms;

import java.util.Calendar;

import org.junit.Test;

public class DateHelperTest {

	@Test
	public void testNow() {
		DateHelper.now();
	}

	@Test
	public void testYesterday() {
		final Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_YEAR, -1);
	}

	@Test
	public void testTomorrow() {
		final Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_YEAR, +1);
	}

}
