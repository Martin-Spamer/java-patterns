
package coaching.generics;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ObservableTest {

    @Test
    public void testObservable() {
        Observable<Object> observable = new Observable<Object>();
        assertNotNull(observable);
    }

}
