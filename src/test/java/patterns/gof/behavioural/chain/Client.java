package patterns.gof.behavioural.chain;

import org.junit.Test;

/**
 * The Client Class.
 */
public class Client {

	@Test
	public void test() {
		new FirstHandler(new SecondHandler(null));
	}

}