
package patterns.builder;

import java.util.Vector;

/**
 * The Director Class.
 */
public class Director {

	public Vector<AbstractBuilder> builders = new Vector<AbstractBuilder>();

	/**
	 * Instantiates a new director.
	 */
	public Director() {
		super();
	}

	/**
	 * Adds the.
	 *
	 * @param builder the builder
	 * @return true, if successful
	 */
	public boolean add(AbstractBuilder builder) {
		return builders.add(builder);
	}

	/**
	 * Construct.
	 */
	public void construct() {
		for (final AbstractBuilder builder : builders) {
			builder.build();
		}
	}

}
