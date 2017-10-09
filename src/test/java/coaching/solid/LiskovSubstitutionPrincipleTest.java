package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LiskovSubstitutionPrincipleTest {

	@Test
	public void testLiskovSubstitutionPrinciple() {
		final LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
		assertNotNull("Value cannot be null", lsp);
	}

}
