
package patterns.gof.creational.builder;

/**
 * The Class ConcreteBuilderB.
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