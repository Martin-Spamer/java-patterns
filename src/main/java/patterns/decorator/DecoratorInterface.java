package patterns.decorator;

public interface DecoratorInterface {

	public void attachBefore(AbstractComponent behaviour);

	public void detachBefore(AbstractComponent behaviour);

	public void attachAfter(AbstractComponent behaviour);

	public void detachAfter(AbstractComponent behaviour);

}
