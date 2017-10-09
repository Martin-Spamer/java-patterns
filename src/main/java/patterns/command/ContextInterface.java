package patterns.command;

import java.util.Properties;

public interface ContextInterface {

	public ContextInterface setProperties(Properties properties);

	public Properties getProperties();

}
