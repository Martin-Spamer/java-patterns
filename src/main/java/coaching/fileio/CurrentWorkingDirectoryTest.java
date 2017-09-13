package coaching.fileio;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CurrentWorkingDirectoryTest {

	@Test
	public void testCurrentWorkingDirectory() {
		final CurrentWorkingDirectory cwd = new CurrentWorkingDirectory();
		assertNotNull(cwd);
	}

}
