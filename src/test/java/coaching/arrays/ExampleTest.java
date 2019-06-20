
package coaching.arrays;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import lombok.extern.slf4j.Slf4j;

/** The Constant log. */
@Slf4j
public class ExampleTest {

    /**
     * test Example object.
     */
    @Test
    public void testDeepToString() {
        int[][] array = new int[][] { { 1 }, { 2 }, { 4 } };
        String deepToString = Arrays.deepToString(array);
        assertEquals("[[1], [2], [4]]", deepToString);
        log.info(deepToString);

        array = new int[][] { { 1 }, { 2, 3 } };
        deepToString = Arrays.deepToString(array);
        assertEquals("[[1], [2, 3]]", deepToString);
        log.info(deepToString);

        array = new int[][] {};
        deepToString = Arrays.deepToString(array);
        assertEquals("[]", deepToString);
        log.info(deepToString);

        array = new int[][] { { 5, 3 }, { 1 }, { -1, 1 } };
        deepToString = Arrays.deepToString(array);
        assertEquals("[[5, 3], [1], [-1, 1]]", deepToString);
        log.info(deepToString);
    }

}
