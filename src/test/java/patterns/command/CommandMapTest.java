package patterns.command;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CommandMapTest {

	@Test
	public void testExecute() {
		final CommandMap commandMap = new CommandMap();
		assertNotNull(commandMap);
		final String actionName = "UnitTest";
		commandMap.execute(actionName);
	}

}
