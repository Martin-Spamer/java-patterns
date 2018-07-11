package coaching;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooTest {

    private static final Logger LOG = LoggerFactory.getLogger(FooTest.class);

    @Test
    public void test() {
        LOG.info(Thread.currentThread().getContextClassLoader().toString());
        LOG.info(this.getClass().getClassLoader().toString());
    }

}
