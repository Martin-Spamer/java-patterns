
package patterns.gof.creational.builder;

/**
 * The ConcreteBuilderB Class.
 */
class ConcreteBuilderB extends AbstractBuilder {

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