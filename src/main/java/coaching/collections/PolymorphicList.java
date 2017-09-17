
package coaching.collections;

import static org.junit.Assert.assertNotNull;

import java.util.*;

import org.slf4j.*;

/**
 * PolymorphicList Class.
 */
public class PolymorphicList {

	private static final Logger LOG = LoggerFactory.getLogger(PolymorphicList.class);

	private final List<Integer> integerList = new LinkedList<Integer>();

	/**
	 * Instantiates a new polymorphic list.
	 */
	public PolymorphicList() {
		super();
		LOG.info("PolymorphicList");
	}

	/**
	 * Integer object.
	 *
	 * @param integerIn the integer in
	 */
	public void add(final Integer integerIn) {
		this.integerList.add(integerIn);
	}

	/**
	 * Integer object.
	 *
	 * @return the integer
	 */
	public Integer next() {
		return this.integerList.iterator().next();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("PolymorphicList [integerList=%s]", this.integerList);
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
