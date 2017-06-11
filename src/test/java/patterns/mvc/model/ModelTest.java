package patterns.mvc.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ModelTest {
	@Test
	public void test() {
		final Model model = new Model();
		assertNotNull(model);
	}
}
