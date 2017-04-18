package patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAdapter implements TargetInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

}