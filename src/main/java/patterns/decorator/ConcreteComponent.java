package patterns.decorator;

class ConcreteComponent extends AbstractComponent {

	@Override
	public void operation() {
		this.log.info("operation");
	}

}
