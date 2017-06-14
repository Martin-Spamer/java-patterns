
package patterns.builder;

/**
 * BuilderOne Class.
 */
public class BuilderOne extends AbstractBuilder {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.creational.builder.AbstractBuilder#build()
	 */
	@Override
	Part build() {
		return new PartOne();
	}

}
