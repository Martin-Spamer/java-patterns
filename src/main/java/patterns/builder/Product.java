package patterns.builder;

/**
 * Product Class.
 */
public class Product {

	private Part partOne = null;
	private Part partTwo = null;

	public Product(final Part partOne, final Part partTwo) {
		super();
		this.partOne = partOne;
		this.partTwo = partTwo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Product [partOne=%s, partTwo=%s]", partOne, partTwo);
	}

}
