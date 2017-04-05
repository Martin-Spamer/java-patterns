
package patterns.gof.creational.builder;

/**
 * The Director Class.
 */
public class Director {

	/** The builders. */
	public AbstractBuilder[] builders;

	/**
	 * Construct.
	 */
	public void construct() {
		for (final AbstractBuilder builder : builders) {
			builder.build();
		}
	}
}
