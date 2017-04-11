package patterns.command;

import java.util.Properties;

public class Invoker {

	private final CommandMap commandMap = new CommandMap();
	private final Properties properties = new Properties();

	public Invoker() {
		super();
	}

	public Invoker execute(final String targetActionName) throws Exception {
		commandMap.execute(targetActionName);
		return this;
	}

}
