
package coaching.generics;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for Observable.
 */
public class ObservableTest {

    /**
     * Unit test to observable.
     */
    @Test
    public void testObservable() {
        final Observable<Object> observable = new Observable<Object>();
        assertNotNull(observable);
    }

}
