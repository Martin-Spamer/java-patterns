
package patterns.mvc.view;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * ViewTest class.
 */
public final class ViewTest {

    /**
     * view.
     */
    @Test
    public void testShowView() {
        final View view = new View();
        assertNotNull(view);
        view.show();
    }

}
