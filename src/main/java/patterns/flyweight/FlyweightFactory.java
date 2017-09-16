
package patterns.flyweight;

import java.util.Vector;

/**
 * A factory for creating FlyWeight objects.
 */
public final class FlyweightFactory {

	private Vector<FlyWeight> flyWeight;

	/**
	 * Creates the.
	 *
	 * @return the fly weight
	 */
	public FlyWeight create() {
		return new FlyWeight("CommonState");
	}

}
