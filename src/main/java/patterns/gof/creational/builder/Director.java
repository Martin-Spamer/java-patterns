
package patterns.gof.creational.builder;

/**
 * The Class Director.
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
