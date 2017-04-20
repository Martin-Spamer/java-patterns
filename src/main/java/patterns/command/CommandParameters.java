package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CommandParameters implements ParametersInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

}
