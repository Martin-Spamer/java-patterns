
package coaching.idioms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DedupeTest {

    private static final Logger LOG = LoggerFactory.getLogger(DedupeTest.class);

    @Test
    public void test() {
        final Integer[] withDups = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0, 0 };
        final List<Integer> asList = Arrays.asList(withDups);
        final Set<Integer> withoutDups = new HashSet<Integer>(asList);
        LOG.info("{}", withoutDups);
    }

}
