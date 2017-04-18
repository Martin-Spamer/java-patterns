package patterns.builder;

/**
 * The ConcreteBuilderB Class.
 */
class BuilderB extends AbstractBuilder {

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