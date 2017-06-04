package javamentor.tuples;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import javamentor.tuples.Triple;

public class TripleTest {

	public class Space extends Triple<Float, Float, Float> {
		public Space() {
			super();
		}

		public Space(Float x, Float y, Float z) {
			super(x, y, z);
		}
	}

	@Test
	public void testSpace() {
		final Space space = new Space();
		assertNotNull(space);
	}

	@Test
	public void testCreate() {
		Triple.create();
	}

	@Test
	public void testTripleXYZ() {
		final Triple<Float, Float, Float> triple = new Triple<Float, Float, Float>();
		assertNotNull(triple);
	}

}
