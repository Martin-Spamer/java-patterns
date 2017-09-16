
package coaching.collections;

import static org.junit.Assert.assertNotNull;

import java.util.*;

/**
 * PolymorphicList Class.
 */
public class PolymorphicList {

	private final List<Integer> integerList = new LinkedList<Integer>();

	/**
	 * Integer object.
	 *
	 * @param integerIn the integer in
	 */
	public void add(final Integer integerIn) {
		integerList.add(integerIn);
	}

	/**
	 * Integer object.
	 *
	 * @return the integer
	 */
	public Integer next() {
		return integerList.iterator().next();
	}

	@Override
	public String toString() {
		return String.format("PolymorphicList [integerList=%s]", integerList);
	}

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final PolymorphicList myIntList = new PolymorphicList();

		myIntList.add(new Integer(0));
		final Integer actual = myIntList.next();
		assertNotNull(actual);

		// these unsafe type conversions wont compile
		// myIntList.add( new Double(0) ) ;
		// myIntList.add( new Object(0) ) ;
	}
}
