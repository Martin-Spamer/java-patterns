
package patterns.mediator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * class ColleagueTest.
 */
public final class ColleagueTest {

    /**
     * Unit Test to colleague.
     */
    @Test
    public void testColleague() {
        final Colleague colleague = new Colleague();
        assertNotNull(colleague);
    }

}
