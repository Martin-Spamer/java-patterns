package javamentor.tuples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import javamentor.tuples.Tuple;
import javamentor.tuples.TupleInterface;

public class TupleTest {

	public class Point extends Tuple<Float, Float> {
	}

	@Test
	public void testPoint() {
		final Point point = new Point();
		assertNotNull(point);
	}

	@Test
	public void testObjectTuple() {
		final Tuple<Object, Object> tuple = new Tuple<Object, Object>();
		assertNotNull(tuple);
	}

	@Test
	public void testFloatTuple() {
		final Tuple<Float, Float> tuple = new Tuple<Float, Float>();
		assertNotNull(tuple);
	}

	@Test
	public void testStringTuple() {
		final Tuple<String, String> tuple = new Tuple<String, String>();
		assertNotNull(tuple);
	}

	/** The Constant RIGHT. */
	private static final String RIGHT = "Right";

	/** The Constant LEFT. */
	private static final String LEFT = "Left";

	/**
	 * Test tuple.
	 */
	@Test
	public void testTuple() {
		final TupleInterface<String, String> tuple = new Tuple<String, String>();
		assertNotNull(tuple);
		tuple.setLeft(LEFT);
		tuple.setRight(RIGHT);
		assertEquals(LEFT, tuple.getLeft());
		assertEquals(RIGHT, tuple.getRight());
	}

	/**
	 * Test tuple LR.
	 */
	@Test
	public void testTupleLR() {
		final TupleInterface<String, String> tuple = new Tuple<String, String>(LEFT, RIGHT);
		assertNotNull(tuple);
		assertEquals(LEFT, tuple.getLeft());
		assertEquals(RIGHT, tuple.getRight());
	}

}
