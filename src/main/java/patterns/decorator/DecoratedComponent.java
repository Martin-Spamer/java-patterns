package patterns.decorator;

class DecoratedComponent extends AbstractComponent {

	@Override
	public void operation() {
		this.log.info("{}.operation", this.getClass().getSimpleName());
	}

}
