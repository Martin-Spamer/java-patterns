


package patterns.mediator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class ColleagueTest.
 */
public class ColleagueTest {

	/**
	 * Unit Test to colleague.
	 */
	@Test
	public void testColleague() {
		final Colleague colleague = new Colleague();
		assertNotNull("Value cannot be null", colleague);
	}

}
