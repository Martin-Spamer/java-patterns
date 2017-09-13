package patterns.transaction;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConcreteParticipantTest {

	@Test
	public void testCommit() {
		assertNotNull(new ConcreteParticipant());
	}

}
