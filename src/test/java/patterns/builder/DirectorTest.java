package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DirectorTest {

	@Test
	public void testDirector() {
		final Director director = new Director();

		final BuilderOne builderOne = new BuilderOne();
		assertNotNull(builderOne);
		director.add(builderOne);

		final BuilderTwo builderTwo = new BuilderTwo();
		assertNotNull(builderTwo);
		director.add(builderTwo);

		final Product product = director.constructProduct();
		assertNotNull(product);

	}

}
