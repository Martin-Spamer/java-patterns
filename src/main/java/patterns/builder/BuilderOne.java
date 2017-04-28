package patterns.builder;

/**
 * The ConcreteBuilderA Class.
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
