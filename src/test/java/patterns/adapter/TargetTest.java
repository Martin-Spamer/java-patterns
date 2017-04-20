package patterns.adapter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TargetTest {

	private static final Logger LOG = LoggerFactory.getLogger(TargetTest.class);

	@Test
	public void testRequest() {
		new TargetAdapter();
	}

}
