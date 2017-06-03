package idioms.bags;

public interface BagInterface {

	/**
	 * Fill.
	 *
	 * @param values the values
	 * @return the bag
	 */
	BagInterface fill(String... values);

	/**
	 * Choose from bag.
	 *
	 * @return the string
	 */
	String choose();

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	boolean add(String e);

	/**
	 * Reset.
	 *
	 * @return the bag
	 */
	BagInterface reset();

}