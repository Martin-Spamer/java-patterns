
package coaching.idioms;

import java.util.Calendar;

import org.junit.Test;

/**
 * DateHelperTest Class.
 */
public class DateHelperTest {

	/**
	 * Unit Test to now.
	 */
	@Test
	public void testNow() {
		final Calendar now = DateHelper.now();
	}

	/**
	 * Unit Test to yesterday.
	 */
	@Test
	public void testYesterday() {
		final Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_YEAR, -1);
		final Calendar yesterday = DateHelper.yesterday();
	}

	/**
	 * Unit Test to tomorrow.
	 */
	@Test
	public void testTomorrow() {
		final Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_YEAR, +1);
		final Calendar tomorrow = DateHelper.tomorrow();
	}

}
