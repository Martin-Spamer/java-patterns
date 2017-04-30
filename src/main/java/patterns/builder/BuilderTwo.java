
package patterns.builder;

/**
 * The BuilderTwo Class.
 */
public class BuilderTwo extends AbstractBuilder {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.creational.builder.AbstractBuilder#build()
	 */
	@Override
	Part build() {
		return new PartTwo();
	}

}