package patterns.gof.creational.factory;

class ConcreteFactory1 extends AbstractFactory {

	public ConcreteProductB2 myConcreteProductB2;
	public ConcreteProductB1 myConcreteProductB1;

	@Override
	public AbstractProductA createProductA() {
		return null;
	}

	@Override
	public AbstractProductB createProductB() {
		return null;
	}
}