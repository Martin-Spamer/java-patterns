package coaching.fileio;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class CurrentWorkingDirectoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(CurrentWorkingDirectoryTest.class);

	@Test
	public void testCurrentWorkingDirectory() {
		LOG.info("testCurrentWorkingDirectory");
		final CurrentWorkingDirectory cwd = new CurrentWorkingDirectory();
		assertNotNull("Value cannot be null",cwd);
	}

}
