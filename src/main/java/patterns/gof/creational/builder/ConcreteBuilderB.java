package patterns.gof.creational.builder;

class ConcreteBuilderB extends AbstractBuilder {

	@Override
	Part build() {
		return new PartTwo();
	}

}