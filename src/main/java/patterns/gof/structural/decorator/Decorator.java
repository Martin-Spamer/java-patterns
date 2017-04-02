package patterns.gof.structural.decorator;

abstract class Decorator extends AbstractComponent {

	public AbstractComponent myAbstractComponent;

	@Override
	abstract public void operation();
}