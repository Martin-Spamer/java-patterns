package patterns.facade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FacadeTest {

	@Test
	public void testConcreteFacadeOperation() {
		assertNotNull(new ConcreteFacade());
	}

}
