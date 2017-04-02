package polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SuperClass implements PolymorphicInterface {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public abstract void doProcess();
}
