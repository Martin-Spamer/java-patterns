package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class CompositeTest {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeTest.class);

	@Test
	public void testComposite() {
		final Composite composite = new Composite();
		assertNotNull(composite);
		LOG.info("{}", composite);
	}

	@Test
	public void testCompositeAliceBobCharlieDan() {
		final ElementAlice alice = new ElementAlice();
		final ElementBob bob = new ElementBob();
		final ElementCharlie charlie = new ElementCharlie();
		final ElementDan dan = new ElementDan();
		final Composite composite = new Composite(alice, bob, charlie, dan);
		assertNotNull(composite);
		LOG.info("{}", composite);
	}

}
