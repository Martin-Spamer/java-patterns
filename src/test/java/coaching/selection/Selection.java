package coaching.selection;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Selection {
	private static final Logger LOG = LoggerFactory.getLogger(Selection.class);

	@Test
	public void testIf() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		}
	}

	@Test
	public void testElse() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		} else {
			LOG.info("else");
		}
	}
}
