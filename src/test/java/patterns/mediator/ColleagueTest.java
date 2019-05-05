
package patterns.mediator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class ColleagueTest.
 */


@Slf4j
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
