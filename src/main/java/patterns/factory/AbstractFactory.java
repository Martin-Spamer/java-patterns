package patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating objects.
 */
public abstract class AbstractFactory implements FactoryInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public abstract AbstractProductA createProductA();

	@Override
	public abstract AbstractProductB createProductB();

}
