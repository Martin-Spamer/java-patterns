package patterns.decorator;

abstract class Decorator extends AbstractComponent {

	public AbstractComponent astractComponent;

	@Override
	abstract public void operation();

}
