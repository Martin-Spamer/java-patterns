package patterns.builder;

public class Director {

	public AbstractBuilder[] builders;

	public void construct() {
		for (final AbstractBuilder builder : builders) {
			builder.build();
		}
	}
}
