
package coaching.temp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void testStringBufferReverseExample() {
        String reversed = new StringBuffer("ABC").reverse().toString();
        assertEquals("CBA", reversed);
    }

}
