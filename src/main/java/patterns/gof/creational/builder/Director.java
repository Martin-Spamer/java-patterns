package patterns.gof.creational.builder;

public class Director {

	public AbstractBuilder[] builders;

	public void construct() {
		for (final AbstractBuilder builder : this.builders) {
			builder.build();
		}
	}
}
