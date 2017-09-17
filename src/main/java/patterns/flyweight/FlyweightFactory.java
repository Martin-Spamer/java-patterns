
package patterns.flyweight;

import java.util.*;

/**
 * A factory for creating FlyWeight objects.
 */
public final class FlyweightFactory {

	private List<FlyWeight> list = new ArrayList<FlyWeight>();

	/**
	 * Instantiates a new flyweight factory.
	 */
	public FlyweightFactory() {
		super();
	}

	/**
	 * Creates the.
	 *
	 * @return the fly weight
	 */
	public FlyWeight create() {
		final FlyWeight flyWeight = new FlyWeight("CommonState");
		this.list.add(flyWeight);
		return flyWeight;
	}

}
