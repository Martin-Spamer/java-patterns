package patterns.gof.creational.factory;

class ConcreteFactory2 extends AbstractFactory {

	public ConcreteProductA1 myConcreteProductA1;
	public ConcreteProductA2 myConcreteProductA2;

	@Override
	public AbstractProductA createProductA() {
		return null;
	}

	@Override
	public AbstractProductB createProductB() {
		return null;
	}
}