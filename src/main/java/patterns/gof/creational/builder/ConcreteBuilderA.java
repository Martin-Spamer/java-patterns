package patterns.gof.creational.builder;

class ConcreteBuilderA extends AbstractBuilder {

	@Override
	Part build() {
		return new PartOne();
	}

}
