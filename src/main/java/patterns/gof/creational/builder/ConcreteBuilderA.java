
package patterns.gof.creational.builder;

/**
 * The Class ConcreteBuilderA.
 */
class ConcreteBuilderA extends AbstractBuilder {

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
